package techproed.hW;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

/*
Name:
Require user to login for reservation
Description:
User should see a message when user tries to book a car while not logged in
Acceptance Criteria:
As customer, I should be able to see error message, when I try to book a car while not logged in
Message: Please first login
Given user is on the login page
And tries to book a car
And click continue reservation
Then user see the warning message: Please first login
 */
public class UserStory1 {
    HomePage homePage;
    Select select;
    @Test
    public void pleaseFirstLoginMessage() throws IOException {
        homePage=new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        select=new Select(homePage.selectACar);
        select.selectByVisibleText("Ford Fiesta");
       homePage.pickUpLocation.sendKeys(ConfigReader.getProperty("pickUpLocation"));
       homePage.pickUpDate.sendKeys(ConfigReader.getProperty("pickUpDate"));
        homePage.pickUpTime.sendKeys(ConfigReader.getProperty("pickUpTime"));
        homePage.dropOfLocation.sendKeys(ConfigReader.getProperty("dropOfLocation"));
        homePage.dropOffDate.sendKeys(ConfigReader.getProperty("dropOffDate"));
        homePage.dropOffTime.sendKeys(ConfigReader.getProperty("dropOffTime"));

        ReusableMethods.waitForClickablility(homePage.continueReservationButton,10);
        homePage.continueReservationButton.click();

        ReusableMethods.waitForVisibility(homePage.pleaseFirstLoginMessage,10);
        Assert.assertEquals(homePage.pleaseFirstLoginMessage.getText(),ConfigReader.getProperty("reservationWithoutLoginMessage"));
        Driver.closeDriver();

    }
}
