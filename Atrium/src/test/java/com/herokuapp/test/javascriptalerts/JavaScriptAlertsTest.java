package com.herokuapp.test.javascriptalerts;

import com.herokuapp.pages.javascriptalerts.JavaScriptAlertsPage;
import com.herokuapp.utils.testutilities.TestUtilities;
import org.testng.annotations.Test;

public class JavaScriptAlertsTest extends TestUtilities {

    @Test
    public void javaScriptAlertTest() {

        log.info("Opening JavaScriptAlerts Page");
        JavaScriptAlertsPage page =  theInternetPage.javaScriptAlertsPage();
    }
}
