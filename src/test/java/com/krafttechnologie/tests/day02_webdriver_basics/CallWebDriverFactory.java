package com.krafttechnologie.tests.day02_webdriver_basics;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {
        String chrome="chrome";
        String firefox="firefox";
        String edge="edge";
        String browsertype="";
        for (int i = 0; i <3; i++) {
        if (i==0){
            browsertype=chrome;
        } else if (i==1) {
            browsertype=firefox;
        } else if (i==2) {
            browsertype=edge;
        }

            WebDriver driver = WebDriverFactory.getDriver(browsertype);
        driver.get("https://www.krafttechnologie.com/tr/index");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String actual = driver.getCurrentUrl();
        String expected = "https://www.krafttechnologie.com/tr/index";
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.quit();
    }
}
}
