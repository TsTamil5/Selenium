package com.redbus.testing.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountsPage {
	WebDriver driver;
	public AccountsPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class=\"navOption___3dbbee\"]")
	private WebElement Accounts;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement LogIn;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement Mobileno;
	
	@FindBy(css="[class='recaptcha-checkbox-border']")
	private WebElement captcha;
	
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	private WebElement Continue;
	
	
	public void clickAccounts() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Accounts)).click();
                
    }
	
	 public void clickLogin() {
	        WebElement loginBtn = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(LogIn));
	        loginBtn.click();
	 }
	 
	 public void enterMobile(String number) {
	        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(Mobileno));

	        Mobileno.sendKeys(number);
	        
	  }
	 public void handleCaptcha(WebDriver driver) {

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    try {
		       
		        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
		                By.xpath("//iframe[contains(@title,'reCAPTCHA')]")));

		      
		        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
		                By.cssSelector(".recaptcha-checkbox-border")));

		        checkbox.click();

		       
		        driver.switchTo().defaultContent();

		    } catch (Exception e) {
		        System.out.println("Captcha not handled");
		    }
		}
	 
	 public void clickContinue() {
	        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(Continue)).click();
	 }
	 
	

}
