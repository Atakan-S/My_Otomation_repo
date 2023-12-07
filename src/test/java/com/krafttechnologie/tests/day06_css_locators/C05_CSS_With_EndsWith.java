package com.krafttechnologie.tests.day06_css_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C05_CSS_With_EndsWith {
    public static void main(String[] args) throws InterruptedException {
        // ends with kullanmak için TAGNAME[ATT'$'="VALUE"] şeklinde yaparız attiribute ten sonra '$' ekleyerek
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        WebElement loginTitleText = driver.findElement(By.cssSelector("h5[class$=\"fs-4\"]"));
        System.out.println("loginTitleText.getText() = " + loginTitleText.getText());
        //xpath hali => //button[starts-with(@class,'btn btn')]
        //xpath hali => //input[starts-with(@id,'em')]
        driver.findElement(By.cssSelector("input[id$='ail']")).sendKeys("mike@gmail.com");
        driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("mike1234");
        driver.findElement(By.cssSelector("button[class$='w-100']")).click();
        Thread.sleep(2000);
        driver.close();

    }
}
