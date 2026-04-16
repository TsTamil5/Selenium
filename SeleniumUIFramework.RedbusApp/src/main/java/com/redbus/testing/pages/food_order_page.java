package com.redbus.testing.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class food_order_page {
	 private WebDriver driver;
	 private WebDriverWait wait;
	public food_order_page(WebDriver driver) {
		 this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	}
	
	@FindBy(css = "input[placeholder='Search food, brand, station, etc.']")
	private WebElement  foodInputField;
	
	@FindBy(css = ".form-input.pl-12.text-sm")
	private WebElement foodSearchField;
	
	@FindBy(css = ".text-sm.lg\\:text-base.font-medium.text-admin-onBackground.subtitle-3.ext-ellipsis.line-clamp-2.w-48")
	private List<WebElement>suggestions;
	
	@FindBy(xpath = "//div[contains(@class,'pl-3')]")
	private List<WebElement> popularFoods ;
	
	@FindBy(css = "input.custom-date-picker[type='date']")
	private WebElement boardingDateField;
	
	
	
	
	public WebElement getFoodInputField() {
		return foodInputField;
	}

	public WebElement getFoodSearchField() {
		return foodSearchField;
	}
	
	//Entering data in search field
	public void enterSearchText(String text) {
        foodInputField.click();
        wait.until(ExpectedConditions.elementToBeClickable(foodSearchField));
        foodSearchField.sendKeys(text);
    }
	
	public List<String> getAllSuggestions() {
		wait.until(ExpectedConditions.visibilityOfAllElements(suggestions));
	    List<String> list = new ArrayList<>();

	    for (WebElement e : suggestions) {
	        list.add(e.getText().trim());
	    }

	    return list;
	}
	
	// Dynamic suggestion click 
	public void clickOnSuggestion(String text) {

		 wait.until(ExpectedConditions.visibilityOfAllElements(suggestions));

		    for (WebElement e : suggestions) {

		        if (e.getText().trim().equalsIgnoreCase(text)) {

		            wait.until(ExpectedConditions.elementToBeClickable(e));
		            e.click();
		            return;
		        }
		    }

		    throw new RuntimeException("Suggestion not found: " + text);
	}
	
	public void clickOnPopularFood(String foodName) {
		wait.until(ExpectedConditions.visibilityOfAllElements(popularFoods));
        for (WebElement food : popularFoods) {

            String text = food.getText().trim();

            if (text.equalsIgnoreCase(foodName)) {
                food.click();
                break;
            }
        }
    }
	
	public void selectBoardingDate() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    js.executeScript(
	        "var nativeInputValueSetter = Object.getOwnPropertyDescriptor(" +
	        "window.HTMLInputElement.prototype, 'value').set;" +
	        "nativeInputValueSetter.call(arguments[0], arguments[1]);" +
	        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));" +
	        "arguments[0].dispatchEvent(new Event('change', { bubbles: true }));",
	        boardingDateField, "2026-04-30"
	    );
	}
	
	
//	//Searching and clicking on related suggestion
//	public void searchAndClickOnSuggestion(String searchText,String suggestionText) {
//		foodInputField.click();
//		foodSearchField.clear();
//		foodSearchField.sendKeys(searchText);
//		clickOnSuggestion(suggestionText);
//	}
}

