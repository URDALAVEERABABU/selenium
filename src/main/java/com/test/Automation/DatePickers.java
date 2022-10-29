package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        String expectedMonth = "August 2021";
        driver.findElement(By.xpath("//div[@class='input-group date']/child::span")).click();


        while (true){

            String aqctualMonth = driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[@class='datepicker-switch']")).getText();

            if(aqctualMonth.equals(expectedMonth)){
                break;
            }else {
                Thread.sleep(1000);
                driver.findElement(By.xpath(" //div[@class='datepicker-days']/table/thead/tr[2]/th[@class='prev']")).click();

            }

        }
        driver.findElement(By.xpath(" //div[@class='datepicker-days']/table/tbody/descendant::td[text()='14']")).click();



        Thread.sleep(5000);

        driver.quit();
    }
}
