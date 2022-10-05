package practice05.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import practice05.pages.AmazonHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

//        Go to the Amazon website
//        Click on sign in button
//        Send e mail by using faker
//        Click on continue
//        Assert "There was a problem"  message
//        Click on "Need help?"
//        Click on "Forgot your Password?"
//        Verify the text "Password assistance"
//        Navigate back
//        Click on "Create your account" button
//        Verify the text "Create account"
public class AmazonSigninTest {
    AmazonHomePage amazonHomePage;
  //  Faker faker;
@Test
    public void signinTest(){
    Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
    amazonHomePage=new AmazonHomePage();
 //   faker=new Faker();
    amazonHomePage.signin.click();
    amazonHomePage.email.sendKeys(Faker.instance().internet().emailAddress());
    amazonHomePage.continueButton.click();
    ReusableMethods.waitForVisibility(amazonHomePage.thereWasAProblem,2);
    Assert.assertEquals(amazonHomePage.thereWasAProblem.getText(),"There was a problem");
    amazonHomePage.needHelp.click();
    ReusableMethods.waitForClickablility(amazonHomePage.forgotYourPassword,2);
    amazonHomePage.forgotYourPassword.click();
    ReusableMethods.waitFor(2);
    Assert.assertTrue(amazonHomePage.passwordAssistance.isDisplayed());
    Driver.getDriver().navigate().back();
    Driver.getDriver().navigate().refresh();
    amazonHomePage.createYourAmazonAccount.click();
    Assert.assertEquals(amazonHomePage.createAccount.getText(),"Create account");
Driver.closeDriver();
}





















/*
 @Test
    public void amazonSignInTest(){
//        Go to the Amazon website
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

//        Click on sign in button
        amazonSignInPage.signInTab.click();

//        Send e mail by using faker
        amazonSignInPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());

//        Click on continue
        amazonSignInPage.continueButton.click();

//        Assert "There was a problem"  message
        String warningMessageText = amazonSignInPage.warningMessage.getText();
        Assert.assertEquals(warningMessageText, "We cannot find an account with that email address");

//        Click on "Need help?"
        amazonSignInPage.needHelp.click();

//        Click on "Forgot your Password?"
        amazonSignInPage.forgotPassword.click();

//        Verify the text "Password assistance"
        boolean isPassDisplayed = amazonSignInPage.passwordAssistance.isDisplayed();
        Assert.assertTrue(isPassDisplayed);

//        Navigate back
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

//        Click on "Create your account" button
        amazonSignInPage.createAccountButton.click();

//        Verify the text "Create account"
        String createAccountText = amazonSignInPage.createAccountText.getText();
        Assert.assertEquals(createAccountText, "Create account");

    }
 */
}
