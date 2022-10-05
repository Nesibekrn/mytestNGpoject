package techproed.tests;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class Day14_FirstDriverClass {
    //    driver -> Driver.getDriver()
    @Test
    public void firstDriver(){
//        calling getDriver()
        Driver.getDriver().get("https://www.techproeducation.com");

//        calling closeDriver()
        Driver.closeDriver();

    }
}