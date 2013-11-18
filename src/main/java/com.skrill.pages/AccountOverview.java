package com.skrill.pages;

import org.openqa.selenium.By;


public class AccountOverview extends BasePage {


///////////////////////// Page Elements/////////////////////////////////////////

    By transactions_list = By.id("last_transactions") ;
    public String VIP_MEMBERSBOX  = "vip-members";


/////////////////////// Methods////////////////////////////////////////////////

    public void transaction_list_is_visible(){
        getDriver().findElement(transactions_list).isDisplayed();

    }


}