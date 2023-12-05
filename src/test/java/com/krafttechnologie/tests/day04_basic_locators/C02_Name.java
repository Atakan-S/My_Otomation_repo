package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C02_Name {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to https://www.krafttechexlab.com/login
        driver.get("https://www.krafttechexlab.com/login");
        //driver is maximized
        driver.manage().window().maximize();
        //located the email box by 'name'
        WebElement emailBox = driver.findElement(By.name("email"));
        //entered data for sendkeys()
        emailBox.sendKeys("test@test.com");
        //locate password box by 'name'
        WebElement passwordBox = driver.findElement(By.name("password"));
        //entered data for sendkeys()
        passwordBox.sendKeys("12345678");
        String emailExpected = "test@test.com";
        String emailActual = emailBox.getAttribute("value");
        String passwordExpected = "12345678";
        String passwordActual = passwordBox.getAttribute("value");
        //Verifry datas
        if (emailExpected.equals(emailActual) && passwordExpected.equals(passwordActual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        Thread.sleep(2000);
        driver.close();
    }
}
/*
         *TASK

go to https://www.krafttechexlab.com/login
locate email box by name
locate password box by name
enter data:
email --> test@test.com
password box --> 12345678
VERIFY THAT INPUT BOXES HAVE THE SAME VALUES
*/