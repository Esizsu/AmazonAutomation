package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AddProductToCartPage {
    public AddProductToCartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id = "glow-ingress-line2")
    public WebElement adressButton;

    @FindBy(id = "GLUXZipUpdateInput")
    public WebElement addressBox;

    @FindBy(id= "GLUXZipUpdate")
    public WebElement applyButton;

//    @FindBy(xpath = "(//input[@id='GLUXConfirmClose'])[2]")
//    public WebElement continueButton;

    @FindBy(name="glowDoneButton")
    public WebElement doneButton;

    @FindBy(linkText = "Apple")
    public WebElement appleBox;

    @FindBy(id = "low-price")
    public WebElement minimumPrice;

    @FindBy(id = "high-price")
    public WebElement maxPrice;

    @FindBy(xpath = "//input[@class='a-button-input']")
    public WebElement doneButton1;

    @FindBy(linkText = "2021")
    public WebElement modelYear;

    @FindBy(id = "a-autoid-0-announce")
    public WebElement sortButton;

    @FindBy(id="s-result-sort-select_2")
    public WebElement highToLoxButton;

    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public List<WebElement> products;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-price qa-price-block-our-price']")
    public WebElement actualPrice;

    @FindBy(xpath = "//*[@id='a-autoid-22-announce']")
    public WebElement memoryCapacity;

    @FindBy(id = "a-autoid-24-announce")
    public WebElement color;

    @FindBy(id = "a-autoid-28-announce")
    public WebElement signInToCheckEligibility;

   /* =============================================================================================

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id="glow-ingress-line2")
    public WebElement DeliveryTo;

    @FindBy(id="GLUXZipUpdateInput")
    public WebElement LocationTextBox;

//    @FindBy(id = "twotabsearchtextbox")
//    public WebElement searchBox;
//
//    @FindBy(id = "glow-ingress-line2")
//    public WebElement adressButton;
//
//    @FindBy(id = "GLUXZipUpdateInput")
//    public WebElement addressBox;

    @FindBy(xpath = "//span[contains(text(),'Apply')]")
    public WebElement applyButton;

    @FindBy(xpath="(//span[contains(text(),'Continue')])[1]")
    public WebElement continueButton;

//    @FindBy(name="glowDoneButton")
//    public WebElement doneButton;

    @FindBy(linkText = "Apple")
    public WebElement appleBox;

    @FindBy(id = "low-price")
    public WebElement minimumPrice;

    @FindBy(id = "high-price")
    public WebElement maxPrice;

    @FindBy(xpath = "//input[@class='a-button-input']")
    public WebElement priceDoneButton;

    @FindBy(linkText = "2021")
    public WebElement modelYear;

    @FindBy(id = "a-autoid-0-announce")
    public WebElement sortButton;

    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public List<WebElement> products;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-price qa-price-block-our-price']")
    public WebElement actualPrice;

    @FindBy(id = "a-autoid-22-announce")
    public WebElement memoryCapacity;

    @FindBy(id = "a-autoid-24-announce")
    public WebElement color;

    @FindBy(id = "a-autoid-28-announce")
    public WebElement signInToCheckEligibility;

    */




}
