package com.redbus.testing.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;

public class Trainpage {

    WebDriver driver;
    WebDriverWait wait;

    public Trainpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    // FROM field
    @FindBy(xpath = "//input[@id='src']")
    private WebElement fromInput;

    // TO field
    @FindBy(xpath = "//input[@id='dest']")
    private WebElement toInput;

    // Date field
    @FindBy(xpath = "//input[@id='onwardCal']")
    private WebElement dateInput;

    // Suggestions list
    @FindBy(xpath = "//ul[contains(@class,'autoFill')]//li")
    private List<WebElement> suggestions;

    // Search button
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    private WebElement searchBtn;

    // ========== ACTION METHODS ========== //

    public void enterFrom(String fromCity) {
        wait.until(ExpectedConditions.elementToBeClickable(fromInput)).click();
        fromInput.clear();
        fromInput.sendKeys(fromCity);

        selectFromDropdown(fromCity);
    }

    public void enterTo(String toCity) {
        wait.until(ExpectedConditions.elementToBeClickable(toInput)).click();
        toInput.clear();
        toInput.sendKeys(toCity);

        selectFromDropdown(toCity);
    }

    public void selectFromDropdown(String text) {
        wait.until(ExpectedConditions.visibilityOfAllElements(suggestions));

        for (WebElement option : suggestions) {
            if (option.getText().toLowerCase().contains(text.toLowerCase())) {
                option.click();
                break;
            }
        }
    }

    public void selectDate(String dateXpath) {
        wait.until(ExpectedConditions.elementToBeClickable(dateInput)).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dateXpath))).click();
    }

    public void clickSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
    }
}