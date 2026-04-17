package com.redbus.testing.utilities;

import org.openqa.selenium.WebDriver;

public class Base {

    public WebDriver driver;  

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {   
        this.driver = driver;
    }
}