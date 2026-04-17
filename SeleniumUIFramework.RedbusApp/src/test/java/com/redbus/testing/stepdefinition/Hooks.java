package com.redbus.testing.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.redbus.testing.utilities.AllUtililtyFunction;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends AllUtililtyFunction{
	public static WebDriver driver;

	 @Before
	    public void setUp() {

	        if (driver == null) {

	            driver = new ChromeDriver();
	            driver.manage().window().maximize();

	            driver.get("https://www.redbus.in");
	        }
	    }

	    @After
	    public void tearDown() {

	        if (driver != null) {
//	            driver.quit();
	            driver = null;   
	        }
	    }

}
