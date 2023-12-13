package com.krafttechnologie.tests.day09_findElements_dropDowns;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class C01_ListOfElements {
   //instance (object)
   //static (class)
   //lochal (method)
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver= WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
       /*go to https://www.krafttechexlab.com/javascript/clicks
get all buttons into a list*/

        driver.get("https://www.krafttechexlab.com/javascript/clicks");
        //Tek locator ile bulduğumuz 4 elementi listin içine attık.
        List<WebElement> elements = driver.findElements(By.cssSelector(".btn.btn-primary"));
        System.out.println("elements.size() = " + elements.size());
       //size'ı verifry ettik
        Assert.assertEquals(elements.size(),4);
        //istediğimiz elemeti get methodu ile index vererek elde edip objeye attık
        WebElement webElement3 = elements.get(2);
        Thread.sleep(3000);
        // elementin textini alıp verifry ettik
        System.out.println("webElement1.getText() = " + webElement3.getText());
        Assert.assertEquals(webElement3.getText(),"Click Me");
        // 3.elemente click yaptık
        elements.get(3).click();

        Thread.sleep(3000);

    }

    @Test
    public void test2() {
        /*go to https://www.krafttechexlab.com/javascript/clicks
try to locate any web element with findElements() method with a wrong formula
see how it behaves*/

        driver.get("https://www.krafttechexlab.com/javascript/clicks");
        List<WebElement> elements = driver.findElements(By.xpath("wrongformula"));
        System.out.println("elements.size() = " + elements.size());
        Assert.assertTrue(elements.isEmpty());


    }
}
