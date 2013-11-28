package com.skrill.step_definiitons;

import com.skrill.pages.Sendmoney;
import cucumber.api.java.en.When;

public class Sendmoneystep {

    private Sendmoney sendmoney;

    @When("^the customer sends money$")
    public void the_customer_sends_money() throws Throwable {
         sendmoney = new Sendmoney();
         sendmoney.sendSomeMoney();


    }
}
