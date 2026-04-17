package com.redbus.testing.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.redbus.testing.pages.food_order_page;
import com.redbus.testing.pages.popularfood_restaurant_serving_page;
import com.redbus.testing.pages.restaurant_menu_page;
import com.redbus.testing.pages.train_restaurants_page;



public class Pages {
	public static food_order_page fp;
	public static restaurant_menu_page rmp;
	public static popularfood_restaurant_serving_page pp;
	public static train_restaurants_page tp;
	
	//this methods are used to initialize all the pom class at once
	
	public static void loadAllPages(WebDriver driver) {
		fp = new food_order_page(driver);
		rmp = new restaurant_menu_page(driver);
		pp = new popularfood_restaurant_serving_page(driver);
		tp = new train_restaurants_page(driver);
	
	}
}
