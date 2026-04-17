package com.redbus.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.RedBus.testing.utilities.AllUtilitiesFunctions;

public class BusSeatSelectionPage {

	WebDriver driver;
	AllUtilitiesFunctions util;

	public BusSeatSelectionPage(WebDriver driver) {
		this.driver = driver;
		this.util = new AllUtilitiesFunctions();
		this.util.setDriver(driver);
	}

	@FindBy(xpath = "//div[text()='Boarding points']")
	private WebElement verifyBoardingPoint;
	
	@FindBy(css = "//h3[@id='upper-deck-heading']/following::span[contains(@aria-label,'seat status available')][1]x")
	private WebElement upperDeckSeat;

	@FindBy(xpath = "//button[text()='Select boarding & dropping points']")
	private WebElement navigateToBoardDropPoint;

	@FindBy(xpath = "//span[text()='Sold']/..")
	private WebElement bookedSeat;

	@FindBy(xpath = "//h3[@id='lower-deck-heading']/following::span[contains(@aria-label,'seat status available')][1]")
	private WebElement lowerDeckSeat;

	public WebElement getUpperDeckSeat() {
		return upperDeckSeat;
	}
	
	public String verifyBoardingPoint() {
		return verifyBoardingPoint.getText();
	}

	public void clickUpperDeckSeat(WebElement upperDeckSeat) {
		getUpperDeckSeat().click();
	}

	public WebElement getNavigateToBoardDropPoint() {
		return navigateToBoardDropPoint;
	}

	public void clickNavigateToBoardDropPoint() {
		util.waitForElementClickable(navigateToBoardDropPoint, 10);
		getNavigateToBoardDropPoint().click();
	}

	public WebElement getBookedSeat() {
		return bookedSeat;
	}

	public void clickBookedSeat() {
		getBookedSeat();
	}

	public WebElement getLowerDeckSeat() {
		return lowerDeckSeat;
	}

	public void clickLowerDeckSeat() {
		getLowerDeckSeat().click();
		;
	}

}
