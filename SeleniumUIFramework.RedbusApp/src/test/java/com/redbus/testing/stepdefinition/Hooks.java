package com.redbus.testing.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.edge.EdgeDriver;

import com.RedBus.testing.utilities.AllUtilitiesFunctions;
import com.RedBus.testing.utilities.Base;
import com.RedBus.testing.utilities.Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends AllUtilitiesFunctions {

	private Base b;
	public AllUtilitiesFunctions util;

	public Hooks(Base b) {
		this.b = b;
	}

	@Before
	public void setup() throws IOException {

		b.setDriver(new EdgeDriver());
		AllUtilitiesFunctions util = new AllUtilitiesFunctions();
		util.setDriver(b.getDriver());
		b.driver.get("https://www.redbus.in");
		
		util.setMaximizeBrowser();
		util.implicitlyWait(15);

		Pages.loadAllPages(b.driver);
	}

	@After
	public void tearDown() {

		if (b.driver != null) {
			b.driver.quit();
		}
	}
}