package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * By Dimple Patel
 **/
public class HomePage extends Utility
{
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//img[@alt='OrangeHRM']")
     WebElement orangeLogo;
    @FindBy(linkText="Admin")
    WebElement admin;
    @FindBy(linkText="PIM")
    WebElement pim;
    @FindBy(linkText="Leave")
    WebElement leave;
    @FindBy(linkText="Dashboard")
    WebElement dashboard;
    @FindBy(xpath="//a[contains(text(),'Welcome Paul')]")
    WebElement welcomeMsg;
    @FindBy(id="welcome")
    WebElement clickWelcome;
    @FindBy(xpath="//a[text()='Logout']")
    WebElement clickLogout;


    public void verifyOrangeLogo()
    {
        System.out.println(verifyThatElementIsDisplayed(orangeLogo));
    }
    public void mouseHoverOnAdmin() throws InterruptedException {
        Reporter.log("Mouse hover and click on" + admin.toString() + "<br>");
        mouseHoverToElement(admin);
        clickOnElement(admin);
        Thread.sleep(2000);
    }
    /*public void mouseHoverOnPim()
    {
       mouseHover(pim);
       clickOnElement(pim);
    }
    public void mouseHoverOnLeave()
    {
       mouseHover(leave);
       clickOnElement(leave);
    }
    public void mouseHoverOnDashboard()
    {
       mouseHover(dashboard);
       clickOnElement(dashboard);
    }*/
    public void verifyWelcome() throws InterruptedException {
        Reporter.log("Verify the msg" + welcomeMsg.toString() + "<br>");
        verifyThatElementIsDisplayed(welcomeMsg);
    }
    public void setClickWelcome() throws InterruptedException
    {
        Reporter.log("Mouse hover and click on" + clickWelcome.toString() + "<br>");
        clickOnElement(clickWelcome);
    }
    public void setClickLogout() throws InterruptedException
    {
        Reporter.log("Mouse hover and click on" + clickLogout.toString() + "<br>");
        mouseHoverToElement(clickLogout);
        clickOnElement(clickLogout);
    }
}
