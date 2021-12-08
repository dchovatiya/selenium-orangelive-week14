package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.time.Duration;

/**
 * By Dimple Patel
 **/
public class ViewSystemUsersPage extends Utility
{

    public ViewSystemUsersPage()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//div[@class='head']//h1[contains(text(),'System Users')]")
    WebElement userTxt;
    @FindBy(xpath="//input[@id='searchSystemUser_userName']")
    WebElement userNmField;
    @FindBy(xpath="//select[contains(@id,'searchSystemUser_userType')]")
    WebElement userRoleDD;
    @FindBy(xpath="//input[contains(@class,'ac_input')]")
    WebElement employeeNmField;
    @FindBy(xpath="//select[contains(@id,'searchSystemUser_status')]")
    WebElement statusDD;
    @FindBy(xpath="//input[@id='searchBtn']")
    WebElement searchBtn;
    @FindBy(xpath="//input[contains(@id,'resetBtn')]")
    WebElement resetBtn;
    @FindBy(xpath="//input[contains(@id,'btnAdd')]")
    WebElement addBtn;
    @FindBy(id="btnDelete")
   // @FindBy(xpath="//input[contains(@id,'btnDelete')]")
    WebElement deleteBtn;
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement chkBox;
    //@FindBy(xpath="//input[contains(@value,'Ok')]")
    //@FindBy(xpath="//input(@id='dialogDeleteBtn'])")
    @FindBy(id="dialogDeleteBtn")
    WebElement popUPOkBtn;
    @FindBy(xpath="//div[@id='successBodyDelete']")
    WebElement successfullyDel;

    public void verifyTxtSystemUser()
    {
        Reporter.log("Verify the text" + userTxt.toString() + "<br>");
        verifyThatElementIsDisplayed(userTxt);
    }
    public void clickOnAddBtn() throws InterruptedException
    {
        Reporter.log("Click on" + addBtn.toString() + "<br>");

        clickOnElement(addBtn);
    }
    public void enterUserNm(String name)
    {
        Reporter.log("Enter user name" + userNmField.toString() + "<br>");

        sendTextToElement(userNmField,name);
    }
    public void userRollNo(String roll) throws InterruptedException
    {
        Reporter.log("Enter user roll no" + userRoleDD.toString() + "<br>");

        sendTextToElement(userRoleDD,roll);
    }
    public void selectStatus(String status)
    {
        Reporter.log("Select text from drop down" + statusDD.toString() + "<br>");
        selectByVisibleTextFromDropDown(statusDD, status);
    }
    public void clickOnSearchBtn() throws InterruptedException
    {
        Reporter.log("Click on" + searchBtn.toString() + "<br>");
        clickOnElement(searchBtn);
        //verify user should be in result list
    }
    public void clickOnCheckBox() throws InterruptedException
    {
        Reporter.log("Click on" + chkBox.toString() + "<br>");
        clickOnElement(chkBox);
    }
    public void clickOnDeleteBtn() throws InterruptedException
    {
        Reporter.log("Click on" + deleteBtn.toString() + "<br>");
        clickOnElement(deleteBtn);
    }
    /*public WebElement clickOnPopUPBtn()
    {
        Reporter.log("Click on" + popUPOkBtn.toString() + "<br>");
        waitUntilVisibilityOfElementLocated(popUPOkBtn,10);
        return popUPOkBtn;
    }*/
    public void clickOnPopUP()
    {
        Reporter.log("Click on" + popUPOkBtn.toString() + "<br>");
        clickOnElement(popUPOkBtn);
    }
    public void verifySuccessDeleteMsg()
    {
        Reporter.log("Verify the text" + popUPOkBtn.toString() + "<br>");
        verifyThatTextIsDisplayed(successfullyDel,"Successfully Deleted");
    }

}
   /* public WebElement waitUntilVisibilityOfElementLocated(WebElement element, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element=driver.findElement(By.xpath("//input[@id='dialogDeleteBtn'])"));
        return element;
    }*/
