package com.krafttechnologie.tests.day05_xpath_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C02_RelativeXpath1 {
    public static void main(String[] args) throws InterruptedException {
        //go to amazon.com.tr
        //locate search bar with xpath
        //locate search button with xpath

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement cerezAccept = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
        cerezAccept.click();

        Thread.sleep(2000);

        //locate search bar with tagName, attribute and value
        WebElement searchBar = driver.findElement(By.xpath("//input[@autocomplete='off']"));
        searchBar.sendKeys("selenium");

        Thread.sleep(2000);

        //locate search button with tagName, attribute and value
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();

        Thread.sleep(2000);

        //locate selenium webElement with xpath/text method
        WebElement seleniumText = driver.findElement(By.xpath("//span[text()='\"selenium\"']"));
        WebElement seleniumText2 = driver.findElement(By.xpath("//span[.='\"selenium\"']"));
        String actualText1 = seleniumText.getText();
        String actualText2 = seleniumText2.getText();
        String expectedText = "\"selenium\"";

        if(actualText1.equals(expectedText) && actualText2.equals(expectedText)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.quit();


    }
}
//go to amazon.com.tr
//locate search bar with xpath
//locate search button with xpath