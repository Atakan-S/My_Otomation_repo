package com.krafttechnologie.tests.day05_xpath_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C03_RelativeXpath2 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * go to https:"www.krafttechexlab.com/forms/input"
         * locate password webElement with starts-with(@attribute, value)
         * validate that text is Password
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/forms/input");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//label[starts-with(@for,'inputP')]"));
        String actualPasswordText = password.getText();
        String expected = "Password";
        if(actualPasswordText.equals(expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        /**
         * locate password webElement with starts-with(text(), value)
         * validate that text is Password
         */
        WebElement password1 = driver.findElement(By.xpath("//label[starts-with(text(),'P')]"));
        String actualPasswordText1 = password1.getText();
        if(actualPasswordText1.equals(expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.quit();

    }
}
/*

 go to https:"www.krafttechexlab.com/forms/input"
 locate password webElement with starts-with(@attribute, value)
 validate that text is Password
 */