package com.krafttechnologie.tests.day05_xpath_locators;

import com.krafttechnologie.utilities.IfVerifry;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class C01_AbsoluteXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/");
        Thread.sleep(1000);
        //Burada xpathle locate ettik xpathi src coddakı kod sıralamasına gore ayarladık '/' kullanara taglar arasında geçiş yaptık parenttan
        // childlara doğru ilerledik ve en son istedğimiz elementin kodunda durduk
        WebElement homeButton = driver.findElement(By.xpath("/html/body/main/div/nav/ol/li/a"));
       String actualElement=homeButton.getText();
       String expectedElement="Home";
       if (actualElement.equals(expectedElement)){
           System.out.println("PASS");
       }else {
           System.out.println("FAIL");
       }
       //aynı şeyi buradada yaptık ancak isteğimiz sonuctan 2 adet çıktı o yuzden son elementın yanına bir  index açarak
       //içine 2.indextekini almak istediğimizi girdik
       WebElement dashButton = driver.findElement(By.xpath("/html/body/main/div/nav/ol/li[2]"));
        String actualElement1=dashButton.getText();
        String expectedElement1="Dashboard";
        IfVerifry.equalsTest(actualElement1,expectedElement1);
       driver.quit();

    }
}
/*

TASK
go to https://www.krafttechexlab.com/
get the 'Home' webElement by absolute xpath
get the 'Dashboard' webElement by absolute xpath
validate text of webElements*/