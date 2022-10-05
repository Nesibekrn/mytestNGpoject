package techproed.tests.listeners;

import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class ListenersTest2 {
//THIS IS FAILED ON PURPOSE

    HomePage homePage;
    LoginPage loginPage;
    @Test(retryAnalyzer = techproed.utilities.ListenersRetry.class)
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
//        SENDING WRONG CREDENTIALS, SO THIS FAILS
        loginPage.username.sendKeys("fasdgfasdg@gmail.com");
        loginPage.password.sendKeys("sadfasdg");
        loginPage.loginButton.click();
//        THIS FAILS
        ReusableMethods.verifyElementDisplayed(homePage.userID);
        Driver.closeDriver();

    }
}
