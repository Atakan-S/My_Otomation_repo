package com.krafttechnologie.tests.day08_typeOfWebElement;

import com.beust.ah.A;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_isEnabled {
    @Test
   //isEnabled methodu elementin active mı pasif mi olduguna veya erişilebilir oladuğunu boolean donmdurur
    public void testName() throws InterruptedException {
        /*go to https://the-internet.herokuapp.com/dynamic_controls
         validate that uninteractable button is disabled*/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement textBox = driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println("textBox.isEnabled() = " + textBox.isEnabled());
        WebElement enableButton = driver.findElement(By.xpath("//*[.=\"Enable\"]"));
        enableButton.click();
        Thread.sleep(4000);
        Assert.assertTrue(textBox.isEnabled());
        driver.close();
    }
}
