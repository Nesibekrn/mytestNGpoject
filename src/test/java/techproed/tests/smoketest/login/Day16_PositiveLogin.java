package techproed.tests.smoketest.login;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day16_PositiveLogin {
    HomePage homePage;
    LoginPage loginPage;
    @Test(groups = "login-group")
    public void customerLogin(){
//        going to the url
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
//        GOING TO THE LOGIN PAGE FIRST TIME
        //        initializing the pages
        homePage = new HomePage();
        loginPage=new LoginPage();
        try{
            // if there is any exception, then keep going.
            // will be used only at the 1st login since homeLoginButton is available
            homePage.homeLoginButton.click();
        }catch (Exception e){
        }
//        GOING TO THE LOGIN PAGE AFTER FIRST TIME
        try{
            // if there is any exception, then keep going.
            // will be used AFTER the 1st login since userID is available AFTER the 1st login
//            Logging Out
            ReusableMethods.waitFor(1);
            homePage.userID.click();
            ReusableMethods.waitFor(1);
            homePage.logoutLink.click();
            ReusableMethods.waitFor(1);
            homePage.OK.click();
            ReusableMethods.waitFor(1);
            homePage.homeLoginButton.click();
        }catch (Exception e){
        }
//        type email, password, and click login button
        loginPage.username.sendKeys(ConfigReader.getProperty("app_customer_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("app_customer_password"));
        loginPage.loginButton.click();
//        Verify if login is successful
//        boolean isTrue= homePage.userID.isDisplayed();
//        Assert.assertTrue(isTrue);
        ReusableMethods.verifyElementDisplayed(homePage.userID);
        Driver.closeDriver();
    }
}