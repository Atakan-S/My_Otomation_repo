package com.krafttechnologie.tests.day10_typeOfWebElements3;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C03_ItFrame {
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
    public void test_iframe() throws InterruptedException {
        //text çerçevesi locate etme
        driver.get("https://the-internet.herokuapp.com/iframe");
        //text area ya erişmek için  area id si ile switchto.frame methodlarını kujllanrak textin içine giriyoruz
        //fakat bu text areaların farklı bir html kodu oluyor oda iframe adında bir tagın içinde oluşturuluyor
        //burada aldğımız id iframe tagı ile başlayan kodun id value su
        //1.yol
        driver.switchTo().frame("mce_0_ifr");
        WebElement textArea = driver.findElement(By.cssSelector("#tinymce"));
        textArea.clear();
        textArea.sendKeys("atakan is here");
        //2.yol -- index ile
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        driver.switchTo().frame(0);
        WebElement textArea2 = driver.findElement(By.cssSelector("#tinymce"));
        textArea.clear();
        textArea.sendKeys("atakan is here");
        //3.yol tagname ile
        //Thread.sleep(2000);
        //WebElement iframe = driver.findElement(By.tagName("iframe"));
        //driver.switchTo().frame(iframe);
        //WebElement textArea3 = driver.findElement(By.cssSelector("#tinymce"));
        //textArea.clear();
        //textArea.sendKeys("atakan is here");


    }

    @Test
    public void test_nestedFrame() {
        //eğer childdakı bir frame e geçke istersek once parenta gidip ondan sonra childa inebiliriz
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");
        System.out.println("driver.findElement(By.id(\"content\")).getText() = " + driver.findElement(By.id("content")).getText());
        //bu bızı parent frame e goturur
        driver.switchTo().parentFrame();
        driver.switchTo().frame(2);
        System.out.println("driver.findElement(By.tagName(\"body\")).getText() = " + driver.findElement(By.tagName("body")).getText());
        //baştakı html e goturur
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        System.out.println("driver.findElement(By.tagName(\"body\")).getText() = " + driver.findElement(By.tagName("body")).getText());


    }
}
