package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SigInPage {
    public SigInPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement signInTab;

    @FindBy(id = "ap_email")
    public WebElement signInEmailBox;

    @FindBy(xpath = "//h4")
    public WebElement alertText;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id="createAccountSubmit")
    public WebElement accountCreationButton;

    @FindBy(partialLinkText = "Need help?")
    public WebElement NeedHelpButton;

    //@FindBy(xpath =" //a[contains(text(),'Forgot your password?')]")
    @FindBy(partialLinkText = "Forgot your password?")
    public WebElement ForgotYourPasswordButton;

    //@FindBy(tagName = "h1")
    @FindBy(xpath ="//h1[contains(text(),'Password assistance')]")
    public WebElement passwordAssistanceText;

    @FindBy(xpath ="//h1[contains(text(),'Create account')]")
    public WebElement createAccountText;
 //  @FindBy(xpath ="//h1[@class='a-spacing-small']")
   // @FindBy(xpath = "//h1")







}
