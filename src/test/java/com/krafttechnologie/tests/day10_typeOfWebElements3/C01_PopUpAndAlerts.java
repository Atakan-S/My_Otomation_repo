package com.krafttechnologie.tests.day10_typeOfWebElements3;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C01_PopUpAndAlerts {
    WebDriver driver;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver= WebDriverFactory.getDriver("Chrome");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);        driver.quit();
    }

    @Test
    public void test_htmlPopUp() throws InterruptedException {
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=53b78");
        Thread.sleep(2000);
        WebElement confirmButton = driver.findElement(By.xpath("//*[text()='Confirm'][1]"));
        confirmButton.click();
        WebElement popUpButton = driver.findElement(By.xpath("(//*[text()='Yes'])[2]"));
        popUpButton.click();
        Thread.sleep(2000);
        WebElement verifyBox = driver.findElement(By.xpath("(//*[text()='You have accepted'])"));
        System.out.println("verifyBox.getText() = " + verifyBox.getText());
        Assert.assertEquals(verifyBox.getText(),"You have accepted");
    }
}
