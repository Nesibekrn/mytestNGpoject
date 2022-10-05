package techproed.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginButton;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;

    @FindBy(linkText = "Logout")
    public WebElement logoutLink;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement OK;

    @FindBy(xpath = "//*[@name='car']")
    public WebElement selectACar;

    @FindBy(xpath = "//*[@name='pickUpLocation']")
    public WebElement pickUpLocation;

    @FindBy(xpath = "//*[@name='dropOfLocation']")
    public WebElement dropOfLocation;

    @FindBy(xpath = "//*[@name='pickUpDate']")
    public WebElement pickUpDate;

    @FindBy(xpath = "//*[@name='pickUpTime']")
    public  WebElement pickUpTime;

    @FindBy(xpath = "//*[@name='dropOffDate']")
    public WebElement dropOffDate;

    @FindBy(xpath = "//*[@name='dropOffTime']")
    public WebElement dropOffTime;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement continueReservationButton;

    @FindBy(xpath = "//*[@role='alert']/div")
    public WebElement pleaseFirstLoginMessage;

    @FindBy(xpath = "//*[@role='alert']/div")
    public WebElement alertReservationCreatedSuccessfully;






}
