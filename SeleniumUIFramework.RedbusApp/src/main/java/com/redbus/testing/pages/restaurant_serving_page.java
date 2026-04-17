package com.redbus.testing.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class restaurant_serving_page {
	private WebDriver driver;
    private WebDriverWait wait;
	public restaurant_serving_page(WebDriver driver) {
		 this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	}
	
	@FindBy(xpath = "//div[@class='mt-4 h-auto']/h1")
	List<WebElement> restaurants;
	
	  

	    public int getRestaurantCount() {
	    	wait.until(ExpectedConditions.visibilityOfAllElements(restaurants));
	        return restaurants.size();
	    }

	    public boolean isRestaurantListVisible() {
	        return getRestaurantCount() > 0;
	    }
}
