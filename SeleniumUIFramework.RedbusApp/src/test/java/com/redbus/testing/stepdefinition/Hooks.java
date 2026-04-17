package com.redbus.testing.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.redbus.testing.utilities.AllUtililtyFunction;
import com.redbus.testing.utilities.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends AllUtililtyFunction{

	@Before
	public void openBrowser() {

		Base.driver = new ChromeDriver();
		Base.driver.manage().window().maximize();
		Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@After
	public void closeBrowser() {

		if (Base.driver != null) {
			Base.driver.quit();
		}
	}
}