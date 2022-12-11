package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedunnaItemsTitles {

    @FindBy(xpath = "//*[@href='/patient']")
    public WebElement patient;

    @FindBy(xpath = "//*[@href='/staff']")
    public WebElement staff;

    @FindBy(xpath = "//*[@href='/physician']")
    public WebElement physician;

    @FindBy(xpath = "//*[@href='/appointment']")
    public WebElement appointment;

    @FindBy(xpath = "//*[@href='/c-test-item']")
    public WebElement testItem;

    @FindBy(xpath = "//span[.='Room']")
    public WebElement roomButton;

//    @FindBy()
//    public WebElement
//
//    @FindBy()
//    public WebElement
//
//    @FindBy()
//    public WebElement
//
//    @FindBy()
//    public WebElement



}
