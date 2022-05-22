package com.cydeo.test.day3_CSS_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_CSS {
    public static void main(String[] args) {

        /*
        TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a Chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Verify “Log in” button text is as expected:
        Expected: Log In
        */

        // 1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //  Expected: Log In
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));


    }
}
