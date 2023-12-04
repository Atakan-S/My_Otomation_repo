package com.krafttechnologie.tests.day04_TecnicalMentoring;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.close();
         WebDriver driver2 = WebDriverFactory.getDriver("chrome");
        driver2.get("https://testrelic.com/");
        Thread.sleep(2000);
        driver.quit();



    }
}
