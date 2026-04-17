package com.redbus.testing.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"./src/test/java/com/redbus/testing/featurefiles/FoodOrder.feature"},
glue="com.redbus.testing.stepdefinition",
dryRun=false)
public class RunnerIO extends AbstractTestNGCucumberTests{
	
}
