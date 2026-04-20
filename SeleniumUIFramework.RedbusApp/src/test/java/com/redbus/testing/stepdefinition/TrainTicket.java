package com.redbus.testing.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.redbus.testing.pages.Train_page;
import com.redbus.testing.utilities.Base;
import com.redbus.testing.utilities.Pages;

import io.cucumber.java.en.*;

public class TrainTicket {

    private Base b;

    public TrainTicket(Base b) {
		this.b = b;
	}
    @Given("the user is on the RedBus homepage")
    public void the_user_is_on_the_red_bus_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user navigates to train ticket booking page")
    public void the_user_navigates_to_train_ticket_booking_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user Selects journey month {string} and day {string}")
    public void user_selects_journey_month_and_day(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters source {string} and destination {string}")
    public void user_enters_source_and_destination(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user click on search trains")
    public void user_click_on_search_trains() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the train results should be displayed")
    public void the_train_results_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    	at ✽.the user is on the RedBus homepage(file:///C:/Users/Hp/OneDrive/Desktop/RedBus/Selenium/SeleniumUIFramework.RedbusApp/./src/test/java/com/redbus/testing/featurefiles/TrainTickets.feature:13)

    FAILED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Enter passenger details and verify popup", "RedBus Railway Ticket Booking End-to-End Flow")
            Runs Cucumber Scenarios
    io.cucumber.testng.UndefinedStepException: The step 'the user is on the RedBus homepage' and 6 other step(s) are undefined.
    You can implement these steps using the snippet(s) below:

    @Given("the user is on the RedBus homepage")
    public void the_user_is_on_the_red_bus_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user navigates to train ticket booking page")
    public void the_user_navigates_to_train_ticket_booking_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user Provides journey month {string} and day {string}")
    public void user_provides_journey_month_and_day(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user entered source {string} and destination {string}")
    public void user_entered_source_and_destination(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user Selects on search trains")
    public void user_selects_on_search_trains() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user selects a train and enters passenger details")
    public void user_selects_a_train_and_enters_passenger_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("free cancellation popup should be displayed")
    public void free_cancellation_popup_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    	at ✽.the user is on the RedBus homepage(file:///C:/Users/Hp/OneDrive/Desktop/RedBus/Selenium/SeleniumUIFramework.RedbusApp/./src/test/java/com/redbus/testing/featurefiles/TrainTickets.feature:13)

    FAILED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Apply filters and view trains", "RedBus Railway Ticket Booking End-to-End Flow")
            Runs Cucumber Scenarios
    io.cucumber.testng.UndefinedStepException: The step 'the user is on the RedBus homepage' and 6 other step(s) are undefined.
    You can implement these steps using the snippet(s) below:

    @Given("the user is on the RedBus homepage")
    public void the_user_is_on_the_red_bus_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user navigates to train ticket booking page")
    public void the_user_navigates_to_train_ticket_booking_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user selects  month {string} and day {string}")
    public void user_selects_month_and_day(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters source {string} and To {string}")
    public void user_enters_source_and_to(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user Press on search trains")
    public void user_press_on_search_trains() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user applies filters for AC and available tickets")
    public void user_applies_filters_for_ac_and_available_tickets() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("filtered train results should be displayed")
    public void filtered_train_results_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    	at ✽.the user is on the RedBus homepage(file:///C:/Users/Hp/OneDrive/Desktop/RedBus/Selenium/SeleniumUIFramework.RedbusApp/./src/test/java/com/redbus/testing/featurefiles/TrainTickets.feature:13)

    FAILED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Modify search from results page", "RedBus Railway Ticket Booking End-to-End Flow")
            Runs Cucumber Scenarios
    io.cucumber.testng.UndefinedStepException: The step 'the user is on the RedBus homepage' and 6 other step(s) are undefined.
    You can implement these steps using the snippet(s) below:

    @Given("the user is on the RedBus homepage")
    public void the_user_is_on_the_red_bus_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user navigates to train ticket booking page")
    public void the_user_navigates_to_train_ticket_booking_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user Choses journey month {string} and day {string}")
    public void user_choses_journey_month_and_day(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters From {string} and destination {string}")
    public void user_enters_from_and_destination(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on search trains")
    public void user_clicks_on_search_trains() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user modifies search with new source {string} and destination {string}")
    public void user_modifies_search_with_new_source_and_destination(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("updated train results should be displayed")
    public void updated_train_results_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    

    @Given("the user is on the RedBus homepage")
    public void the_user_is_on_the_red_bus_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user navigates to train ticket booking page")
    public void the_user_navigates_to_train_ticket_booking_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user selects Planed month {string} and day {string}")
    public void user_selects_planed_month_and_day(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user Provides source {string} and destination {string}")
    public void user_provides_source_and_destination(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user Clicks on search trains")
    public void user_clicks_on_search_trains() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on view route for a train")
    public void user_clicks_on_view_route_for_a_train() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("train route details should be displayed")
    public void train_route_details_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    	at ✽.the user is on the RedBus homepage(file:///C:/Users/Hp/OneDrive/Desktop/RedBus/Selenium/SeleniumUIFramework.RedbusApp/./src/test/java/com/redbus/testing/featurefiles/TrainTickets.feature:13)

    FAILED: io.cucumber.testng.AbstractTestNGCucumberTests.runScenario("Proceed to payment page", "RedBus Railway Ticket Booking End-to-End Flow")
            Runs Cucumber Scenarios
    io.cucumber.testng.UndefinedStepException: The step 'the user is on the RedBus homepage' and 6 other step(s) are undefined.
    You can implement these steps using the snippet(s) below:

    @Given("the user is on the RedBus homepage")
    public void the_user_is_on_the_red_bus_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user navigates to train ticket booking page")
    public void the_user_navigates_to_train_ticket_booking_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user gives planned journey month {string} and day {string}")
    public void user_gives_planned_journey_month_and_day(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user gives source {string} and destination {string}")
    public void user_gives_source_and_destination(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks on Search Trains")
    public void user_clicks_on_search_trains() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user completes booking steps")
    public void user_completes_booking_steps() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("payment page should be displayed")
    public void payment_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}