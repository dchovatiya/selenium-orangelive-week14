package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import com.orangehrmlive.demo.utility.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * By Dimple Patel
 **/
public class UsersTest extends TestBase
{
    LoginPage loginPage;
    HomePage homePage;
    AdminPage adminPage;
    ViewSystemUsersPage viewSystemUsersPage;
    AddUserPage addUserPage;
    LoginTest loginTest;

    @BeforeMethod(groups={"sanity","smoke","regression"})
    public void inIt()
    {
        loginPage=new LoginPage();
        homePage=new HomePage();
        adminPage =new AdminPage();
        viewSystemUsersPage=new ViewSystemUsersPage();
        addUserPage=new AddUserPage();
        loginTest=new LoginTest();

    }
    public void reUseLogin() throws InterruptedException {
        loginPage.verifyTxtLoginPnl();
        Thread.sleep(2000);
        loginPage.enterUserName();
        Thread.sleep(2000);
        loginPage.enterPassword();
        Thread.sleep(2000);
        loginPage.clickOnLoginBtn();
        Thread.sleep(2000);

    }
    @Test(groups={"smoke","regression"})
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        reUseLogin();
        homePage.mouseHoverOnAdmin();
        Thread.sleep(2000);
        adminPage.mouseHoverOnUserManagement();
        Thread.sleep(2000);
        viewSystemUsersPage.verifyTxtSystemUser();
        Thread.sleep(2000);
        viewSystemUsersPage.clickOnAddBtn();
        addUserPage.verifyAddUserTxt();
        Thread.sleep(2000);
        addUserPage.selectUserRoll("Admin");
        addUserPage.enterEmployee("Ananya Dash");
        Thread.sleep(2000);
        addUserPage.enterUserName("Ananya");
        Thread.sleep(2000);
        addUserPage.selectStatusId("Disabled");
        Thread.sleep(2000);
        addUserPage.enterPassword("admin123");
        Thread.sleep(2000);
        addUserPage.enterConPassword("admin123");
        addUserPage.saveTheInfo();
        Thread.sleep(2000);
    }
    @Test(groups={"sanity","regression"})
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        reUseLogin();
        homePage.mouseHoverOnAdmin();
        Thread.sleep(2000);
        viewSystemUsersPage.verifyTxtSystemUser();
        Thread.sleep(2000);
        viewSystemUsersPage.enterUserNm("Aravind");
        viewSystemUsersPage.userRollNo("ESS");
        Thread.sleep(2000);
        viewSystemUsersPage.selectStatus("Enabled");
        viewSystemUsersPage.clickOnSearchBtn();
        Thread.sleep(2000);
    }
    @Test(groups={"sanity","regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        reUseLogin();
        homePage.mouseHoverOnAdmin();
        Thread.sleep(2000);
        viewSystemUsersPage.verifyTxtSystemUser();
        Thread.sleep(2000);
        viewSystemUsersPage.enterUserNm("liza1992");
        Thread.sleep(2000);
        viewSystemUsersPage.userRollNo("ESS");
        Thread.sleep(2000);
        viewSystemUsersPage.selectStatus("Enabled");
        Thread.sleep(2000);
        viewSystemUsersPage.clickOnSearchBtn();
        Thread.sleep(2000);
        viewSystemUsersPage.clickOnCheckBox();
        Thread.sleep(2000);
        viewSystemUsersPage.clickOnDeleteBtn();
        //viewSystemUsersPage.clickOnPopUPBtn();
        Thread.sleep(2000);
        viewSystemUsersPage.clickOnPopUP();
        Thread.sleep(2000);
        viewSystemUsersPage.verifySuccessDeleteMsg();
    }
    @Test(groups={"regression"})
    public void  searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        reUseLogin();
        homePage.mouseHoverOnAdmin();
        Thread.sleep(2000);
        viewSystemUsersPage.verifyTxtSystemUser();
        viewSystemUsersPage.enterUserNm("Aravind");
        Thread.sleep(2000);
        viewSystemUsersPage.userRollNo("ESS");
        Thread.sleep(2000);
        viewSystemUsersPage.selectStatus("Enabled");
        Thread.sleep(2000);
        viewSystemUsersPage.clickOnSearchBtn();
    }
}
