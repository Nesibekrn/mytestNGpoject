package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedunnaSignInDropdown {

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[(text()='Did you forget your password?')]")
    public WebElement forgetPasswordButton;

    @FindBy(id = "email")
    public WebElement resetPasswordEmail;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement resetPasswordButton;

    @FindBy(className = "Toastify")
    public WebElement resetPasswordAlert;

    @FindBy(xpath = "//*[(text()='Register a new account')]")
    public WebElement registerNewAccountButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

}
