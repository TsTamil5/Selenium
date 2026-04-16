package com.redbus.testing.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {""},
glue="stepdefinition",
dryRun=false)
public class RunnerIO extends AbstractTestNGCucumberTests{
	
}
