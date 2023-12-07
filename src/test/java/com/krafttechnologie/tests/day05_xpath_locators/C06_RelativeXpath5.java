package com.krafttechnologie.tests.day05_xpath_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C06_RelativeXpath5 {
    public static void main(String[] args) throws InterruptedException {
        //go to "https://www.krafttechexlab.com/forms/input"
        //get the text of 'Text' webElement with the following features and make verifications

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/forms/input");

        Thread.sleep(3000);

        //1.parent to child --> mainXpathFormula/tagName
        WebElement element1 = driver.findElement(By.xpath("//div[@class='row mb-3'][1]/label"));
        String element1Text = element1.getText();

        //2.child to parent --> mainXpathFormula/..
        WebElement element2 = driver.findElement(By.xpath("(//input[@type='text'])[1]/../../label"));
        String element2Text = element2.getText();

        //3.from sibling to previous sibling --> xpath/preceding-sibling::*
        WebElement element3 = driver.findElement(By.xpath("(//div[@class='col-sm-10'])[1]/preceding-sibling::*"));
        String element3Text = element3.getText();

        //4.from parent to grandson --> xpath//xpath
        WebElement element4 = driver.findElement(By.xpath("(//form[@method='post']//label)[1]"));
        String element4Text = element4.getText();
        //5. * --> HEPSİ
        WebElement element5 = driver.findElement(By.xpath("//*[.='Text']"));
        String element5Text = element5.getText();

        String expected = "Text";

        //validation
        String result = (element1Text.equals(expected) && element2Text.equals(expected) && element3Text.equals(expected) && element4Text.equals(expected) && element5Text.equals(expected)) ? "PASS" : "FAIL";
        System.out.println("result = " + result);

        driver.quit();


    }
}
//go to "https://www.krafttechexlab.com/forms/input"
//get the text webElement with the following features