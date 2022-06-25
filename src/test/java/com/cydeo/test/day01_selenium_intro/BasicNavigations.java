package com.cydeo.test.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        // 1. Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. Create an instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // 3. Make a full screen
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        //navigate.to(url)
        driver.navigate().to("https://www.google.com");

        Thread.sleep(5000);

        //navigate.back()
        driver.navigate().back();

        //navigate.refresh()
        driver.navigate().refresh();

        //closes the current browser tab
        //driver.close();

        //close the whole browser
        //driver.quit();

        driver.get("https://www.binance.us/en/trade/pro/ETH_USD");

        driver.navigate().to("https://www.binance.us/en/trade/pro/ETH_USD");

        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);

        //getting the URL of current page
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
    }

}
