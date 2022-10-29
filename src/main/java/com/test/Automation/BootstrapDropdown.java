package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String optiontoSelect = "Mrs.";
        String xpath = String.format("//div[text()='%s']",optiontoSelect );
        System.out.println(xpath);
        driver.findElement(By.xpath("//div[text()='Select Title']/parent::div/following-sibling::div/div")).click();
        driver.findElement(By.xpath(xpath)).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
