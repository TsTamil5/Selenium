package com.redbus.testing.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.edge.EdgeDriver;

import com.redbus.testing.utilities.AllUtililtyFunction;
import com.redbus.testing.utilities.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends AllUtililtyFunction{
private Base b;
	
	public Hooks(Base c) {
		this.b=c;
	}//this part is DI
	
	//setup precondition
	@Before
	public void setup() throws IOException {
		
		
		//launch the browser
		b.driver=new EdgeDriver();
		configmaximizedbrowser(b.driver);
		handlingImplicitTimeout(b.driver, 15);
		b.driver.get("https://www.ecatering.irctc.co.in/");
		
		//initialize the Pages
		com.redbus.testing.utilities.Pages.loadAllPages(b.driver);
		
		
	}
	
	@After
	public void tearDown() {
		b.driver.quit();
	}
}
