package com.krafttechnologie.tests.day05_xpath;

import com.krafttechnologie.utilities.IfVerifry;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C03_RelativeXpath2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/forms/input");
        WebElement passwordElement = driver.findElement(By.xpath("//label[starts-with(@for,'inputP')]"));
        String actual = passwordElement.getText();
        String expected = "Password";
        IfVerifry.equalsTest(actual,expected);
        driver.quit();


    }
}
/*

 go to https:"www.krafttechexlab.com/forms/input"
 locate password webElement with starts-with(@attribute, value)
 validate that text is Password
 */