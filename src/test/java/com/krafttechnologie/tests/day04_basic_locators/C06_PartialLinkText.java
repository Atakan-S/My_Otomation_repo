package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C06_PartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to https://www.krafttechexlab.com/login
        driver.get("https://www.krafttechexlab.com/login");
        //driver is maximized
        driver.manage().window().maximize();
        //html koddaki texti aldık
        WebElement registerLink = driver.findElement(By.partialLinkText(" an account"));
        Thread.sleep(2000);
        registerLink.click();
        Thread.sleep(2000);
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.krafttechexlab.com/register";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.quit();
    }
    }

/*
         *TASK

go to https://www.krafttechexlab.com/login
locate "Create an account" button by Partiallinktext
click on the button
verify that url is "https://www.krafttechexlab.com/register"*/