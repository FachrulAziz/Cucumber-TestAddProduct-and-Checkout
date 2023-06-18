package com.juaracoding.drivers.strategies;

import com.juaracoding.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", Constants.PATH_GECKO_DRIVER);
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
