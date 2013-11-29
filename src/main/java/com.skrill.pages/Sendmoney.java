package com.skrill.pages;

public class Sendmoney extends BasePage {

  //////////////////////////Page Elements//////////////////////////////

 ///////////////////////SEnd Money Enter Details///////////////////////

    public String Send_Money_button = "send_money";
    public String recipientEmail    = "money_transfer_recipient_email";
    public String amountToSend      = "money_transfer_amount";
    public String reviewButton      = "review";

 ///////////////////////Send Money Review /////////////////////////////

    public String birth_month        = "money_transfer_birth_date_2i";
    public String birth_day          = "money_transfer_birth_date_3i";
    public String birth_year         = "money_transfer_birth_date_1i";



    public void sendSomeMoney() throws Exception {
       click(Locators.id, Send_Money_button);
       Thread.sleep(1000);
       type(Locators.id,  recipientEmail, "devnull.sfssf@sunfish.com" );
       type(Locators.id,  amountToSend, "10.000");
       click(Locators.id, reviewButton);
       Thread.sleep(2000);
       selectFromDropdownlist(Locators.id,birth_month, "January");
       selectFromDropdownlist(Locators.id,birth_day,  "8");
       selectFromDropdownlist(Locators.id,birth_year, "1961");
       Thread.sleep(2000);
    }




}