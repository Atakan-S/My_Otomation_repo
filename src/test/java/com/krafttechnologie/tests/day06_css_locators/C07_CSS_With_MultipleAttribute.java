package com.krafttechnologie.tests.day06_css_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C07_CSS_With_MultipleAttribute {
    public static void main(String[] args) throws InterruptedException {
        //MULTİPLE yaparken TAGNAME(optional)[ATT="VALUE"][ATT="VALUE"] şeklinde alırız xpath=> //TAGNAME[@ATT=VALUE (OR,AND) ATT=VALUE] YADA [@ATT="VALUE"][@ATT="VALUE"]
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        WebElement loginTitleText = driver.findElement(By.cssSelector("[class=\"card-title text-center pb-0 fs-4\"]"));
        System.out.println("loginTitleText.getText() = " + loginTitleText.getText());
        driver.findElement(By.cssSelector("[type=\"text\"][name=\"email\"]")).sendKeys("ata@gmail.com");
        driver.findElement(By.cssSelector("[type=\"password\"][name=\"password\"]")).sendKeys("Ata1234567");
        driver.findElement(By.cssSelector("[class=\"btn btn-primary w-100\"][type=\"submit\"]")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
