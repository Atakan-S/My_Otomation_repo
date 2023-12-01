package com.krafttechnologie.tests.day03_webElement;

import com.krafttechnologie.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class VeifiryThatURLNotChange {
/*
 *Class task
 * open the chrome browser
 * go to https://www.krafttechexlab.com/login
 * click login button
 * verifry that url did NOT changed
 */
public static void main(String[] args) throws InterruptedException {

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.get("https://www.krafttechexlab.com/login");
    driver.manage().window().maximize();
    String actual=driver.getCurrentUrl();
    WebElement loginBtn =driver.findElement(By.cssSelector("[type='submit']"));
    Thread.sleep(3000);
    loginBtn.click();
   // String actual="https://www.krafttechexlab.com/login";
    String expected=driver.getCurrentUrl();
    if (actual.equals(expected)){
        System.out.println("URL's is same");
    }else {
        System.out.println("URL is Changed");
    }


    Thread.sleep(3000);
    driver.close();

}
}
