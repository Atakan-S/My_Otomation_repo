package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C04_Class {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("test@test.com");
        WebElement passwordBox = driver.findElement(By.id("yourPassword"));
        passwordBox.sendKeys("12345678");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        WebElement dashboardButton = driver.findElement(By.className("afm"));
        String actual=dashboardButton.getText();
        String expected= "Dashboard";
        if (actual.equals(expected)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.quit();


    }
}
//TASK
//go to https://www.krafttechexlab.com/login and login with the valid credentials
//email --> test@test.com
//password --> 12345678
//locate the dashboard button by "class name"
//VERIFY dashboard string