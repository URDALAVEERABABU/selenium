package com.test.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdowns {

    public static void main(String[] args) throws InterruptedException {


        // For Selecting Values from Dropdown
        // SelectByIndex()
        // SelectByValue()
        // SelectByVisibleText()
        // dropdown.getOptions()


        // For DeSelecting Values from Multi Select Dropdown,
        // Below Functions will not be applicable for Single Select Dropdowns
        // deSelectByIndex()
        // deSelectByValue()
        // deSelectByVisibleText()
        // deselectAll() --> It will deselect All Values from Dropdown

        System.setProperty("webdriver.chrome.driver", "/Users/thryakshari/Documents/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Select dropdown = new Select(driver.findElement(By.xpath(" //select[@id='cars']")));

        dropdown.selectByVisibleText("Audi");
        dropdown.selectByValue("volvo");
        dropdown.selectByIndex(2);

        Thread.sleep(2000);
        dropdown.deselectAll();

//        dropdown.deselectByVisibleText("Audi");
//        dropdown.deselectByValue("volvo");
//        dropdown.deselectByIndex(2);

        Thread.sleep(3000);
        driver.quit();
    }
}
