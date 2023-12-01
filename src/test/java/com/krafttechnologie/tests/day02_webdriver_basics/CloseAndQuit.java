package com.krafttechnologie.tests.day02_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
       // WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.krafttechnologie.com/tr/index");
        Thread.sleep(2000);
        //close metodu geçerli sekmeyi kapatır
        driver.close();
        Thread.sleep(2000);
        WebDriver driver2 = new EdgeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.amazon.com/");
        Thread.sleep(2000);
        //quit methodu bütün sekmeleri kapatır
        driver2.quit();


    }
}
/**

 TASK-1
 open safari browser
 go to "https://www.krafttechexlab.com/"
 close the browser with close() method
 *
 TASK-2
 go to "https://www.amazon.com/"
 close the browser with quit() method
 */