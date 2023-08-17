package com.herokuapp.pages.homepage;

import com.herokuapp.pages.javascriptalerts.JavaScriptAlertsPage;
import com.herokuapp.pages.multiplewindows.MultipleWindowsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TheInternetPage {

    private WebDriver driver;
    private By multipleWindowsPage = By.cssSelector("a[href='/windows']");
    private By javaScriptAlertsPage = By.cssSelector("a[href='/javascript_alerts']");

    public TheInternetPage(WebDriver driver) {
        this.driver = driver;
    }

    public MultipleWindowsPage multipleWindowsPage() {
        driver.findElement(multipleWindowsPage).click();
        return new MultipleWindowsPage(driver);
    }

    public JavaScriptAlertsPage javaScriptAlertsPage() {
        driver.findElement(javaScriptAlertsPage).click();
        return new JavaScriptAlertsPage(driver);
    }
}
