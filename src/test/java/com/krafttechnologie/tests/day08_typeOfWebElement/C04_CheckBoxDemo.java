package com.krafttechnologie.tests.day08_typeOfWebElement;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_CheckBoxDemo {
    @Test
    public void testName() throws InterruptedException {
        /*go to "https://demoqa.com/automation-practice-form"
 validate that sports checkBox is not selected default*/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/automation-practice-form");
        //checkbox un kendı elementı ıle locate edemediğimiz bir durum vardı parent ını locate ederek durumu çözdük
        WebElement checkBox = driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-1\"]/.."));
        WebElement checkBox2 = driver.findElement(By.cssSelector("#hobbies-checkbox-1"));
        System.out.println("checkBox.isSelected() = " + checkBox.isSelected());
        Assert.assertFalse(checkBox.isSelected());
        Thread.sleep(3000);
        checkBox.click();
        Thread.sleep(3000);
        Assert.assertTrue(checkBox2.isSelected());
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void test2() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/text-box");
        WebElement userName = driver.findElement(By.cssSelector("#userName-label"));
        System.out.println("userName.getAttribute(\"class\") = " + userName.getAttribute("class"));
        System.out.println("userName.getAttribute(\"id\") = " + userName.getAttribute("id"));


        /*

         go to https://demoqa.com/text-box
         locate FullName webElement and get all values of webElement with getAttribute method*/
    }

    @Test
    public void test3() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demo.aspnetawesome.com/");
        WebElement element = driver.findElement(By.cssSelector(".o-chkico"));
        element.click();
    }
}
