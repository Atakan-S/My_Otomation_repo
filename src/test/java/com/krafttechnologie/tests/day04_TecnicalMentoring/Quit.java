package com.krafttechnologie.tests.day04_TecnicalMentoring;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Quit {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.facebook.com/");
        driver.manage().window().setPosition(new Point(-1000,0));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement element = driver.findElement(By.xpath("//a[text()='Click Here']"));
        element.click();
        Thread.sleep(2000);
        driver.close();


    }
}
