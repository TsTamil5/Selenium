package com.redbus.testing.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class restaurant_menu_page {
	
	private WebDriver driver;
	private WebDriverWait wait;
	public restaurant_menu_page(WebDriver driver) {
		this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		 PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css ="span[class='flex']")
	private WebElement restaurantName;
	
	//Returns restaurant name
	public String getRestaurantName() {
		wait.until(ExpectedConditions.visibilityOf(restaurantName));
	    return restaurantName.getText();
	}
	
	
	public boolean isDishPresent(String dishName) {

	    By dishesLocator = By.xpath("//div[@class='w-full']/div/h6");

	    // wait for elements to load
	    wait.until(ExpectedConditions.presenceOfElementLocated(dishesLocator));

	    int size = driver.findElements(dishesLocator).size();
	    System.out.println("Total dishes: " + size);

	    // iterate using index (safe for dynamic DOM)
	    for (int i = 0; i < size; i++) {

	        List<WebElement> dishes = driver.findElements(dishesLocator); // re-fetch

	        String text = dishes.get(i).getText();

	        if (text.equalsIgnoreCase(dishName)) {
	            System.out.println("Dish found: " + text);
	            return true;
	        }
	    }

	    System.out.println("Dish NOT found: " + dishName);
	    return false;
	}
}
