package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C01_Id {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to https://www.krafttechexlab.com/login
        driver.get("https://www.krafttechexlab.com/login");
        //driver is maximized
        driver.manage().window().maximize();
        //located the email box by id
        WebElement emailBox = driver.findElement(By.id("email"));
        //entered data for sendkeys()
        emailBox.sendKeys("test@test.com");
        //locate password box by id
        WebElement passwordBox = driver.findElement(By.id("yourPassword"));
        //entered data for sendkeys()
        passwordBox.sendKeys("12345678");
        //Datas
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
/**
 * TASK
 * go to https://www.krafttechexlab.com/login
 * locate the email box by id
 * locate password box by id
 * enter data:
 * 1.email --> test@test.com
 * 2.password --> 12345678
 * VERIFY THAT INPUT BOXES HAVE THE SAME VALUE
 */