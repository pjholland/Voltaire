package com.skrill.pages;
import com.skrill.aapium_driver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;


public class login_app extends aapium_driver {


    By login_button = By.id("com.bt.bms:id/btnLogin");


    public void login_in_to_app() throws Throwable {

        GetDriver().findElement(login_button).click();
    }




}
