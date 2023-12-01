package com.krafttechnologie.tests.day02_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    /**

     TASK
     open chrome and navigate to "https://www.google.com/"
     go to "https://www.amazon.com/"
     go back (google)
     go forward (amazon)
     refresh the page (amazon)
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //  driver.get("https://www.google.com/");
      //  navigate().to() == get()
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        // google a geri dön
        driver.navigate().back();
        Thread.sleep(2000);
        //amazona dön
        driver.navigate().forward();
        Thread.sleep(2000);
        //refresh yap
        driver.navigate().refresh();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String actual = driver.getTitle();//ACTUAL = GERÇEK DEĞER.
        String expected = "Amazon.com";//EXPECTED = BEKLENEN DEĞER.
        if (actual.equals(expected)){
            System.out.println("PASS");
        }else {
            System.err.println("FAIL");
        }


    }
}
