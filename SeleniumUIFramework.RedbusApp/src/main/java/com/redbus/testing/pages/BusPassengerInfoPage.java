package com.redbus.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusPassengerInfoPage {
	@FindBy(css = "[placeholder=\"Phone\"]")
	private WebElement phoneField;

	@FindBy(css = "[placeholder=\"Enter email id\"]")
	private WebElement emailIDField;

	@FindBy(xpath = "//label[text()='State of Residence *']")
	private WebElement stateOfResidence;

	@FindBy(css = "[placeholder=\"Search for state\"]")
	private WebElement searchForState;

	@FindBy(css = "[class=\"listItem___0b3206 \"]")
	private WebElement chooseState;

	@FindBy(css = "[placeholder=\"Enter your Name\"]")
	private WebElement nameField;

	@FindBy(css = "[placeholder=\"Enter Age\"]")
	private WebElement ageField;

	@FindBy(xpath = "//span[text()='Male']")
	private WebElement male;

	@FindBy(xpath = "//span[text()='Female']")
	private WebElement female;

	@FindBy(id = "insuranceConfirmText")
	private WebElement withInsurance;

	@FindBy(id = "insuranceRejectText")
	private WebElement withoutInsurance;

	@FindBy(xpath = "//button[text()='Continue booking']")
	private WebElement continueBooking;
	
	@FindBy(xpath = "//span[text()='View details']")
	private WebElement viewDetails;
	
	@FindBy(xpath = "//h2[contains(text(),'Booking')]/ancestor::div//button[@aria-label='Close']")
	private WebElement viewDetailsClose;

}
