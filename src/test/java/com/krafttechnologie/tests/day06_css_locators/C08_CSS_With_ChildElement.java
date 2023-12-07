package com.krafttechnologie.tests.day06_css_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C08_CSS_With_ChildElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        //CSS te TAGNAME>TAGNAME>TAGNAME olarak parenttan childa ilerleyebiliriz Xpath=> //TAGNAME/TAGNAME/TAGNAME
        driver.findElement(By.cssSelector("form>div>input")).sendKeys("ata@gmail.com");
        //Parenttan grandchilda direk atlamak istersek css te boşluk kullanıyoruz TAGNAME TAGNAME Xpath=> //tagname//tagname
        //bir başka tip olarak "tagname(PARENT)[ATT='VALUE'] tagname(GRANDCHILD)[ATT='VALUE']"
        driver.findElement(By.cssSelector("form[method='post'] input[name='password']")).sendKeys("Ata1234567");

        Thread.sleep(2000);
        driver.close();
}
}
