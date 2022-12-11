package techproed.hW;
/*Name:
User should be able to reserve a car
Description:
User should be able to reserve a car as customer service profile
Acceptance Criteria:
Given user is on the home page
And select a car
And enter pick up field
And enter drop off field
And click continue reservation
And verify complete reservation screen pops up
And enter card number
And enter name on the card
And enter expire date and CVC
And checks the agreement
And click complete reservation
Then verify ‘Reservation created successfully’ pop up
//And naviaged to Reservations screen
//And verify the last reservation is created
//When you click on the last reservation
//Then verify reservation detail page is displayed
//And verify the table has the following fields: Model, Doors, Seats, Luggage, Transmission, Air Conditioning, Fuel Type, Age
//And click on back to reservations
//And verify Reservations page is displayed
//And click on Home link
//Then verify the home page is displayed*/

import com.github.javafaker.Faker;
import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.CompleteReservation;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.pages.Reservations;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserStory2 {
    HomePage homePage;
    LoginPage loginPage;
    Reservations reservations;
    Select select;
    Faker faker;
    CompleteReservation completeReservation;
    @Test
    public void customerReservation() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage = new HomePage();
        loginPage=new LoginPage();
        reservations=new Reservations();
        completeReservation=new CompleteReservation();
        homePage.homeLoginButton.click();
        faker=new Faker();

        loginPage.username.sendKeys(ConfigReader.getProperty("app_customer_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("app_customer_password"));
        loginPage.loginButton.click();

        select=new Select(homePage.selectACar);
        select.selectByVisibleText("BMW Ix3");
        //Kia Rio   Ford Fiesta       VW Polo   Ford Kuga         Opel Insigna     BMW Ix3
        //Bugatti Chiron       Maserati       Mercedes Vito       Mercedes GLC     test
        //Porsche Ceyenne SUV    Audi Q8
        homePage.pickUpLocation.sendKeys(ConfigReader.getProperty("pickUpLocation"));
        homePage.pickUpDate.sendKeys(ConfigReader.getProperty("pickUpDate"));
        homePage.pickUpTime.sendKeys(ConfigReader.getProperty("pickUpTime"));
        homePage.dropOfLocation.sendKeys(ConfigReader.getProperty("dropOfLocation"));
        homePage.dropOffDate.sendKeys(ConfigReader.getProperty("dropOffDate"));
        homePage.dropOffTime.sendKeys(ConfigReader.getProperty("dropOffTime"));
//        Thread.sleep(30);
//        ReusableMethods.waitForVisibility(homePage.continueReservationButton,30);
        ReusableMethods.waitForClickablility(homePage.continueReservationButton,5);
        homePage.continueReservationButton.click();
        ReusableMethods.waitForVisibility(completeReservation.completeReservation,10);
        ReusableMethods.verifyElementDisplayed(completeReservation.completeReservation);
        completeReservation.cardNo.sendKeys(Keys.HOME+faker.business().creditCardNumber());
        completeReservation.nameOnCard.sendKeys(Keys.HOME+faker.name().fullName());
        completeReservation.expireDate.sendKeys(Keys.HOME+faker.business().creditCardExpiry());
        completeReservation.cvc.sendKeys(Keys.HOME+faker.number().digits(3));
        completeReservation.contract.click();

        ReusableMethods.waitForClickablility(completeReservation.completeReservationButton,5);
        completeReservation.completeReservationButton.click();

        ReusableMethods.waitForVisibility(homePage.alertReservationCreatedSuccessfully,5);
        Assert.assertEquals(homePage.alertReservationCreatedSuccessfully.getText(),"Reservation created successfully");
        Thread.sleep(6000);
        ReusableMethods.waitForClickablility(homePage.userID,10);
       homePage.userID.click();
        reservations.reservations.click();
        ReusableMethods.verifyElementDisplayed(reservations.reservationsPage);
        ReusableMethods.verifyElementDisplayed(reservations.reservatedCar);
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("argument[0].click();",reservations.reservatedCar);
       // reservations.reservatedCar.click();
        ReusableMethods.verifyElementDisplayed(reservations.reservationDetail);
        reservations.carDetails.click();
        List<String> titles= Arrays.asList("Model", "Doors", "Seats", "Luggage", "Transmission", "Air Conditioning", "Fuel Type", "Age");
        for (int i = 0; i <titles.size() ; i++) {
        Assert.assertEquals(titles.get(i),reservations.actualTitle.get(i).toString());
        }
        reservations.backToReservation.click();
        ReusableMethods.verifyElementDisplayed(reservations.reservationsPage);

//And click on Home link
//Then verify the home page is displayed
       // Driver.closeDriver();

    }

    public static void equality(){

    }


}
