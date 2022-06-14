package com.cydeo.test.day9_iFrame;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class IFramePractice extends TestBase {

    @Test
    public void iframeTest(){
        //2- Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

        //Since we're dealing with an iframe we need to use the switchTo()
        driver.switchTo().frame("mce_0_ifr");
        //you could also use xpath or frame index

        //3- Clear text from comment body
        WebElement commentBody = driver.findElement(By.id("tinymce"));
        commentBody.clear();

        //4- Type "Hello World" in comment body
        commentBody.sendKeys("Hello World");

        //5- Verify "Hello World" text is written in comment body
        assertEquals(commentBody.getText(), "Hello World");

        //now we have to switch out of iframe
        driver.switchTo().parentFrame();

        //6- Verify header "An iFrame containing the TinyMCE
        //WYSIWYG Editor" is displayed
        WebElement headerText = driver.findElement(By.tagName("h3"));
        assertTrue(headerText.isDisplayed(), "Header text did not appear");

        String actualHeader = headerText.getText();
        String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";

        assertEquals(actualHeader, expectedHeader, "Header text did not appear correctly");

    }
}
