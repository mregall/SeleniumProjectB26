package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String customerName){
        String locator = "//td[.='" + customerName + "']//following-sibling::td[3]";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();
    }

    public static void orderVerify(WebDriver driver,String customerName,String expectedOrderDate){

        String locator ="//td[.='" + customerName + "']//following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        Assert.assertEquals(customerDateCell.getText(),expectedOrderDate);

    }


}
