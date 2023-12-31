package com.krafttechnologie.tests.TecnicalMentoring;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        /**
         * set up a firefox(chrome) driver
         * navigate to https://www.facebook.com/
         * then navigate to https://testrelic.com/
         * then navigate back
         * then navigate forward
         * then refresh page
         * then close driver
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.manage().window().setPosition(new Point(-1000,0));
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        try {
            Thread.sleep(-2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.navigate().to("https://testrelic.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();

    }
}
/**
 * set up a firefox(chrome) driver
 * navigate to https://www.facebook.com/
 * then navigate to https://testrelic.com/
 * then navigate back
 * then navigate forward
 * then refresh page
 * then close driver
 */