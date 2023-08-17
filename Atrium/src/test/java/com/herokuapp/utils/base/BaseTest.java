package com.herokuapp.utils.base;

import com.herokuapp.pages.homepage.TheInternetPage;
import com.herokuapp.utils.browserdriverfactory.BrowserDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
    private WebDriver driver;
    protected BrowserDriverFactory factory;
    protected Logger log; /*import org.apache.logging.log4j.Logger;*/
    protected TheInternetPage theInternetPage;

    @BeforeClass(alwaysRun = true) /*prevent group annotation from bypassing*/
    @Parameters({"HomePageUrl", "browser"})
    public void setUp(String HomePageUrl, String browser, ITestContext ctx) {

        String testName = ctx.getCurrentXmlTest().getName();
        log = LogManager.getLogger(testName + " " + Thread.currentThread().getId()); /*must be instantiated before the below BrowserDriverFactory constructor or else this.log will be null */

        factory = new BrowserDriverFactory(browser, log);
        driver = factory.createDriver();

        theInternetPage = new TheInternetPage(driver);
        driver.manage().window().maximize();

        driver.get(HomePageUrl);
    }

    @AfterClass(alwaysRun = true) /*prevent group annotation from bypassing*/
    public void tearDown() {

        driver.quit();
    }
}
