package com.herokuapp.test.multiplewindows;

import com.herokuapp.pages.multiplewindows.MultipleWindowsPage;
import com.herokuapp.utils.testutilities.TestUtilities;
import org.testng.annotations.Test;

public class MultipleWindowsTest extends TestUtilities {

    @Test
    public void multipleWindowTests () {

        log.info("Opening MulitpleWindows Page");
        MultipleWindowsPage page = theInternetPage.multipleWindowsPage();
    }
}
