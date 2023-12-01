package com.krafttechnologie.tests.day01_automationintro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        //selenium chrome ile çalışmaya hazır.
        WebDriverManager.chromedriver().setup();
        //driver objesi oluşturduk
        //driver objesi browser ı temsil eder
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.krafttechnologie.com/");
        //ekranı büyüttük
        driver.manage().window().maximize();
        //title
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String actual = driver.getTitle();//ACTUAL = GERÇEK DEĞER.
        String expected = "Kraft Technologie | Uzaktan Eğitim Merkezi";//EXPECTED = BEKLENEN DEĞER.
        if (actual.equals(expected)){
            System.out.println("PASS");
        }else {
            System.err.println("FAIL");
        }

    }
}
/*

 TASK
 Go to "https://www.krafttechnologie.com/"
 validate that title is "Kraft Technologie | Uzaktan Eğitim Merkezi"
 Önce MANUEL TEST YAP
 Sonra OTOMASYONUNU YAZ
 */