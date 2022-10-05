package techproed.tests.dataprovider;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class Day17_DataProvider2 {

    //    DATA PROVIDER METHOD
//    Copied this methods from teh first class
    @DataProvider/*(parallel = true)*/
    public Object[][] customerData(){
        Object [][] customerCredentials = {
                {"customer8@bluerentalcars.com","98765"},
                {"customer7@bluerentalcars.com","98764"},
                {"customer6@bluerentalcars.com","98763"},
                {"customer5@bluerentalcars.com","98762"}
        };
        return customerCredentials;
    }
    //    Data Provider is similar to getting data form excel
//    We will login similar to excel login using data provider
    HomePage homePage;
    LoginPage loginPage;

    public void login(){

//        going to the url
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
//        initializing the pages
        homePage = new HomePage();
        loginPage=new LoginPage();


//        GOING TO THE LOGIN PAGE FIRST TIME
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
            ReusableMethods.waitFor(5);
            homePage.userID.click();
            ReusableMethods.waitFor(1);
            homePage.logoutLink.click();
            ReusableMethods.waitFor(1);
            homePage.OK.click();
            ReusableMethods.waitFor(1);
            homePage.homeLoginButton.click();

        }catch (Exception e){

        }
    }


    //    TEST METHOD
    @Test(dataProvider = "customerData")
    public void dataProviderTest(String userName, String passWord) throws IOException {

        login();
        ReusableMethods.waitFor(5);
        loginPage.username.sendKeys(userName);
        ReusableMethods.waitFor(1);
        loginPage.password.sendKeys(passWord);
        ReusableMethods.waitFor(1);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(1);
        //            Asserting making sure login is successful
        ReusableMethods.verifyElementDisplayed(homePage.userID);
        ReusableMethods.getScreenshot(userName);

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
