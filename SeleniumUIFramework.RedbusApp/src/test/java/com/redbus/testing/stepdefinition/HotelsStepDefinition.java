package com.redbus.testing.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.redbus.testing.pages.DashBoardPage;
import com.redbus.testing.pages.HotelSearchResultsPage;
import com.redbus.testing.pages.HotelsPage;
import com.redbus.testing.utilities.AllUtililtyFunction;
import com.redbus.testing.utilities.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelsStepDefinition {

	WebDriver driver = Base.driver;

	DashBoardPage dashboard = PageFactory.initElements(Base.driver, DashBoardPage.class);
	HotelsPage hotels = PageFactory.initElements(Base.driver, HotelsPage.class);
	HotelSearchResultsPage results = PageFactory.initElements(Base.driver, HotelSearchResultsPage.class);

	AllUtililtyFunction util = new AllUtililtyFunction();

	@When("Click on Hotels tab")
	public void click_on_hotels_tab() {
		dashboard.clickHotels();
	}

	@Then("Verify Hotels page is displayed")
	public void verify_hotels_page_is_displayed() {
		Assert.assertTrue(hotels.getCityName().isDisplayed());
	}

	@When("Click hotel card from Flash Deals section by index {string}")
	public void click_hotel_card_from_flash_deals_section_by_index(String index) {
		hotels.clickFlashDealCard(Integer.parseInt(index));
	}

	@Then("Verify hotel details page is displayed")
	public void verify_hotel_details_page_is_displayed() {
		Assert.assertTrue(Base.driver.getCurrentUrl().contains("hotel"));
	}

	@When("Enter city name from excel sheet {string} row {int}")
	public void enter_city_name_from_excel_sheet_row(String sheet, Integer row) throws IOException, InterruptedException {

		String city = util.getExcelData(sheet, row, 0);

		hotels.clickCityName();

		Base.driver.findElement(By.xpath("//input[@placeholder='Search city']")).sendKeys(city);

		Thread.sleep(2000);

		Base.driver.findElement(By.xpath("//div[contains(@class,'searchSuggestion')]")).click();
	}

	@When("Select check-in date from excel sheet {string} row {int}")
	public void select_check_in_date_from_excel_sheet_row(String sheet, Integer row) throws IOException {

		String date = util.getExcelData(sheet, row, 1);

		hotels.clickCheckIn();

		Base.driver.findElement(By.xpath("//span[text()='" + date + "']")).click();
	}

	@When("Select check-out date from excel sheet {string} row {int}")
	public void select_check_out_date_from_excel_sheet_row(String sheet, Integer row) throws IOException {

		String date = util.getExcelData(sheet, row, 2);

		Base.driver.findElement(By.xpath("//span[text()='" + date + "']")).click();
	}

	@When("Click on rooms and guests field")
	public void click_on_rooms_and_guests_field() {
		hotels.clickRoomsAndGuests();
	}

	@When("Select rooms count from excel sheet {string} row {int}")
	public void select_rooms_count_from_excel_sheet_row(String sheet, Integer row) throws IOException {

		int rooms = (int) Double.parseDouble(util.getExcelData(sheet, row, 3));
		hotels.increaseRooms(rooms);
	}

	@When("Select adults count from excel sheet {string} row {int}")
	public void select_adults_count_from_excel_sheet_row(String sheet, Integer row) throws IOException {

		int adults = (int) Double.parseDouble(util.getExcelData(sheet, row, 4));
		hotels.increaseAdults(adults);
	}

	@When("Add children count from excel sheet {string} row {int}")
	public void add_children_count_from_excel_sheet_row(String sheet, Integer row) throws IOException {

		int child = (int) Double.parseDouble(util.getExcelData(sheet, row, 5));
		hotels.addChildren(child);
	}

	@When("Select child age from excel sheet {string} row {int}")
	public void select_child_age_from_excel_sheet_row(String sheet, Integer row) throws IOException {

		String age = util.getExcelData(sheet, row, 6);

		hotels.clickChildField(0);

		Base.driver.findElement(By.xpath("//div[@role='option']//span[text()='" + age + "']")).click();
	}

	@When("Click on Search button")
	public void click_on_search_button() {
		Base.driver.findElement(By.xpath("//button[contains(.,'Search')]")).click();
	}

	@Then("Verify hotel results page is displayed")
	public void verify_hotel_results_page_is_displayed() {
		Assert.assertTrue(results.isResultsPageDisplayed());
	}

	@Then("Verify child age selection validation message is displayed")
	public void verify_child_age_selection_validation_message_is_displayed() {
		Assert.assertTrue(Base.driver.getPageSource().contains("Select child age"));
	}

	@When("Apply hotel filter {string}")
	public void apply_hotel_filter(String filterName) {

		if (filterName.equalsIgnoreCase("Free Breakfast")) {
			results.selectMealPreference("Free Breakfast");
		}

		else if (filterName.equalsIgnoreCase("Excellent")) {
			results.selectCustomerRating("Excellent");
		}

		else if (filterName.equalsIgnoreCase("5 Star")) {
			results.selectStarRating("5 Star");
		}

		else if (filterName.equalsIgnoreCase("Wi-Fi")) {
			results.selectAmenity("Wi-Fi");
		}
	}

	@Then("Verify Clear Filter button is enabled")
	public void verify_clear_filter_button_is_enabled() {
		Assert.assertTrue(results.getClearFilterButton().isEnabled());
	}

	@Then("Verify filtered hotel results page is displayed")
	public void verify_filtered_hotel_results_page_is_displayed() {
		Assert.assertTrue(results.getHotelCardsCount() > 0);
	}

	@When("Apply unavailable hotel filter {string}")
	public void apply_unavailable_hotel_filter(String filterName) {

		if (filterName.equalsIgnoreCase("5 Star under low budget")) {
			results.selectStarRating("5 Star");
			results.selectPriceFilter("₹0 - ₹1500");
		}

		else if (filterName.equalsIgnoreCase("Jacuzzi + Hostel")) {
			results.selectAmenity("Jacuzzi");
			results.selectPropertyType("Hostel");
		}
	}

	@Then("Verify no hotels found message is displayed")
	public void verify_no_hotels_found_message_is_displayed() {
		Assert.assertTrue(Base.driver.getPageSource().contains("No hotels found"));
	}

	@Then("Verify no hotel cards are displayed")
	public void verify_no_hotel_cards_are_displayed() {
		Assert.assertTrue(results.getHotelCardsCount() == 0);
	}
}