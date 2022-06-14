package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Set;

public class T3_Windows_Handle extends TestBase {

    @Test
    public void WindowHandleTest(){

//        2. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

        String mainWindow = driver.getWindowHandle();
        System.out.println("mainWindow = " + mainWindow);

//        3. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle,expectedTitle,"Main window title verification failed!");

//        4. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

//        5. Switch to new Window.
        Set<String> allWindowHandles = driver.getWindowHandles();
        //set because it doesn't allow duplicates
        HashMap<Integer, String> map = new HashMap<>();

        for (String each : allWindowHandles){
            driver.switchTo().window(each);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }


//        6. Assert: Title is “New Window”
        String expectedTitleAfterClicking = "New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitleAfterClicking, "Verification failed");

    }
}