package com.krafttechnologie.tests.day02_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetUrl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.krafttechnologie.com/");
        String actualTıtle = driver.getTitle();//ACTUAL = GERÇEK DEĞER.
        String expectedTıtle = "Kraft Technologie | Uzaktan Eğitim Merkezi";//EXPECTED = BEKLENEN DEĞER.
        if (actualTıtle.equals(expectedTıtle)){
            System.out.println("TITLE PASS");
        }else {
            System.err.println("TITLE FAIL");
        }

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl ="https://www.krafttechnologie.com/tr/index";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL PASS");
        }else {
            System.err.println("URL FAIL");
        }
        //webpage source codunu alma işlemi
        System.out.println("driver.getPageSource() = " + driver.getPageSource());
        String pageSrc= driver.getPageSource();
        driver.close();


    }
}
/*

 TASK
 Open safari and navigate to https://www.krafttechnologie.com/
 get title and display (then verify)
 get current url and display (then verify)
 get pageSource and display
 */