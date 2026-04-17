package com.redbus.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusSelectionPage {

	@FindBy(css = "[href=\"/travels/flixbus\"]")
	private WebElement flixBus;

	@FindBy(xpath = "(//button[text()='Book now'])[1]")
	private WebElement bookNow;

	@FindBy(xpath = "(//button[text()='View seats'])[1]")
	private WebElement viewSeats;

	

	public WebElement getFlixBus() {
		return flixBus;
	}

	public void clickFlixBus() {
		getFlixBus().click();
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public void clickBookNow() {
		getBookNow().click();
	}

	public WebElement getViewSeats() {
		return viewSeats;
	}

	public void clickViewSeats() {
		getViewSeats().click();
	}

}
