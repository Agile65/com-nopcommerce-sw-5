package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignInPage extends Utilities {

    @CacheLookup
    @FindBy(xpath = ("//div[@class='page-title']//h1"))
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = ("//button[text()='Checkout as Guest']"))
    WebElement checkoutAsGuestBtn;

    @CacheLookup
    @FindBy(xpath = ("//button[text()='Register']"))
    WebElement registerBtn;

    public void verifyWelcomeText(String expectedMessage) {
        Reporter.log("Verify Welcome Text " + welcomeText.toString() + "<br>");
        verifyElements(welcomeText, expectedMessage, "Welcom message is not displayed");
        CustomListeners.test.log(Status.PASS, "Verify Welcome Message: " + expectedMessage);
    }

    public void clickOnCheckoutAsGuestBtn() {
        Reporter.log("Click on Checkout As Guest button: " + checkoutAsGuestBtn.toString() + "<br>");
        clickOnElement(checkoutAsGuestBtn);
        CustomListeners.test.log(Status.PASS, "Click on Checkout As Guest Button ");
    }

    public void clickOnRegisterBtn() {
        Reporter.log("Click on Register button " + registerBtn.toString() + "<br>");
        clickOnElement(registerBtn);
        CustomListeners.test.log(Status.PASS, "Click on Register buttron ");
    }
}
