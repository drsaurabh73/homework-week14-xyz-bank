package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    //add customer
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addcustomer;
    public void clickOnAddCustomer() {
        Reporter.log("Clicking on Add Customer "+ addcustomer.toString()+ "<br>");
        clickOnElement(addcustomer);
    }
    // open account
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openaccount;
    public void setOpenaccount() {
        Reporter.log("Clicking on Open Account "+ openaccount.toString()+ "<br>");
        clickOnElement(openaccount);
    }
    // customer
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customer;
    public void setCustomer(){
        Reporter.log("Clicking on Customer Button "+ customer.toString()+ "<br>");
        clickOnElement(customer);
    }

}
