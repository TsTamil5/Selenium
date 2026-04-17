package com.redbus.testing.stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.redbus.testing.pages.AccountsPage;
import com.redbus.testing.utilities.AllUtililtyFunction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Accounts {

    WebDriver driver;
    AccountsPage accountsPage;

    @Given("user is on RedBus homepage")
    public void user_is_on_redbus_homepage() {

    	driver = Hooks.driver;

        accountsPage = new AccountsPage(driver);
    }

    @Given("user clicks on Accounts")
    public void user_clicks_on_accounts() {
        accountsPage.clickAccounts();
    }

    @Given("user clicks on Login button")
    public void user_clicks_on_login_button() {
        accountsPage.clickLogin();
    }

    @Given("user enters mobile number")
    public void user_enters_mobile_number() {
        accountsPage.enterMobile("6301571370");
    }

    @Given("user clicks on captcha checkbox")
    public void user_clicks_on_captcha_checkbox() {
        accountsPage.handleCaptcha();
    }
   

    @Given("user clicks on Continue button")
    public void user_clicks_on_continue_button() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

         WebElement continueBtn = wait.until(
             ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue']"))
         );

         continueBtn.click();
//        accountsPage.clickContinue();
    }
    

    @And("user clicks on Verify button")
    public void user_clicks_on_verify_button() throws InterruptedException {
        System.out.println("OTP verification step (manual/OTP required)");
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.clickVerifyOtp();
       
        
    }
    @And("user handles security popup")
    public void user_handles_security_popup() {

        AccountsPage page = new AccountsPage(driver);
        page.handleSecurityPopup();
    }
}
