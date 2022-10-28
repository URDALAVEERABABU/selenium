package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsinSelenium {

    public static void main(String[] args) throws InterruptedException {

        //  driver.switchTo().alert().accept();  --> Click On "OK" Button in an Alert
        //  driver.switchTo().alert().dismiss();  --> Click On "Cancel" Button in an Alert
        // driver.switchTo().alert().getText();  --> Used to Get Text Present in Alert Box
        // driver.switchTo().alert().Sendkeys()  --> Used to Enter the Text in a TextBox present in an Alert.

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
        Thread.sleep(7000);
        driver.switchTo().alert().accept();


        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
        Thread.sleep(2000);

        String str =  driver.switchTo().alert().getText();
        System.out.println(str);
        driver.switchTo().alert().dismiss();

       Thread.sleep(1000);

       driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().sendKeys("Welcome to DEMO QA");
        driver.switchTo().alert().accept();

        driver.switchTo().alert().accept();

        Thread.sleep(5000);
        driver.quit();
    }
}
