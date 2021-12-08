package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * By Dimple Patel
 **/
public class AdminPage extends Utility
{
    public AdminPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[@id='menu_admin_UserManagement']")
    WebElement userManagement;
    @FindBy(linkText="Users")
    WebElement user;
    @FindBy(xpath="//a[contains(@id,'menu_admin_Job')]")
    WebElement job;
    @FindBy(xpath="//a[contains(@id,'menu_admin_Organization')]")
    WebElement organization;

    public void mouseHoverOnUserManagement() throws InterruptedException
    {
        //waitUntilVisibilityOfElementLocated(userManagement,30);
        Reporter.log("Mouse hover and click on" + userManagement.toString() + "<br>");
        mouseHoverToElement(userManagement);
        clickOnElement(userManagement);
    }
    public void mouseHoverOnJob() throws InterruptedException
    {
        //waitUntilVisibilityOfElementLocated(job,20);
        Reporter.log("Mouse hover and click on" + job.toString() + "<br>");
        mouseHoverToElement(job);
        clickOnElement(job);
    }
    public void mouseHoverOnOrganization() throws InterruptedException {
        //waitUntilVisibilityOfElementLocated(organization,20);
        Reporter.log("Mouse hover and click on" + organization.toString() + "<br>");
        mouseHoverToElement(organization);
        clickOnElement(organization);
    }
}
