package com.krafttechnologie.tests.day08_typeOfWebElement;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_IsDisplayed {

    @Test
    //isDisabled methodu elementın gorunur olup olmadığını boolean dondurur
    public void testName() throws InterruptedException {
        /*go to https://the-internet.herokuapp.com/dynamic_loading/1
         validate that Start button is displayed*/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//button[.=\"Start\"]"));
        System.out.println("startButton.isDisplayed() = " + startButton.isDisplayed());
        Assert.assertTrue(startButton.isDisplayed());
        startButton.click();
        Thread.sleep(6000);
        WebElement text = driver.findElement(By.xpath("//h4[.=\"Hello World!\"]"));
        System.out.println("text.isDisplayed() = " + text.isDisplayed());
        Assert.assertTrue(text.isDisplayed());
        driver.close();
    }
}
