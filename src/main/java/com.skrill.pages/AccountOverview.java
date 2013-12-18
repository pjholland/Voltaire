package com.skrill.pages;

import org.openqa.selenium.By;


public class AccountOverview extends BasePage {


///////////////////////// Page Elements/////////////////////////////////////////

    By transactions_list = By.id("last_transactions");
    public String VIP_MEMBERSBOX = "vip-members";
    public String all_transactions_button = "/html/body/div[3]/div[2]/nav/div/div/ul/li[2]/a/span";
    public String skrill_card_button = "/html/body/div[3]/div[2]/nav/div/div/ul/li[4]/a/span";
    public String settings_button = "/html/body/div[3]/div[2]/nav/div/div/ul/li[5]/a/span";


/////////////////////// Methods////////////////////////////////////////////////

    public void transaction_list_is_visible() {
        getDriver().findElement(transactions_list).isDisplayed();

    }

}