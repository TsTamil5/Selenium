package com.redbus.testing.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import com.redbus.testing.pages.Trainpage;
import com.redbus.testing.utilities.AllUtililtyFunction;

public class TrainTicket {

    WebDriver driver;
    AllUtililtyFunction util;
    Trainpage page;   

    String source;
    String destination;

    @Given("user launches the browser")
    public void user_launches_the_browser() {

        driver = new ChromeDriver();
        util = new AllUtililtyFunction();

        util.configmaximizedbrowser(driver);
        util.handlingImplicitTimeout(driver, 10);

        page = new Trainpage(driver);   
    }

    @Given("user navigates to RedBus website")
    public void user_navigates_to_red_bus_website() throws Exception {

        String url = util.getPropertyKeyValue("url");
        util.enterUrl(driver, url);
    }

    @When("user clicks on train tickets option")
    public void user_clicks_on_train_tickets_option() {
        page.clickTrainTickets();
    }

    @When("user enters source from test data")
    public void user_enters_source_from_test_data() throws Exception {
        source = util.getExcelData("Sheet1", 1, 0);
        page.enterSource(source);
    }

    @When("user enters destination from test data")
    public void user_enters_destination_from_test_data() throws Exception {
        destination = util.getExcelData("Sheet1", 1, 1);
        page.enterDestination(destination);
    }

    @When("user selects journey date")
    public void user_selects_journey_date() {
        page.selectJourneyDate();   
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        page.clickSearch();
    }

    @Then("train results should be displayed")
    public void train_results_should_be_displayed() {

        if (page.isResultsDisplayed()) {
            System.out.println("Train results displayed");
        } else {
            System.out.println("Test Failed");
        }

        driver.quit();
    }
}