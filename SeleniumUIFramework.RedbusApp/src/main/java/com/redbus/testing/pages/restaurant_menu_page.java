package com.redbus.testing.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class restaurant_menu_page {
	
	private WebDriver driver;
	private WebDriverWait wait;
	public restaurant_menu_page(WebDriver driver) {
		this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	}
	
	
	@FindBy(css ="span[class='flex']")
	private WebElement restaurantName;
	
	//Returns restaurant name
	public String getRestaurantName() {
		wait.until(ExpectedConditions.visibilityOf(restaurantName));
	    return restaurantName.getText();
	}
}
