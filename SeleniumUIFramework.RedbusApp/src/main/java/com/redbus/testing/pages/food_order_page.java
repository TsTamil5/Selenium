package com.redbus.testing.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class food_order_page {
	 private WebDriver driver;
	 private WebDriverWait wait;
	 private Actions actions;
	public food_order_page(WebDriver driver) {
		 this.driver = driver;
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		 this.actions = new Actions(driver);
		 PageFactory.initElements(driver, this);
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
	
	@FindBy(css = "select[placeholder='Boarding Station'], .form-Input")
	private WebElement boardingStationField;
	
	@FindBy(xpath = "//button[.='FIND FOOD']")
	private WebElement findFoodButton;
	
	public WebElement getFoodInputField() {
		return foodInputField;
	}

	public WebElement getFoodSearchField() {
		return foodSearchField;
	}
	public void clickSearchField() {
		foodInputField.click();
	}
	//Entering data in search field
	public void enterSearchText(String text) {
        clickSearchField();
        wait.until(ExpectedConditions.elementToBeClickable(foodSearchField));
        foodSearchField.sendKeys(text);
    }
	
	public List<String> getAllSuggestions() {

	    By suggestionLocator = By.cssSelector(
	        ".text-sm.lg\\:text-base.font-medium.text-admin-onBackground.subtitle-3.ext-ellipsis.line-clamp-2.w-48"
	    );

	    // wait until suggestions appear (size > 0)
	    wait.until(driver -> driver.findElements(suggestionLocator).size() > 0);

	    List<WebElement> elements = driver.findElements(suggestionLocator);

	    List<String> list = new ArrayList<>();

	    for (WebElement e : elements) {
	        list.add(e.getText().trim());
	    }

	    return list;
	}
	
	// Dynamic suggestion click 
	public void clickOnSuggestion(String text) {

	    By suggestionLocator = By.cssSelector(
	        ".text-sm.lg\\:text-base.font-medium.text-admin-onBackground.subtitle-3.ext-ellipsis.line-clamp-2.w-48"
	    );

	    // wait for suggestions to appear
	    wait.until(driver -> driver.findElements(suggestionLocator).size() > 0);

	    int size = driver.findElements(suggestionLocator).size();
	    //System.out.println("Suggestions found: " + size);

	    for (int i = 0; i < size; i++) {

	        String suggestionText = driver.findElements(suggestionLocator)
	                                      .get(i)
	                                      .getText()
	                                      .trim();

	        //System.out.println("Checking: " + suggestionText);

	        if (suggestionText.equalsIgnoreCase(text)) {

	            WebElement element = driver.findElements(suggestionLocator).get(i);

	            wait.until(ExpectedConditions.elementToBeClickable(element));
	            element.click();

	            return;
	        }
	    }

	    throw new RuntimeException("Suggestion not found: " + text);
	}
	
	public boolean isSuggestionListEmpty() {

	    By suggestionLocator = By.cssSelector(
	        ".text-sm.lg\\:text-base.font-medium.text-admin-onBackground.subtitle-3.ext-ellipsis.line-clamp-2.w-48"
	    );

	    // wait briefly for DOM update (optional)
	    wait.until(driver -> true); // or small sleep if needed

	    return driver.findElements(suggestionLocator).isEmpty();
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
	
	public void selectBoardingStation() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(boardingStationField));
		boardingStationField.click();
		Thread.sleep(1000);
		actions.sendKeys(Keys.ARROW_DOWN).pause(Duration.ofMillis(500)).sendKeys(Keys.ENTER).perform();
	}
	
	
	public void clickOnFindFoodBtn() {
		findFoodButton.click();
	}
//	//Searching and clicking on related suggestion
//	public void searchAndClickOnSuggestion(String searchText,String suggestionText) {
//		foodInputField.click();
//		foodSearchField.clear();
//		foodSearchField.sendKeys(searchText);
//		clickOnSuggestion(suggestionText);
//	}
}

