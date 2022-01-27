package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this); // bu class taki tum elemetleri driver'a gonder
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;
    @FindBy(xpath = "//span[@class='icp-nav-link-inner']")
    public WebElement languageDropdown;
    @FindBy(xpath = "(//a[@href=\"#switch-lang=es_US\"])[1]") //(//span[contains(text(),'ES')])[1]
    public WebElement languageRadioButton;
    @FindBy(id = "nav-link-accountList")
    public WebElement signInTab;
    @FindBy(id="nav-search-submit-button")
    public WebElement searchInitiator;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement searchedText;

    @FindBy(xpath = "(//*[@class='nav-action-inner'])[1]")
    public WebElement signInButton;

    @FindBy(id= "searchDropdownBox")
    public WebElement dropdownBox;

    @FindBy(xpath = "//*[@id='searchDropdownBox']/option")
    public List<WebElement> dropdownList;

    @FindBy(xpath = "(//span[@class='icp-color-base'])[1]")
    public WebElement languageButton;

    @FindBy(id="nav-hamburger-menu")
    public WebElement allDropdown;

    @FindBy(linkText = "Hola, Identifícate")    ////xpath =div[@id='hmenu-customer-name']"
    public WebElement signInButtonDropdown;

    @FindBy(id="nav-cart-count")
    public WebElement chartCount;
}



//    @FindBy(name="q")
//    public WebElement searchBox;
//
//    @FindBy(linkText="Services")
//    public WebElement services;
//
//    @FindBy(linkText="Departments")
//    public WebElement departmentsDropDown;
//
//    @FindBy(xpath="(//ul[@class='list ma0 pa0 pb3'])[1]//li")
//    public List<WebElement>DepartmentsList;
//
//    @FindBy(xpath="(//ul[@class='list ma0 pa0 pb3'])[2]//li")
//    public List<WebElement>ServicesList;
//
//    @FindBy(xpath="//button[contains(text(),'Baby')]")  //(xpath = "(//button[@type='button'])[8]")
//    public WebElement babyElement;
//
//    @FindBy (linkText = "Give feedback")
//    public WebElement feedBackButton;
//
//    @FindBy(xpath="(//div[@class='b'])[1]")  // //div[contains(text (),'My Items')]
//    public WebElement myItemsButton;
//
//    @FindBy (xpath = "(//div[@class='b'])[2]")  //  //div[contains(text(),'Account')]
//    public WebElement acountButton;




