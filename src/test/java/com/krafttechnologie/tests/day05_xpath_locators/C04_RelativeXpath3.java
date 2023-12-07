package com.krafttechnologie.tests.day05_xpath_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C04_RelativeXpath3 {
    public static void main(String[] args) throws InterruptedException {
        {

            /**
             * go to "https://www.krafttechexlab.com/forms/elements"
             * get Color Picker webElement with contains(@attribute, 'value')
             * validate text
             */

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("https://www.krafttechexlab.com/forms/elements");

            //locate webElement with contains formula(@attribute, value)
            WebElement colorPicker = driver.findElement(By.xpath("//label[contains(@for,'Color')]"));
            String actualValue = colorPicker.getText();
            String expectedValue = "Color Picker";
            if(actualValue.equals(expectedValue)) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }

            Thread.sleep(3000);

            /**
             * get Color Picker webElement with contains(text(), 'value')
             * validate text
             */
            //locate webElement with contains formula (@attribute, value)
            WebElement colorPicker2 = driver.findElement(By.xpath("//label[contains(text(),'Picker')]"));
            String actualValue2 = colorPicker2.getText();
            if(actualValue2.equals(expectedValue)) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }

            driver.quit();
    }
}
}
/**

 go to "https://www.krafttechexlab.com/forms/elements"
 get Color Picker webElement with contains(@attribute, 'value')
 validate text*/