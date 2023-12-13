package com.krafttechnologie.tests.day09_findElements_dropDowns;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class C03_DropDownMenu_WithoutSelectTag {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver= WebDriverFactory.getDriver("Chrome");
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);        driver.quit();
    }

    @Test
    public void test_1() {
        // go to https://demoqa.com/select-menu
        // locate the "Select Title" web element
        // click on it
        // click on 'Mrs.'
        //NOT eğer locate ediceğimiz yer kayboluyorsa innspect kısmında aşşağıdan  event listenrs kısmına tıklıyoruz ardından
        //blue sekmesındekı herşeyi remove ediyoruz ve sorun çözuluyor
        WebElement selectTitle = driver.findElement(By.xpath("//div[text()=\"Select Title\"]"));
        selectTitle.click();
        WebElement mrsElements = driver.findElement(By.cssSelector("#react-select-3-option-0-2"));
        mrsElements.click();


    }

    @Test
    public void test_2() {
        // go to https://demoqa.com/select-menu
        // locate the "Select Title" web element
        // click on it
        // get all options with findElements()
        WebElement selectTitle = driver.findElement(By.xpath("//div[text()=\"Select Title\"]"));
        selectTitle.click();
        List<WebElement> selectTitleElements = driver.findElements(By.cssSelector("[id^='react-select-3-option-0-']"));
        //size verify
        int actualSize = selectTitleElements.size();
        int expectedSize=6;
        Assert.assertEquals(actualSize,expectedSize);
        for (WebElement selectTitleElement : selectTitleElements) {
            System.out.println("selectTitleElement.getText() = " + selectTitleElement.getText());
        }

    }
}
