package com.krafttechnologie.tests.day06_css_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C04_CSS_With_AttributeValue {
    public static void main(String[] args) throws InterruptedException {
        //CSS de value üzerinden locate ederken Başına ve sonuna '[]' getirerek ve attributeu full olarak ["Attribute="value"] locate edebiliriz. => xpath ("//input[@type='password']")
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        // attribute & value
        WebElement emailBox = driver.findElement(By.cssSelector("[name='email']"));
        emailBox.sendKeys("atakan@gmail.com");
        //tag name and attribute & value => xpath ("//input[@type="password"]")
        // burda ise tagname+[att="value"] şeklinde
        WebElement passwordBox = driver.findElement(By.cssSelector("input[type=\"password\"]"));
        passwordBox.sendKeys("123ata123");
        WebElement loginButton = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        loginButton.click();
        Thread.sleep(2000);
        driver.close();
    }
}
