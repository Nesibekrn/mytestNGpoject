package techproed.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class Reservations {
    public Reservations(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='dropdown-item'][1]")
    public WebElement reservations;

    @FindBy(xpath = "//*[@class='header-content']/h1")
    public WebElement reservationsPage;

    @FindBy(xpath = "//*[@class='table-responsive']/table/tbody/tr[225]/td[2]")
    public WebElement reservatedCar;

    @FindBy(xpath = "//*[@class='header-content']/h1")
    public WebElement reservationDetail;

    @FindBy(xpath = "//*[@class='accordion-item'][2]")
    public WebElement carDetails;

    public List<WebElement> actualTitle=Driver.getDriver().findElements(By.xpath("//*[@class='accordion-item'][2]/div/div/table/tbody/tr/td[1]"));

@FindBy(xpath = "//*[@id='root']/div[4]/div/div[3]/button")
    public WebElement backToReservation;
}
