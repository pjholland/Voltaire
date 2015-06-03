package com.skrill.step_definiitons;

import com.skrill.pages.login_app;
import com.skrill.aapium_driver;
import cucumber.api.java.en.Given;

public class login_app_step {

    private login_app login;

    @Given("^I log onto the book a table app$")
    public void I_log_onto_the_book_a_table_app() throws Throwable {
        login = new login_app();
        login.login_in_to_app();
    }



}
