package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@title='Expand all']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Home']")).click();
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//*[local-name()='svg' and @class='rct-icon rct-icon-check']/*[local-name()='path']"));

      for(int i=0; i<list.size(); i++){

          if(list.get(i).isSelected()){

              System.out.println("Test Case is Passed....!!!");
          }else{

              System.out.println("Test case is Failed...!!!");
          }
      }

        Thread.sleep(3000);
        driver.quit();
    }
}
