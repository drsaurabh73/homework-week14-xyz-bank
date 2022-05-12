package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BankTest extends TestBase {

    HomePage homePage;
    CustomerLoginPage customerLoginPage;
    AccountPage accountPage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomersPage customersPage;
    OpenAccountPage openAccountPage;
    AddCustomerPage addCustomerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        customerLoginPage = new CustomerLoginPage();
        accountPage = new AccountPage();
        customersPage = new CustomersPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        accountPage = new AccountPage();
        addCustomerPage = new AddCustomerPage();
    }
    @Test(groups = {"sanity",  "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.setBankmanagerlogin();
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.setClickaddcustomer();
        addCustomerPage.setFirstname("Ron");
        addCustomerPage.setLastname("Weasly");
        addCustomerPage.setPostcode("225566");
        addCustomerPage.setClickaddcustomer();

        switchToAlert();
        softAssert.assertEquals(addCustomerPage.getAleartMessage().substring(0, 27), "Customer added successfully", "");
        addCustomerPage.setAcceptaleart();
        softAssert.assertAll();
        homePage.clickOnHomeButton();

    }

    @Test(groups = {"sanity",  "smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {

        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnHomeButton();
        homePage.setBankmanagerlogin();
        bankManagerLoginPage.setOpenaccount();
        openAccountPage.selectSearchedCustomer("Ron Weasly");
        openAccountPage.setCurrency("Pound");
        openAccountPage.clickOnProcess();
        try {
            switchToAlert();
            softAssert.assertEquals(openAccountPage.getTextFromAlert().substring(0, 29), "Account created successfully", "");
            acceptAlert();
        } catch (Exception e) {
            // exception handling
        }
        softAssert.assertAll();
        homePage.clickOnHomeButton();
    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnHomeButton();
        homePage.setCustomerlogin();
        customerLoginPage.setYourname("Ron Weasly");
        customerLoginPage.setLogin();
        System.out.println("text verification = "+customerLoginPage.verifyLogoutText());
       softAssert.assertEquals(customerLoginPage.verifyLogoutText(), "Logout", "");

        customerLoginPage.setLogout();

      homePage.clickOnHomeButton();
        softAssert.assertAll();
    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldDepositMoneySuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnHomeButton();
        homePage.setCustomerlogin();
        customerLoginPage.setYourname("Ron Weasly");
        customerLoginPage.setLogin();
        accountPage.setDeposit();
        accountPage.setAmountdeposit("100");
        accountPage.setClickdeposit();
        softAssert.assertEquals(accountPage.verifyTextDepositSusseccsful(), "Deposit Successful", "");
        softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnHomeButton();
        homePage.setCustomerlogin();

        customerLoginPage.setYourname("Ron Weasly");
        customerLoginPage.setLogin();

        accountPage.setWithdraw();
        accountPage.setAmountwithdraw("50");

        accountPage.clickOnWithdraw();

        softAssert.assertEquals(accountPage.verifyTextTransactionsuccessful(), "Transaction successful", "");
        softAssert.assertAll();

    }

}

