package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Demo QA Page");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("demoqa@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}
