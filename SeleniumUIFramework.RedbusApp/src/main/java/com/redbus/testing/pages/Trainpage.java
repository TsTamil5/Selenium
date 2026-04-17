package com.redbus.testing.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Trainpage {

    WebDriver driver;
    WebDriverWait wait;

    public Trainpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }


    @FindBy(xpath = "//span[contains(text(),'Train tickets')]")
    private WebElement trainTab;

    @FindBy(xpath = "//input[contains(@placeholder,'Date')]")
    private WebElement date;

    @FindBy(xpath = "//td[not(contains(@class,'disabled'))][1]")
    private WebElement selectDate;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    private WebElement searchBtn;

    @FindBy(xpath = "//div[contains(@class,'train')]")
    private WebElement results;



    public void clickTrainTickets() {
        wait.until(ExpectedConditions.elementToBeClickable(trainTab)).click();
    }

    public void enterSource(String src) {

        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);

        WebElement sourceContainer = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[contains(@class,'srcDestWrapper')]//div[1]")
                )
        );

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sourceContainer);

        WebElement activeInput = driver.switchTo().activeElement();
        activeInput.sendKeys(src);

        WebElement suggestion = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@class,'suggestion')]"))
        );
        suggestion.click();
    }

    public void enterDestination(String dest) {

        WebElement destContainer = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[contains(@class,'srcDestWrapper')]//div[2]")
                )
        );

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", destContainer);

        WebElement activeInput = driver.switchTo().activeElement();
        activeInput.sendKeys(dest);

        WebElement suggestion = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@class,'suggestion')]"))
        );
        suggestion.click();
    }

    public void selectJourneyDate() {

        wait.until(ExpectedConditions.elementToBeClickable(date)).click();

        WebElement availableDate = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//td[not(contains(@class,'disabled'))]")
                )
        );
        availableDate.click();
    }

    public void clickSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
    }

    public boolean isResultsDisplayed() {
        return wait.until(ExpectedConditions.visibilityOf(results)).isDisplayed();
    }
}