package com.redbus.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusPaymentPage {
	
	
	
	@FindBy(xpath = "//div[text()='Pay by any UPI App']")
	private WebElement payByAnyUPIApp;
	
	@FindBy(xpath = "//div[text()='Add credit/debit card']")
	private WebElement payByCreditCard;
	
	@FindBy(xpath = "//div[text()='Search all banks']")
	private WebElement payByNetBanking;
	
	@FindBy(xpath = "//div[text()='Have a coupon code']")
	private WebElement couponCode;
	
	@FindBy(css = "[aria-label=\"Back to all payment\"]")
	private WebElement backToAllPayment;
	
	@FindBy(css = "[placeholder=\"Select\"]")
	private WebElement bankSelect;
	
	@FindBy(css = "[class='fare']")
	private WebElement totalPrice;
	
	public WebElement getPayByAnyUPIApp() {
		return payByAnyUPIApp;
	}

	public void clickPayByAnyUPIApp() {
		getPayByAnyUPIApp().click();
	}

	public WebElement getPayByCreditCard() {
		return payByCreditCard;
	}

	public void clickPayByCreditCard() {
		getPayByCreditCard().click();;
	}

	public WebElement getPayByNetBanking() {
		return payByNetBanking;
	}

	public void clickPayByNetBanking() {
		getPayByNetBanking().click();
	}

	public WebElement getCouponCode() {
		return couponCode;
	}

	public void clickCouponCode() {
		getCouponCode().click();;
	}

	public WebElement getBackToAllPayment() {
		return backToAllPayment;
	}

	public void clickBackToAllPayment() {
		getBackToAllPayment().click();
	}

	public WebElement getBankSelect() {
		return bankSelect;
	}

	public void clickBankSelect() {
		getBankSelect().click();
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
