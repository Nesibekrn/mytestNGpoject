package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.MedunnaHomePage;
import techproed.pages.MedunnaSignInDropdown;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;


public class Control {
    MedunnaHomePage medunnaHomePage;
    MedunnaSignInDropdown medunnaSignInDropdown;
    @Test
    public void loginTest(){
//        going to the page
        Driver.getDriver().get(ConfigReader.getProperty("url_test_medunna"));
        medunnaHomePage.makeAppointment.click();
//        medunnaSignInDropdown.signIn.click();
//        medunnaSignInDropdown.usernameBox.sendKeys("adminrecep");
//        medunnaSignInDropdown.passwordBox.sendKeys("123Recep");
//        medunnaSignInDropdown.signInSubmitButton.click();
//        medunnaHomePage.itemsTitlesButton.click();

    }
}
