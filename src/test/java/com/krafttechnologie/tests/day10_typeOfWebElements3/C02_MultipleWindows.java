package com.krafttechnologie.tests.day10_typeOfWebElements3;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class C02_MultipleWindows {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = WebDriverFactory.getDriver("Chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test_MultipleWindowTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement linkButton = driver.findElement(By.linkText("Click Here"));
        linkButton.click();
        Thread.sleep(4000);
        //windowun ID sını almaya yarar
        String currentTab = driver.getWindowHandle();
        System.out.println("windowHandle = " + currentTab);
        //getWindowHandles ise açılan tum encerelerın ıd sini bir listin içine atar
        Set<String> windowHandles = driver.getWindowHandles();
        for (String tab : windowHandles) {
            // burada gormek isteğimiz windowların IDleri
            System.out.println("tab = " + tab);
            if (!tab.equals(currentTab)) {
                //eğer Id ılk sayfadakı ıd ye eşit değilse switchTo methodu ile yeni pencereye geç dedik
                driver.switchTo().window(tab);
            }
        }
    }

    @Test
    public void test_multipleWindow2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement linkButton = driver.findElement(By.linkText("Click Here"));
        linkButton.click();
        linkButton.click();
        String currentTab = driver.getWindowHandle();
        Thread.sleep(4000);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String tab : windowHandles) {
            //burada tüm açılan sayflarda gezdık ve son sayfayı seçili hale getirdik
            driver.switchTo().window(tab);
          /*  if (driver.getTitle().equals("New Window")) {
                System.out.println("driver.getTitle() = " + driver.getTitle());
                System.out.println("currentTab = " + currentTab);
                System.out.println("tab = " + tab);
            break;
            burada Id ile window değiştirdi }*/
        // şimdi ise url ile yapıacz

            if (driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/windows/new")){
                break;

            }
            Thread.sleep(2000);
        }
    }
}
