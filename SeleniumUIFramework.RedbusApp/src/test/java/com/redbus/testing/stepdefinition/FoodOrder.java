package com.redbus.testing.stepdefinition;

import java.util.List;

import com.redbus.testing.utilities.Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FoodOrder {
	@Given("user is on the food ordering page")
	public void user_is_on_the_food_ordering_page() {
	    
	}
	@When("user enters data {string} in the search field")
	public void user_enters_in_the_search_field(String string) {
	    Pages.fp.enterSearchText(string);
	}
	@When("user selects {string} from the suggestions")
	public void user_selects_from_the_suggestions(String string) {
	    Pages.fp.clickOnSuggestion(string);
	}
	@Then("user should be navigated to the restaurant page")
	public void user_should_be_navigated_to_the_restaurant_page() {
	    
	}
	@Then("restaurant name {string} should be displayed")
	public void restaurant_name_should_be_displayed(String string) {
	  String rest= Pages.rmp.getRestaurantName();
	  System.out.println(rest.equals(string));
	}
	@When("user enters partial data {string} in the search field")
	public void user_enters_partial_data_in_the_search_field(String partialData) {
	    Pages.fp.enterSearchText(partialData);
	}
	@Then("suggestions should be displayed")
	public void suggestions_should_be_displayed() {
	    
	}
	@Then("suggestions should contain {string}")
	public void suggestions_should_contain(String expected) {
		 List<String> suggestions = Pages.fp.getAllSuggestions();

		    boolean found = false;

		    for (String s : suggestions) {
		        if (s.equalsIgnoreCase(expected)) {
		            found = true;
		            break;
		        }
		    }

		    System.out.println(found);
	}
	
	@When("user clicks on {string} from Popular Foods section")
	public void user_clicks_on_from_popular_foods_section(String popularFood) {
		Pages.fp.clickSearchField();
	    Pages.fp.clickOnPopularFood(popularFood);
	}
	@Then("user should be navigated to the restaurant listing page")
	public void user_should_be_navigated_to_the_restaurant_listing_page() {
	    
	}
	@Then("restaurant list should be displayed")
	public void restaurant_list_should_be_displayed() {
	    boolean temp= Pages.pp.isRestaurantListVisible();
	    System.out.println(temp);
	}
	
	@When("user searches train number {string}")
	public void user_searches_train_number(String trainNO) {
	   Pages.fp.enterSearchText(trainNO);
	}
	@When("user selects train {string} from suggestions")
	public void user_selects_train_from_suggestions(String trainName) {
	    Pages.fp.clickOnSuggestion(trainName);
	}
	@Then("boarding station and date fields should be enabled")
	public void boarding_station_and_date_fields_should_be_enabled() {
	    
	}
	@When("user selects valid boarding date")
	public void user_selects_valid_boarding_date() {
	    Pages.fp.selectBoardingDate();
	}
	@When("user selects valid boarding station")
	public void user_selects_valid_boarding_station() throws InterruptedException {
	    Pages.fp.selectBoardingStation();
	}
	@When("user clicks on Find Food button")
	public void user_clicks_on_find_food_button() {
	    Pages.fp.clickOnFindFoodBtn();
	}
	@Then("user is navigated to train restaurant results page")
	public void user_is_navigated_to_train_restaurant_results_page() {
	    
	}
	@Then("restaurant list should be visible")
	public void restaurant_list_should_be_visible() {
	    Pages.tp.isRestaurantListDisplayed();
	}
}
