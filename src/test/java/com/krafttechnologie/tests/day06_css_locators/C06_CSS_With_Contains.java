package com.krafttechnologie.tests.day06_css_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C06_CSS_With_Contains {
    public static void main(String[] args) throws InterruptedException {
        // Contains kullanmak için TAGNAME[ATT'*'="VALUE"] şeklinde yaparız attiribute ten sonra '*' ekleyerek
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        WebElement loginTitleText = driver.findElement(By.cssSelector("h5[class*=\"fs-4\"]"));
        System.out.println("loginTitleText.getText() = " + loginTitleText.getText());
        driver.findElement(By.cssSelector("input[id*='ail']")).sendKeys("ata@gmail.com");
        driver.findElement(By.cssSelector("input[id*='word']")).sendKeys("Ata1234567");
        driver.findElement(By.cssSelector("button[class*='w-100']")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
