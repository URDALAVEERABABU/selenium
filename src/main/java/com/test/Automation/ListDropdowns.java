package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListDropdowns {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//nav[@aria-label='Topbar Menu']/ul/li[1]")).click();

        Thread.sleep(2000);

       List<WebElement>  list = driver.findElements(By.xpath("//nav[@aria-label='Topbar Menu']/ul/li[1]/child::ul/li/a"));

        for(int i=0; i<list.size(); i++){

            if(list.get(i).getText().equals("Data Import")){

                list.get(i).click();
                break;
            }
        }



        Thread.sleep(5000);
        driver.quit();
    }
}
