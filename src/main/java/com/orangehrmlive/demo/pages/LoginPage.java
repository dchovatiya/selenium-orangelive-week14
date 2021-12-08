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
public class LoginPage extends Utility
{
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[contains(@id,'txtUsername')]")
    WebElement usrNm;
    @FindBy(xpath="//input[contains(@id,'txtPassword')]")
    WebElement password;
    @FindBy(xpath="//input[contains(@id,'btnLogin')]")
    WebElement loginBtn;
    @FindBy(xpath="//div[starts-with(text(),'LOGIN Panel')]")
    WebElement loginPan;

    public void verifyTxtLoginPnl() throws InterruptedException
    {
        Reporter.log("Verify the text" + loginPan.toString() + "<br>");
        verifyThatElementIsDisplayed(loginPan);

    }
    public void enterUserName()
    {
        Reporter.log("Enter user name" + usrNm.toString() + "<br>");
        sendTextToElement(usrNm,"Admin");
    }
    public void enterPassword()
    {
        Reporter.log("Enter password"+password + password.toString() + "<br>");
        sendTextToElement(password,"admin123");
    }
    public void clickOnLoginBtn() throws InterruptedException
    {
        Reporter.log("Click on" + loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);
        //verifyTheText("Welcome Paul" ,verifyWel);
    }
}
