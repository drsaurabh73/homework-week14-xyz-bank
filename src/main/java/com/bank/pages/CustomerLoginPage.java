package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }
// enter your name
    @FindBy(xpath = "//select[@name='userSelect']")
    WebElement yourname;
    public void setYourname(String text) {
        Reporter.log("Selecting your name "+text+" from dropdown "+yourname.toString() + "<br>");
        selectByVisibleTextFromDropDown(yourname,text);
    }
    // login
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement login;

    public void setLogin() {
        Reporter.log("Clicking on login Button "+ login.toString()+ "<br>");
        clickOnElement(login);
    }
    //log out
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logout;

    public String verifyLogoutText() {
        Reporter.log("getting logout text from "+logout.toString()+"<br>");
        return getTextFromElement(logout);
    }

    public void setLogout() {
        Reporter.log("Clicking on Logout Button "+ logout.toString()+ "<br>");
        clickOnElement(logout);
    }
}
