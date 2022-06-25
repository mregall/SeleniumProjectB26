package com.cydeo.test.day07_testNG_dropdown_alert_iFrame;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_StateDropdown {
    //Create a global instance of driver
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {


        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void stateDropdownTest() throws InterruptedException {

        Select stateDropdown = new Select(driver.findElement(By.id("state")));

        //3. Select Illinois
        stateDropdown.selectByValue("IL");

        //4. Select Virginia
        stateDropdown.selectByVisibleText("Virginia");

        //5. Select California
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)
        String actualStateOption = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateOption = "California";
        Assert.assertEquals(actualStateOption, expectedStateOption, "Selection option verification has Failed.");

        driver.quit();

    }

    @Test
    public void multiSelectDropdownTest() throws InterruptedException {

        //3. Select all the options from multiple select dropdown.
        Select languages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        System.out.println("languages.isMultiple() = " + languages.isMultiple());

        /* These are three ways we can select the elements
        languages.selectByValue("java");
        languages.selectByVisibleText("C#");
        languages.selectByIndex(3);*/

        //4. Print out all selected values.
        for (WebElement each : languages.getOptions()) {
            each.click();
            Thread.sleep(1000);
            System.out.println("each.getText() = " + each.getText());
        }

        /*
        List<WebElement> allOptions = languages.getOptions();

        for(WebElement each: allOptions){
            each.click();
            Thread.sleep(3000);
            System.out.println("each.getText() = " + each.getText());
        }

         */

        languages.deselectAll();
    }


}
