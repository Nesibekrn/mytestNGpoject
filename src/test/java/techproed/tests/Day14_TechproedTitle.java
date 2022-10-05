package techproed.tests;
/*
        Create a new class: TechproedTitleTest
        When user goes to techproed(get the test data from config file)
        Then verify title includes ‘Techpro Education’*/

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day14_TechproedTitle {

    @Test
    public void titleTest(){
        Driver.getDriver().get(ConfigReader.getProperty("url_test_techproed"));
        String actualTitle = Driver.getDriver().getTitle();
        boolean isTrue = actualTitle.contains(ConfigReader.getProperty("page_title"));
        Assert.assertTrue(isTrue);
        Driver.closeDriver();
    }
}