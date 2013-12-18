package com.skrill.step_definiitons;

import com.skrill.pages.AccountOverview;
import com.skrill.pages.BasePage;
import cucumber.api.java.en.Then;


public class AccountOverviewStep extends BasePage {

    private AccountOverview account_overview;

    @Then("^I should see the Account Overview page$")
    public void I_should_see_the_Account_Overview_page() throws Throwable {
        account_overview = new AccountOverview();
        account_overview.transaction_list_is_visible();
        Thread.sleep(1000);
    }

    @Then("^the vip members box should be displayed$")
    public void the_vip_members_box_should_be_displayed() throws Exception {
        account_overview.checkElementDisplayed(Locators.id, account_overview.VIP_MEMBERSBOX);
    }

    @Then("^all the elements of the page should be visible$")
    public void all_the_elements_of_the_page_should_be_visible() throws Throwable {

    }

}