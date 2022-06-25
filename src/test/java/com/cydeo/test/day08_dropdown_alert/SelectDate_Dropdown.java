package com.cydeo.test.day08_dropdown_alert;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectDate_Dropdown {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


    @Test
    public void dateDropdownTest(){
        Select yearDropdown = new Select(driver.findElement(By.id("year")));
        Select monthDropdown = new Select(driver.findElement(By.id("month")));
        Select dayDropdown = new Select(driver.findElement(By.id("day")));

        for (WebElement eachYearOption : yearDropdown.getOptions()) {
            System.out.println(eachYearOption.getText());
        }


        yearDropdown.selectByVisibleText("1923");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        //this is the option that we selected, and we need to read the text
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        Assert.assertTrue(actualYear.equals(expectedYear), "Year selection didn't pass");
        Assert.assertEquals(actualMonth, expectedMonth, "Month selection did not pass");
        Assert.assertTrue(actualDay.equals(expectedDay));

    }
}
