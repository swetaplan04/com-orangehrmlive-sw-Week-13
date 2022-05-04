package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginWithValidCredentials() {
        loginPage.userName("Admin");
        loginPage.password("admin123");
        loginPage.clickOnLogin();
        String expectedText = "Welcome Paul";
        String actualText = loginPage.welcomeMessage();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgotPassword();
        String expectedText = "Forgot Your Password?";
        String actualText = loginPage.forgotPasswordMessage();
        Assert.assertEquals(expectedText, actualText);
    }
}