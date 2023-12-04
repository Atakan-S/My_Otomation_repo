package com.krafttechnologie.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String driverType) {
        if (driverType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            return driver;

        } else if (driverType.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            WebDriver driver = new SafariDriver();
            return driver;

        } else if (driverType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            return driver;

        }else if (driverType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            return driver;

        }
        return null;
    }
}


// WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
/**
 * write a static method that is named getDriver
 * it takes a string parameter (browserType)
 * it will return a WebDriver based on parameter (chrome, safari, firefox) and set up the browser for the test
 */