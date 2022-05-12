package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }
// find customer name
@FindBy(xpath = "//select[@id='userSelect']")
    WebElement customename;
    public void findCustomerName(String text1){
        Reporter.log("Selecting name from "+text1+" from dropdown "+customename.toString() + "<br>");
        selectByVisibleTextFromDropDown(customename,text1);
    }
// select Currency
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;
    public void setCurrency(String text){
        Reporter.log("Selecting Currency "+text +" from dropdown "+currency.toString() + "<br>");
        selectByVisibleTextFromDropDown(currency,text);
    }
    // click on Process
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement process;
    public void clickOnProcess(){
        Reporter.log("Clicking on procress "+ process.toString()+ "<br>");
        clickOnElement(process);
    }
public String verifyAccountaddedSuccessful() {
        return getTextFromAlert();
}

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;
    public void selectSearchedCustomer(String customer) {
        Reporter.log("Selecting Currency "+ customer +" from dropdown "+searchCustomer.toString() + "<br>");
        selectByVisibleTextFromDropDown(searchCustomer, customer);
    }

}
