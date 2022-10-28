package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);

         driver.findElement(By.xpath("//label[text()='Yes']")).click();

         if(driver.findElement(By.xpath("//input[@id='yesRadio']")).isSelected()){

             System.out.println("The CheckBox is Checked...!!");
         }else{
             System.out.println("The CheckBox is Not Checked...!!");

         }
        Thread.sleep(3000);


         if(driver.findElement(By.id("noRadio")).isEnabled()){

             System.out.println("The CheckBox is Enabled...!!");
         }else{
             System.out.println("The CheckBox is Disabled...!!");
         }
        Thread.sleep(3000);

         if(driver.findElement(By.xpath("//p[text()='You have selected ']")).isDisplayed()){

             System.out.println("My Tase case is Passed");
         }else{

             System.out.println("My Tase case is Failed");
         }
        Thread.sleep(3000);
        driver.quit();
    }
}
