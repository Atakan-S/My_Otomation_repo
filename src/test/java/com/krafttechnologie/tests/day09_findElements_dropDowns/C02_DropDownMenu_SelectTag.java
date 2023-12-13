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

public class C02_DropDownMenu_SelectTag {
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
    public void test_getOptions() {
        // go to https://demoqa.com/select-menu
        // Old Style Select Menu
        // get all options(web elements) as a list
        //verify that the number of webElement is 11
        WebElement dropDownMenu = driver.findElement(By.cssSelector("#oldSelectMenu"));
        Select select = new Select(dropDownMenu);
        //seleniumdan gelen select class ı ile bir obje olusturduk locate etttiğimiz elementi içine attık ve select class ının
        // methodlarını kullanmaya başladık

        List<WebElement> options = select.getOptions();
        System.out.println("options.size() = " + options.size());


    }

    @Test
    public void test_selectByVisibleText() {
        //old style select menu
        //blue objesine eriş
        WebElement dropDownMenu = driver.findElement(By.cssSelector("#oldSelectMenu"));
        Select select = new Select(dropDownMenu);
        //gorunen text ile selectByVisibleText kullanarak  listeden şeçtik
        select.selectByVisibleText("Blue");
       //firstSelectedOption o anda select listte seçili olan elementı alır
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        String actual= firstSelectedOption.getText();
        String expected="Blue";
        Assert.assertEquals(actual,expected);


    }

    @Test
    public void test_SelectByIndexNum() throws InterruptedException {
        WebElement dropDownMenu = driver.findElement(By.cssSelector("#oldSelectMenu"));
        Select select = new Select(dropDownMenu);
        //bu sefer index ile selectByIndex kullanarak  listeden şeçtik
        select.selectByIndex(2);
        //firstSelectedOption o anda select listte seçili olan elementı alır
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        String actual= firstSelectedOption.getText();
        String expected="Green";
        Assert.assertEquals(actual,expected);


    }

    @Test
    public void test_SelectByValue() {
        WebElement dropDownMenu = driver.findElement(By.cssSelector("#oldSelectMenu"));
        Select select = new Select(dropDownMenu);
        // src koddakı ilglili seçeneğin value sunu alarak girdik ve seçtirdik
        select.selectByValue("7");
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        String actual= firstSelectedOption.getText();
        String expected="Voilet";
        Assert.assertEquals(actual,expected);

    }
}
