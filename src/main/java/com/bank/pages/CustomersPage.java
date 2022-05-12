package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

// serach tab
@FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement searchtab;

    public void clickOnSearchTab() {
        Reporter.log("Clicking on search tab "+ searchtab.toString()+ "<br>");
        clickOnElement(searchtab);
    }
    public void addTextSearchBar(String text) {
        Reporter.log("Enter add text from search bar "+text+ " to search bar "+searchtab.toString() + "<br>");

        sendTextToElement(searchtab,text);
    }

}
