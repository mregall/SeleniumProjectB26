package com.cydeo.test.CRMPractice;

import com.cydeo.test.base.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class OlhaExample extends TestBase {

    @Test
    public void AC2LoginNegative(){
        driver.get("https://login2.nextbasecrm.com/");
        // CRMLoginUtil.crm_login(driver, "hr57@cybertekschool.com", "User");
        WebElement errorText = driver.findElement(By.cssSelector(".errortext"));
        String expectedMsg = "Incorrect login or password";
        Assert.assertEquals(errorText.getText(), expectedMsg, "Negative login testing failed");

    }

    // Given user on login page
    // When user click on Remember me on this computer
    // Then option Remember me on this computer was checked
    @Test
    public void AC3RememberMeBtn(){
        driver.get("https://login2.nextbasecrm.com/");
        WebElement rememberMeBtn = driver.findElement(By.cssSelector("#USER_REMEMBER"));
        rememberMeBtn.click();
        System.out.println(rememberMeBtn.isSelected());

    }

    @Test
    public void AC4ForgotPassword(){
        driver.get("https://login2.nextbasecrm.com/");
        WebElement forgotPassword = driver.findElement(By.cssSelector(".login-link-forgot-pass"));
        forgotPassword.click();
        Assert.assertEquals(driver.getTitle(), "Get Password", "Forgot password verification failed");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
