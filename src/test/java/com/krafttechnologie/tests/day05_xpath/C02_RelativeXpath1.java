package com.krafttechnologie.tests.day05_xpath;

import com.krafttechnologie.utilities.IfVerifry;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C02_RelativeXpath1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");
        WebElement cerezAccept = driver.findElement(By.xpath("//input[@id='sp-cc-accept']"));
        cerezAccept.click();
        // TAGNAME[@ATTRİBUTE='value'] formulu ile search barı locate ettik
        WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Thread.sleep(2000);
        searchBar.sendKeys("selenium");
        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Git']"));
        Thread.sleep(2000);
        searchButton.click();
        WebElement seleniumText = driver.findElement(By.xpath("//span[text()='\"selenium\"']"));
        String actualText = seleniumText.getText();
        String expectedText ="\"selenium\"";
        IfVerifry.equalsTest(actualText,expectedText);
        driver.quit();


    }
}
//go to amazon.com.tr
//locate search bar with xpath
//locate search button with xpath