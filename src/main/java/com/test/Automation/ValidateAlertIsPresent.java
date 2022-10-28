package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateAlertIsPresent {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

       // driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        //Thread.sleep(2000);

        if(isAlertPresent(driver)){
            System.out.println(" ALert present in a Web Page....!!!");
            driver.switchTo().alert().accept();
        }else {

            System.out.println("No ALert present in a Web Page....!!!");
        }

        driver.quit();
    }


    public static boolean isAlertPresent(WebDriver driver){


        try {
            driver.switchTo().alert();
            return true;
        }catch (NoAlertPresentException e){
            return false;
        }

    }
}
