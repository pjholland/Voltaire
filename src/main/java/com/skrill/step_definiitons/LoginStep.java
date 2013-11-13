package com.skrill.step_definiitons;

import com.skrill.pages.BasePage;
import com.skrill.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class LoginStep extends BasePage {

    protected String standard_user_mail_INT    = "auto_customer_bul_pqeulokwtv@sun-fish.com";
    protected String standard_user_pass_INT    = "auto_customer_bul_pqeulokwtv@sun-fish.com123";

    protected String VIP_user_mail_INT         = "devnull.bguspwdkhy@sun-fish.com";
    protected String VIP_user_pass_INT         = "devnull.bguspwdkhy@sun-fish.com123";

    private LoginPage loginpage;

    @Given("^I am on the skrill login page$")
    public void I_am_on_the_skrill_login_page() throws Throwable {
        loginpage = new LoginPage();
        loginpage.open();
        Thread.sleep(2000);

    }

    @And("^I enter my credentials$")
    public void I_enter_my_credentials() throws Throwable {
        loginpage.type_username(standard_user_mail_INT);
        loginpage.type_password(standard_user_pass_INT);
        Thread.sleep(2000);

    }

    @When("^I click the submit button$")
    public void I_click_the_submit_buton() throws Throwable {
        loginpage.submit_details();
        Thread.sleep(2000);

    }

    @When("^the user logs out$")
    public void the_user_logs_out() throws Throwable {
        loginpage.logout();
        Thread.sleep(2000);

    }

    @When("^I log in as as a \"([^\"]*)\"$")
    public void I_log_in_as_as_a(String user_type) throws Throwable {
        if (user_type == "referral user")
            Thread.sleep(1000);
        loginpage.log_in_as_referrer();
        Thread.sleep(1000);

    }

    @When("^I enter my details as a \"([^\"]*)\" customer$")
    public void I_enter_my_details_as_a_customer(String customer_type) throws Throwable {
        if (customer_type == "VIP")
            Thread.sleep(1000);
            loginpage.type_username(VIP_user_mail_INT);
            loginpage.type_password(VIP_user_pass_INT);
            Thread.sleep(1000);
            loginpage.submit_details();
        Thread.sleep(10000);
    }


}

