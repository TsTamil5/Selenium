package com.redbus.testing.stepdefinition;

import com.redbus.testing.utilities.Base;

import io.cucumber.java.en.Given;

public class CommonStepDefinition {

	@Given("Open the Browser")
	public void open_the_browser() {
		// Browser opens from Hooks.java
	}

	@Given("Navigate to RedBus Application {string}")
	public void navigate_to_red_bus_application(String url) {
		Base.driver.get(url);
	}
}