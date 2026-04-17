package com.redbus.testing.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.RedBus.testing.Pages.BusBoardDropPointPage;
import com.RedBus.testing.Pages.BusPassengerInfoPage;
import com.RedBus.testing.Pages.BusPaymentPage;
import com.RedBus.testing.Pages.BusSearchPage;
import com.RedBus.testing.Pages.BusSeatSelectionPage;
import com.RedBus.testing.Pages.BusSelectionPage;

public class Pages {
	public static BusSearchPage busSearchPage;
	public static BusSelectionPage busSelectionPage;
	public static BusSeatSelectionPage busSeatSelectionPage;
	public static BusBoardDropPointPage busBoardDropPointPage;
	public static BusPassengerInfoPage busPassengerInfoPage;
	public static BusPaymentPage busPaymentPage;

	public static void loadAllPages(WebDriver driver) {
		busSearchPage = PageFactory.initElements(driver, BusSearchPage.class);
		busSelectionPage = PageFactory.initElements(driver, BusSelectionPage.class);
		busSeatSelectionPage = PageFactory.initElements(driver, BusSeatSelectionPage.class);
		busBoardDropPointPage = PageFactory.initElements(driver, BusBoardDropPointPage.class);
		busPassengerInfoPage = PageFactory.initElements(driver, BusPassengerInfoPage.class);
		busPaymentPage = PageFactory.initElements(driver, BusPaymentPage.class);
	}

}
