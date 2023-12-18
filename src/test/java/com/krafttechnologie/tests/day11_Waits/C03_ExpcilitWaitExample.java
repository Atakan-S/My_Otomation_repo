package com.krafttechnologie.tests.day11_Waits;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C03_ExpcilitWaitExample {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test_explicitWait_Visible() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//div[@id=\"start\"]/button"));
        startButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement helloText = driver.findElement(By.xpath("//div[@id=\"finish\"]/h4"));
        //wait classı sayesınde elemet gorunene kadar bekle dşye bir kod yazdık aşşağıda
        wait.until(ExpectedConditions.visibilityOf(helloText));
         Assert.assertEquals(helloText.getText(), "Hello World!");

    }

    @Test
    public void test_explicitWait_clickble() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//*[text()='Enable']")).click();
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));

        wait = new WebDriverWait(driver, 15);
        //wait classı sayesınde elemet cliklenebilir olana kadar bekle diye bir kod yazdık aşşağıda
        wait.until(ExpectedConditions.elementToBeClickable(inputBox));
        inputBox.sendKeys("atakan");

        WebElement message = driver.findElement(By.cssSelector("#message"));
        Assert.assertEquals(message.getText(), "It's enabled!");

        //ElementNotInteractableException

    }

    @Test
    public void test_explicitWait_Alert() {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("timerAlertButton")).click();
        wait = new WebDriverWait(driver, 15);
        //buradada alert gorunene kadar bekle olarak komut verdik
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
