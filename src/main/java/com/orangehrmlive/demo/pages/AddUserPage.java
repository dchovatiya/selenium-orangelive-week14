package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * By Dimple Patel
 **/
public class AddUserPage extends Utility
{
    public AddUserPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//h1[contains(@id,'UserHeading')]")
    WebElement verifyAddUserTxt;
    @FindBy(xpath="//select[@id='systemUser_userType']")
    WebElement userRollDD;
    @FindBy(xpath="//input[contains(@id,'systemUser_employeeName_empName')]")
    WebElement employeeName;
    @FindBy(xpath="//input[@id='systemUser_userName']")
    WebElement userName;
    @FindBy(xpath="//select[@id='systemUser_status']")
    WebElement statusDD;
    @FindBy(xpath="//input[@id='systemUser_password']")
    WebElement password1;
    @FindBy(xpath="//input[contains(@id,'systemUser_confirmPassword')]")
    WebElement confirmPassword;
    @FindBy(xpath="//input[@id='btnSave']")
    WebElement save;
    @FindBy(xpath="//input[contains(@id,'btnCancel')]")
    WebElement cancel;

    public String verifyAddUserTxt() throws InterruptedException
    {
        Reporter.log("Verify user text " + verifyAddUserTxt.toString() + "<br>");
        //waitUntilVisibilityOfElementLocated(verifyAddUserTxt,30);
        return verifyAddUserTxt.getText().trim();

    }
    public void selectUserRoll(String rollNo) throws InterruptedException
    {
        Reporter.log("select roll no" +userRollDD.toString());
        selectByVisibleTextFromDropDown(userRollDD,rollNo);
    }
    public void enterEmployee(String employee) throws InterruptedException
    {
        Reporter.log("Enter employee  :" +employeeName+ " in the usernameField :" +employeeName.toString() + "<br>");
        sendTextToElement(employeeName,employee);

    }
    public void enterUserName(String name) throws InterruptedException
    {
        Reporter.log("enter user name" +userName.toString()+"<br>");
        sendTextToElement(userName,name);
    }

    public void selectStatusId(String statusId)
    {

        selectByVisibleTextFromDropDown(statusDD,statusId);

    }
    public void enterPassword(String password) throws InterruptedException {
        Reporter.log("enter password" +password1.toString());
        sendTextToElement(password1,password);
    }
    public void enterConPassword(String conPassword) throws InterruptedException {
        Reporter.log("enter confirm password" +confirmPassword.toString());
        sendTextToElement(confirmPassword,conPassword);

    }
    public void saveTheInfo() throws InterruptedException
    {
        Reporter.log("Clicking on save Button " + save.toString() + "<br>");

        clickOnElement(save);
        //verifyTheText(); //Successfully record added
    }

}
