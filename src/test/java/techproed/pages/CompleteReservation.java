package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class CompleteReservation {
      public CompleteReservation(){

          PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Complete Reservation']")
    public WebElement completeReservation;

    @FindBy(name = "cardNo")
    public WebElement cardNo;

    @FindBy(name = "nameOnCard")
    public WebElement nameOnCard;

    @FindBy(name="expireDate")
    public WebElement expireDate;

    @FindBy(name="cvc")
    public WebElement cvc;

    @FindBy(name="contract")
    public WebElement contract;

    @FindBy (xpath = "//button[@type='submit'])[last()]")
    public WebElement completeReservationButton;

}
