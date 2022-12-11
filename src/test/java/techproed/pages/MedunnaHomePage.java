package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedunnaHomePage {

    @FindBy(xpath = "//*[(text()='HOME')]")
    public WebElement homeLink;

    @FindBy(xpath = "//*[(text()='ABOUT')]")
    public WebElement aboutLink;

    @FindBy(xpath = "//*[(text()='SERVICES')]")
    public WebElement servicesLink;

    @FindBy(xpath = "//*[(text()='DEPARTMENTS')]")
    public WebElement departmentsLink;

    @FindBy(xpath = "//*[(text()='DOCTORS')]")
    public WebElement doctorsLink;

    @FindBy(xpath = "//*[(text()='CONTACT')]")
    public WebElement contactLink;

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement signInIcon;

    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement itemsTitlesButton;

    @FindBy(xpath = "//span[.='Administration']")
    public WebElement administrationButton;

    @FindBy(xpath = "//span[.='Admin Recep']")
    public WebElement adminRecepButton;

    @FindBy(xpath = "//*[(text()=' Appointment')]")
    public WebElement makeAppointment;

    @FindBy(xpath = "//*[(text()='Get Started')]")
    public WebElement getStarted;

}
