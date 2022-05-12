package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        // 1. Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. Create an instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

       /* //navigate.to(url)
        driver.navigate().to("https://www.google.com");

        Thread.sleep(5000);

        //navigate.back()
        driver.navigate().back();

        //navigate.refresh()
        driver.navigate().refresh();

        //closes the current browser tab
        driver.close();

        //close the whole browser
        driver.quit();*/

        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);
    }
}
