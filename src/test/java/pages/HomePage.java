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

    @FindBy(name="q")
    public WebElement searchBox;

    @FindBy(linkText="Services")
    public WebElement services;

    @FindBy(linkText="Departments")
    public WebElement departmentsDropDown;

    @FindBy(xpath="(//ul[@class='list ma0 pa0 pb3'])[1]//li")
    public List<WebElement>DepartmentsList;

    @FindBy(xpath="(//ul[@class='list ma0 pa0 pb3'])[2]//li")
    public List<WebElement>ServicesList;

    @FindBy(xpath="//button[contains(text(),'Baby')]")  //(xpath = "(//button[@type='button'])[8]")
    public WebElement babyElement;

    @FindBy (linkText = "Give feedback")
    public WebElement feedBackButton;

    @FindBy(xpath="(//div[@class='b'])[1]")
    public WebElement myItemsButton;

    @FindBy (xpath = "(//div[@class='b'])[2]")  ////div[contains(text(),'Account')]
    public WebElement acountButton;




}
