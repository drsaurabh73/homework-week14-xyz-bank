package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }
    //  Transaction
@FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]")
    WebElement transactions;
    public void setTransactions() {
        Reporter.log("Clicking on Transaction "+ transactions.toString()+ "<br>");
        clickOnElement(transactions);
    }
    // deposit
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement deposit;
    public void setDeposit() {
        Reporter.log("Clicking on setDeposit "+ deposit.toString()+ "<br>");
        clickOnElement(deposit);
    }
    // Withdraw
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withdraw;
    public void setWithdraw() {
        Reporter.log("Clicking on Withdraw "+ withdraw.toString()+ "<br>");
        clickOnElement(withdraw);
    }
// amount to be deposited
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amountdeposit;
    public void setAmountdeposit(String text) {
        Reporter.log("Enter amountdeposited "+text+ " to amount deposited "+amountdeposit.toString() + "<br>");
        sendTextToElement(amountdeposit,text);
    }
    // click on deposit
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement clickdeposit;
    public void setClickdeposit() {
        Reporter.log("Clicking on deposit" + clickdeposit.toString()+ "<br>");
        clickOnElement(clickdeposit);
    }
    // verify the text deposit successful
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositsuccessful;
    public String verifyTextDepositSusseccsful() {
        Reporter.log("getting deposited amount  successful text from "+depositsuccessful.toString()+"<br>");
        return getTextFromElement(depositsuccessful);
    }
    // amout to be withdrawn
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amountwithdraw;
    public void setAmountwithdraw(String text) {
        Reporter.log("Enter Amount withdrawn "+text+ " to amount field "+amountwithdraw.toString() + "<br>");
        sendTextToElement(amountwithdraw,text);
    }

    // click on withdraw
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement clcikwithdraw;
    public void clickOnWithdraw() {
        Reporter.log("Clicking on withdraw "+ clcikwithdraw.toString()+ "<br>");
        clickOnElement(clcikwithdraw);
    }
    // verify Transaction successful
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement transactionsuccessful;
    public String verifyTextTransactionsuccessful() {
        Reporter.log("getting signout text from "+transactionsuccessful.toString()+"<br>");

        return getTextFromElement(transactionsuccessful);
    }


}
