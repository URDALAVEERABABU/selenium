package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDropdowns {

    public static void main(String[] args) throws InterruptedException {


        // SelectByIndex()
        // SelectByValue()
        // SelectByVisibleText()
        // dropdown.getOptions()

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));

        dropdown.selectByIndex(2);
        Thread.sleep(2000);
        dropdown.selectByValue("red");
        Thread.sleep(2000);
        dropdown.selectByVisibleText("Magenta");

       List<WebElement> list = dropdown.getOptions();

       for(int i=0; i<list.size(); i++){

          System.out.println( list.get(i).getText());
       }

        Thread.sleep(5000);
        driver.quit();
    }
}
