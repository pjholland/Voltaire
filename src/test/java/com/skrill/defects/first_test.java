package com.skrill.defects;


import com.skrill.pages.BasePage;
import com.skrill.pages.*;
import org.junit.After;
import org.junit.Test;

public class first_test  extends BasePage{

    @After

    public void ShutdownBrowser() {
        getDriver().close();
    }

    @Test
    public void first_test() throws Throwable {

        Login login = new Login();

        login.open();





    }
}
