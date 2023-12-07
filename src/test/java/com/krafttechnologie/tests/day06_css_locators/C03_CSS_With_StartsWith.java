package com.krafttechnologie.tests.day06_css_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C03_CSS_With_StartsWith {
    public static void main(String[] args) throws InterruptedException {
        // starst with kullanmak için TAGNAME[ATT'^'="VALUE"] şeklinde yaparız attiribute ten sonra '^' ekleyerek
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        WebElement loginTitleText = driver.findElement(By.cssSelector("h5[class^=\"card-title\"]"));
        System.out.println("loginTitleText.getText() = " + loginTitleText.getText());
        //xpath hali => //button[starts-with(@class,'btn btn')]
        //xpath hali => //input[starts-with(@id,'em')]
        driver.findElement(By.cssSelector("input[id^='em']")).sendKeys("mike@gmail.com");
        driver.findElement(By.cssSelector("input[id^='yourP']")).sendKeys("mike1234");
        driver.findElement(By.cssSelector("button[class^='btn btn']")).click();




        Thread.sleep(2000);
        driver.close();
    }
}
