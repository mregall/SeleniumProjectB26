package com.cydeo.test.CRMPractice;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class P3_Actions extends TestBase {

    @Test
    public void dragAndDrop(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(smallCircle, bigCircle).perform();
    }

    @Test
    public void moveToElement(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        actions.moveToElement(smallCircle).pause(1000)
                //moveToElement means to hover over.
                .clickAndHold().pause(1000)
                .moveToElement(bigCircle).pause(1000)
                .release().perform();

        assertEquals(bigCircle.getText(), "You did great!");
    }

}
/* */