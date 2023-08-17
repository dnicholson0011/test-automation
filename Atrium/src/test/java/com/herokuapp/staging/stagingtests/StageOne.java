package com.herokuapp.staging.stagingtests;

import com.herokuapp.staging.stagingpage.StagingPage;
import com.herokuapp.staging.base.BaseTest;
import org.testng.annotations.Test;

public class StageOne extends BaseTest {

    @Test
    public void smokeTest() {

        stagingPage = new StagingPage("Hello World");
    }

    @Test
    public void testOne() {

        stagingPage.testMethod();
    }
}
