package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TotalLinks {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        List<WebElement> list =  driver.findElements(By.tagName("a"));

        System.out.println("Total Number of Links Present in a Web page are: "+ list.size() );

        for(int i=0; i<list.size(); i++){

            System.out.println(list.get(i).getAttribute("href"));
        }

        Thread.sleep(4000);



        driver.quit();
    }
}
