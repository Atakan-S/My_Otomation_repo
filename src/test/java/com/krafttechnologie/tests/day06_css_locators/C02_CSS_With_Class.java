package com.krafttechnologie.tests.day06_css_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C02_CSS_With_Class {
    public static void main(String[] args) throws InterruptedException {
        //CSS de Class üzerinden locate ederken Başına ve boşluk varsa arasına '.' getirerek locate edebiliriz.
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        WebElement emailİnputBox = driver.findElement(By.cssSelector(".form-control"));
        WebElement loginBox = driver.findElement(By.cssSelector(".card-title.text-center.pb-0.fs-4"));
        emailİnputBox.sendKeys("mike@gmail.com");
        System.out.println("loginBox.getText() = " + loginBox.getText());
        Thread.sleep(2000);
        driver.close();
    }
}
