package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C03_TagName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to https://www.krafttechexlab.com/login
        driver.get("https://www.krafttechexlab.com/login");
        //driver is maximized
        driver.manage().window().maximize();
        WebElement loginButton = driver.findElement(By.tagName("button"));
        Thread.sleep(1000);
        String actualUrl=driver.getCurrentUrl();
        Thread.sleep(1000);
        loginButton.click();
        Thread.sleep(1000);
        String expectedUrl=driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }



    }
}
/*
         *TASK

go to https://www.krafttechexlab.com/login
locate login button by tag name
click on login button
VERIFY that URL is still same*/