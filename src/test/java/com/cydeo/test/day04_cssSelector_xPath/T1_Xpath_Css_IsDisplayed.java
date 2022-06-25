package com.cydeo.test.day04_cssSelector_xPath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Xpath_Css_IsDisplayed {
    public static void main(String[] args) {

        //        TC #1: XPATH and cssSelector Practices
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

//        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//        a. “Home” link
        //Locate homeLink using cssSelector, class value
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homeLink using cssSelector, href value
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[href='/']"));

        //Locate homeLink using cssSelector, syntax2 for class "."
        WebElement homeLink3 = driver.findElement(By.cssSelector("a.nav-link"));


//        b. “Forgot password” header
        //Locate forgotPassword using cssSelector form parent to child with ">"
        WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));

        //Locate forgotPassword using cssSelector syntax2 form parent to child with ">"
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

//        c. “E-mail” text
        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));

//        d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[name='email']"));

//        e. “Retrieve password” button
        WebElement retrievePassword1 = driver.findElement(By.cssSelector("button#form_submit"));
        WebElement retrievePassword2 = driver.findElement(By.cssSelector("button.radius"));

//        f. “Powered by Cydeo text
        WebElement poweredByCydeo = driver.findElement(By.cssSelector("div[style='text-align: center;']"));


//        4. Verify all web elements are displayed.
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrievePassword1.isDisplayed() = " + retrievePassword1.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());

    }
}
