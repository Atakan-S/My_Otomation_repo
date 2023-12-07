package com.krafttechnologie.tests.day06_css_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C01_CSS_With_Id {
    public static void main(String[] args) throws InterruptedException {
       //CSS de ID üzerinden locate ederken Başına '#' getirerek locate edebiliriz.
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        WebElement emailİnputBox = driver.findElement(By.cssSelector("#email"));
        emailİnputBox.sendKeys("mike@gmail.com");
        Thread.sleep(2000);
        driver.close();
    }
}
