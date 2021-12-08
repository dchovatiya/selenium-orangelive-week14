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
public class DashboardPage extends Utility
{
    public DashboardPage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//h1[contains(text(),'Dashboard')]")
    WebElement dashboardText;

    public void verifyTxtOfDashboard() throws InterruptedException {
        Reporter.log("verify the text" + dashboardText.toString() + "<br>");
        //waitUntilVisibilityOfElementLocated(dashboardText,20);
        verifyThatElementIsDisplayed(dashboardText);
    }
}
