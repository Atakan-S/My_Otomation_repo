package com.krafttechnologie.tests.day03_webElement;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        driver.manage().window().maximize();
        String email = "mike@gmail.com";
        String password="mike1234";
        String expectedUserNameText = "mike";
        Thread.sleep(2000);
        WebElement emailInputBox = driver.findElement(By.id("email"));
        String value = emailInputBox.getAttribute("type");
        System.out.println(value);
        System.out.println("emailInputBox.getAttribute(\"name\") = " + emailInputBox.getAttribute("name"));
        System.out.println("emailInputBox.getAttribute(\"class\") = " + emailInputBox.getAttribute("class"));
        driver.close();
    }
}
