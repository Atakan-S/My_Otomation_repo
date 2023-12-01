package com.krafttechnologie.tests.day03_webElement;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyThatURLChanged {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        driver.manage().window().maximize();
       String email = "mike@gmail.com";
       String password="mike1234";

        Thread.sleep(2000);
        WebElement emailInputBox = driver.findElement(By.id("email"));
        //emailInputBox.sendKeys("mike@gmail.com");
        emailInputBox.sendKeys(email);
        Thread.sleep(2000);
        WebElement passwordInputBox = driver.findElement(By.id("yourPassword"));
        passwordInputBox.sendKeys(password);
        Thread.sleep(2000);
        WebElement loginBtn =driver.findElement(By.cssSelector("[type='submit']"));
        Thread.sleep(2000);
        loginBtn.click();
        Thread.sleep(3000);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl="https://www.krafttechexlab.com/index";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS URL is changed");
        }else {
            System.out.println("FAIL URL isn't changed");
        }
        driver.close();
    }
}
/**
 * Class Task D302
 * open chrome browser
 * go to https://www.krafttechexlab.com/login
 * enter email as mike@gmail.com
 * enter password as 12345
 * click login btn
 * verify that Url has changed
 */