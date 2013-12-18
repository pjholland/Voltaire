package com.skrill.step_definiitons;

import com.skrill.pages.BasePage;
import com.skrill.pages.Login;
import com.skrill.users;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class LoginStep extends BasePage {

    private Login loginpage;

    @Given("^I am on the skrill login page$")
    public void I_am_on_the_skrill_login_page() throws Throwable {
        loginpage = new Login();
        loginpage.open();

    }

    @When("^I click the submit button$")
    public void I_click_the_submit_buton() throws Throwable {
        loginpage.submit_details();

    }

    @When("^the user logs out$")
    public void the_user_logs_out() throws Throwable {
        loginpage.logout();

    }

    @When("^I enter my details as a \"([^\"]*)\" customer$")
    public void I_enter_my_details_as_a_customer(String customer_type) throws Throwable {
        if (customer_type.equals("Send Money")) {
            waitForPageFullyLoaded(3);
            loginpage.type_username(users.sendMoneyUserName);
            loginpage.type_password(users.sendMoneyUserPassword);
            loginpage.submit_details();
        }

        if (customer_type.equals("VIP")) {
            waitForPageFullyLoaded(3);
            loginpage.type_username(users.vipUserName);
            loginpage.type_password(users.vipUserPassword);
            loginpage.submit_details();
        }
        if (customer_type == "Standard User") {
            waitForPageFullyLoaded(3);
            loginpage.type_username(users.standardUserName);
            loginpage.type_password(users.sendMoneyUserPassword);
            loginpage.submit_details();
        }

    }


}

