package com.cydeo.test.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2CydeoVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        String actualURL = driver.getTitle();

        String expectedURL = "cydeo";

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification is passed");
        }else{
            System.out.println("URL Failed");
        }

        String actualTitle = driver.getTitle();

        String expectedTitle = "Practice";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed");
        }else {
            System.out.println("Title Failed");
        }

        driver.quit();
    }
}
