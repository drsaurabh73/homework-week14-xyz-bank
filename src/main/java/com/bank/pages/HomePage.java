package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    // click on home button
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homebutton;
    public void clickOnHomeButton() {
        clickOnElement(homebutton);
    }

    // click customer login
@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerlogin;
    public void setCustomerlogin(){

        Reporter.log("Clicking on Customer Login "+ customerlogin.toString()+ "<br>");
        clickOnElement(customerlogin);
    }
    // click on Bank Manager Login
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankmanagerlogin;
    public void setBankmanagerlogin(){

        Reporter.log("Clicking on Bank Manager Login"+ bankmanagerlogin.toString()+ "<br>");
        clickOnElement(bankmanagerlogin);
    }




}
