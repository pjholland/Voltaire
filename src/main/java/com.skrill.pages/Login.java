package com.skrill.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login extends BasePage {


///////////////////////////Page Elements/////////////////////////////////////////////////////

    By user_name = By.id("user_authentication_email");
    By password = By.id("user_authentication_password");
    By submit_button = By.xpath("/html/body/div[3]/div[2]/div[3]/div/form/div[3]/input");
    By logout_button = By.linkText("Logout");


//////////////////////Methods/////////////////////////////////////////////////////////////

    public void open() {
        //getDriver().get("https://my-integr.dev.moneybookers.net/login");
        getDriver().get("https://my-stage.dev.moneybookers.net/login");
    }

    public void type_username (String username)throws Throwable{
        WebElement userName = getDriver().findElement(user_name);
        userName.sendKeys(username);

    }

    public void type_password (String secret_word)throws Throwable{
        WebElement Password = getDriver().findElement(password);
        Password.sendKeys(secret_word);
    }

    public void submit_details() throws Throwable {
        WebElement SignInButton = getDriver().findElement(submit_button);
        wait(1);
        SignInButton.click();
    }

    public void logout() throws Throwable {
        WebElement LogOutButton = getDriver().findElement(logout_button);
        LogOutButton.click();
        Thread.sleep(1000);
    }

}

