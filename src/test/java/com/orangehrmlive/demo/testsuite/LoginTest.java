package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * By Dimple Patel
 **/


public class LoginTest extends TestBase
{
    LoginPage loginPage;
    HomePage homePage;
    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void inIt()
    {
        loginPage=new LoginPage();
        homePage=new HomePage();
    }

    @Test(groups={"smoke","regression"})
    public void verifyUserShouldLoginSuccessFully() throws InterruptedException {
        loginPage.verifyTxtLoginPnl();
        Thread.sleep(2000);
        loginPage.enterUserName();
        Thread.sleep(2000);
        loginPage.enterPassword();
        Thread.sleep(2000);
        loginPage.clickOnLoginBtn();
        Thread.sleep(2000);

    }
    @Test(groups={"sanity","regression"})
    public void VerifyThatTheLogoDisplayOnHomePage() throws InterruptedException {
        verifyUserShouldLoginSuccessFully();
        Thread.sleep(2000);
        homePage.verifyOrangeLogo();
        Thread.sleep(2000);

    }
    @Test(groups={"sanity","regression"})
    public void VerifyUserShouldLogOutSuccessFully() throws InterruptedException
    {
        verifyUserShouldLoginSuccessFully();
        Thread.sleep(2000);
        homePage.setClickWelcome();
        Thread.sleep(2000);
        homePage.setClickLogout();
        Thread.sleep(2000);
        loginPage.verifyTxtLoginPnl();
        Thread.sleep(2000);
    }
}
