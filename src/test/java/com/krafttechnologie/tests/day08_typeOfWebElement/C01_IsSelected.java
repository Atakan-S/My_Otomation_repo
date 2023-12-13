package com.krafttechnologie.tests.day08_typeOfWebElement;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_IsSelected {
    @Test
    public void radioButton() {
        //webElement.isSelected = element seçili mi diye bakar.
//assert true = içindeki condition true mu diye bakar
/*go to https://www.krafttechexlab.com/forms/radio
 validate that "Checked Radio 1" is already selected*/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/forms/radio");
        WebElement radioButton1 = driver.findElement(By.cssSelector("#gridRadios1"));
        boolean selected = radioButton1.isSelected();
        Assert.assertTrue(selected);
        WebElement radioButton2 = driver.findElement(By.cssSelector("#gridRadios2"));
        boolean selected2 = radioButton2.isSelected();
        Assert.assertFalse(selected2);
        radioButton2.click();
        Assert.assertTrue(radioButton2.isSelected());
        driver.close();
    }

    @Test
    public void checkBoxs() {
        /*go to https://www.krafttechexlab.com/forms/checkbox
         validate that "Checkbox1" is not selected
         validate that "Checkbox2" is already selected*/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/forms/checkbox");
        WebElement checkBox1 = driver.findElement(By.cssSelector("#gridCheck1"));
        Assert.assertFalse(checkBox1.isSelected());
        WebElement checkBox2 = driver.findElement(By.cssSelector("#gridCheck2"));
        Assert.assertTrue(checkBox2.isSelected());
        driver.quit();


    }
}
