package com.redbus.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusBoardDropPointPage {
	
	

	@FindBy(xpath  = "//div[text()='Chennai - Siruseri SIPCOT (N)']")
	private WebElement boardingPoint;
	
	@FindBy(xpath = "//div[text()='Bengaluru - Attibelle Toll (W)']")
	private WebElement destinationPoint;
	
	@FindBy(xpath = "//button[text()='Fill passenger details']")
	private WebElement navigateToPassengerInfo;

	public WebElement getBoardingPoint() {
		return boardingPoint;
	}

	public void clickBoardingPoint() {
		getBoardingPoint().click();
	}

	public WebElement getDestinationPoint() {
		return destinationPoint;
	}

	public void clickDestinationPoint() {
		getDestinationPoint().click();
	}

	public WebElement getNavigateToPassengerInfo() {
		return navigateToPassengerInfo;
	}

	public void clickNavigateToPassengerInfo() {
		getNavigateToPassengerInfo().click();
	}
	
}
