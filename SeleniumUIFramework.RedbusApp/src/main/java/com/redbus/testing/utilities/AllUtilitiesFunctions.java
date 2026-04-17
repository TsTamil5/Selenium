package com.redbus.testing.utilities;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllUtilitiesFunctions {
	Properties properties;
	protected WebDriver driver;
	
	
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }


	// ================= WINDOW MANAGEMENT =================

	public void setMaximizeBrowser() {
		driver.manage().window().maximize();
	}

	public void setMinimizeBrowser() {
		driver.manage().window().minimize();
	}

	public void setFullscreenBrowser() {
		driver.manage().window().fullscreen();
	}

	public Dimension getSize() {
		return driver.manage().window().getSize();
	}

	public void setSize(int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}

	public Point getPosition() {
		return driver.manage().window().getPosition();
	}

	public void setPosition(int x, int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}

	// ================= NAVIGATION =================

	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	// ================= DETAILS =================

	public String getTitle() {
		return driver.getTitle();
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	// ================= TIMEOUTS =================

	public void implicitlyWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public void pageLoadTimeout(int seconds) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));
	}

	// ================= EXPLICIT WAIT =================

	public void waitForElementVisible(WebElement element, int seconds) {
		new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementClickable(WebElement element, int seconds) {
		new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitForTitleContains(String title, int seconds) {
		new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.titleContains(title));
	}

	// ================= ALERT / POPUPS =================

	public void acceptPopup() {
		driver.switchTo().alert().accept();
	}

	public void dismissPopup() {
		driver.switchTo().alert().dismiss();
	}

	public String getPopupText() {
		return driver.switchTo().alert().getText();
	}

	public void printTextOnPopup() {
		System.out.println(driver.switchTo().alert().getText());
	}

	public void sendTextToPopup(String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	// ================= WINDOW HANDLES =================

	public void switchToWindowByTitle(String textTitle) {
		Set<String> all = driver.getWindowHandles();
		String currentWindowHandle = driver.getWindowHandle();
		all.remove(currentWindowHandle);

		for (String window : all) {
			driver.switchTo().window(window);
			if (driver.getTitle().contains(textTitle)) {
				break;
			}
		}
	}

	public void switchToWindowByUrl(String url) {
		Set<String> all = driver.getWindowHandles();
		String currentWindowHandle = driver.getWindowHandle();
		all.remove(currentWindowHandle);

		for (String window : all) {
			driver.switchTo().window(window);
			if (driver.getCurrentUrl().contains(url)) {
				break;
			}
		}
	}

	// ================= WINDOW CLOSE =================

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

	// ==================== PROPERTIES UTILITIES ===============

	public void initPropertiesUtility(String path) {

		try (FileInputStream fis = new FileInputStream(path);) {
			properties = new Properties();
			properties.load(fis);
			System.out.println("Properties : " + properties);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String getPropertyData(String key) {
		if (properties != null) {
			return properties.getProperty(key);
		} else {
			System.err.println("Invalid Operation try again with proper property file");
			return null;
		}
	}

	// ==================== JAVA UTILITIES ===============
	public int getRandomNumber(int range) {
		return new Random().nextInt(range);
	}

	public String getCurrentDate(String dateFormat) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
		return simpleDateFormat.format(new Date());
	}
}
