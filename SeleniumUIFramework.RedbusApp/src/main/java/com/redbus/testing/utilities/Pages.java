package com.redbus.testing.utilities;

import org.openqa.selenium.WebDriver;

import com.redbus.testing.pages.Train_page;



public class Pages {

	public static Train_page tp1;
	
	public static void loadAllPages(WebDriver driver) {
		tp1 = new Train_page(driver);
	}
}
