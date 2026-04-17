package com.redbus.testing.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.redbus.testing.pages.DashBoardPage;
import com.redbus.testing.pages.HotelSearchResultsPage;
import com.redbus.testing.pages.HotelsPage;

public class Pages {
	public static DashBoardPage dp;
	public static HotelSearchResultsPage hsrp ;
	public static HotelsPage hp;
	
	public static void loadAllPages(WebDriver driver) {
		dp=PageFactory.initElements(driver, DashBoardPage.class);
		hsrp=PageFactory.initElements(driver, HotelSearchResultsPage.class);
		hp=PageFactory.initElements(driver, HotelsPage.class);
	}
}
