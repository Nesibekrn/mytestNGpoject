package practice05.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class SearchProductPage {
    public SearchProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;

    @FindBy(xpath = "//*[@class='features_items']/h2")
    public WebElement allProduccts;

    @FindBy(id="search_product")
    public WebElement searchBox;

    @FindBy(id="submit_search")
    public WebElement submitSearch;

    @FindBy(xpath = "//*[@class='features_items']/h2")
    public WebElement searchedProducts;

    @FindBy(xpath = "//a[@href='/products_details/']")
    public WebElement viewProduct;

   @FindBy(xpath = "//*[@class=\"product-information\"]//p//b[1]")
    public WebElement avalibility;

    @FindBy(xpath = "//*[@class=\"product-information\"]//p//b[1]")
    public WebElement condition;

    @FindBy(xpath = "//*[@class=\"product-information\"]//p//b[1]")
    public WebElement brand;

/*
 @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public  WebElement allProduct;

    @FindBy(id = "search_product")
    public WebElement searchBox;

    @FindBy(id = "submit_search")
    public WebElement searchButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement searchedProductsText;

    @FindBy(partialLinkText = "View Product")
    public WebElement viewProduct;

    @FindBy(xpath = "(//p)[4]")
    public WebElement availability;

    @FindBy(xpath = "(//p)[5]")
    public  WebElement condition;

    @FindBy(xpath = "(//p)[6]")
    public WebElement brand;
 */

}
