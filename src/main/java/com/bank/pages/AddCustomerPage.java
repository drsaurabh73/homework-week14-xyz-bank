package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }
// enter first name
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstname;
        public void setFirstname(String text) {
        sendTextToElement(firstname,text);
        }
        //last name
        @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastname;
        public void setLastname(String text) {
            sendTextToElement(lastname,text);
        }
        // post code
        @FindBy(xpath = "//input[@placeholder='Post Code']" )
    WebElement postcode;
        public void setPostcode(String text) {
            sendTextToElement(postcode,text);
        }
        // click on add customer
        @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement clickaddcustomer;
        public void setClickaddcustomer(){
            clickOnElement(clickaddcustomer);
        }

        public void setAcceptaleart() {
            acceptAlert();
        }
        public String getAleartMessage() {
            return getTextFromAlert();
        }








}
