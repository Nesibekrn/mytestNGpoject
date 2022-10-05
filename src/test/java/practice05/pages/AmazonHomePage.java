package practice05.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AmazonHomePage {
public AmazonHomePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//*[(text()='Hello, sign in')]")
    public WebElement signin;

@FindBy(id = "ap_email")
    public WebElement email;

@FindBy(className = "a-button-input")
    public WebElement continueButton;

@FindBy(xpath = "//*[(text()='There was a problem')]")
    public WebElement thereWasAProblem;

@FindBy(className = "a-expander-prompt")
    public WebElement needHelp;

@FindBy(id = "auth-fpp-link-bottom")
    public WebElement forgotYourPassword;

@FindBy(xpath = "//*[@name='forgotPassword']/h1")
public WebElement passwordAssistance;

@FindBy(id = "createAccountSubmit")
    public WebElement createYourAmazonAccount;

@FindBy(className = "a-spacing-small")
    public WebElement createAccount;


}
/*
 @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement signInTab;


    @FindBy(id = "continue")
    public  WebElement continueButton;

    @FindBy(xpath = "//span[@class='a-list-item']")
    public WebElement warningMessage;

    @FindBy(xpath = "//span[@class='a-expander-prompt']")
    public WebElement needHelp;

    @FindBy(id = "auth-fpp-link-bottom")
    public WebElement forgotPassword;

    @FindBy(xpath = "//h1")
    public WebElement passwordAssistance;

    @FindBy(id = "createAccountSubmit")
    public WebElement createAccountButton;

    @FindBy(xpath = "//h1")
    public WebElement createAccountText;

 */