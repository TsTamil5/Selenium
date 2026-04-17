package com.redbus.testing.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class train_restaurants_page {
	private WebDriver driver;
	 private WebDriverWait wait;
	public train_restaurants_page(WebDriver driver) {
		 this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	}
	@FindBy(xpath = "//h4[contains(.,'NDLS')]")
	private WebElement stationNameField;
	
	public String textOnRestaurantStation() {
		wait.until(ExpectedConditions.visibilityOf(stationNameField));
		return stationNameField.getText();
	}
}
