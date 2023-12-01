package com.krafttechnologie.tests.day03_webElement;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyThatConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        driver.manage().window().maximize();
        String email = "mike@gmail.com";
        String password="mike1234";
        String expectedUserNameText = "mike";

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
        WebElement profilUserName = driver.findElement(By.cssSelector("[class='d-none d-md-block dropdown-toggle ps-2']"));
        String actualUserNameText = profilUserName.getText();




        if (actualUserNameText.equals(expectedUserNameText)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        driver.close();
    }
}
/**
 * Class Task D303
 * open chrome browser
 * go to https://www.krafttechexlab.com/login  page
 * enter email as mike@gmail.com
 * enter password as mike1234
 * click login button
 * verify that username is "mike"
 */