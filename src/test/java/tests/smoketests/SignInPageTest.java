package tests.smoketests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SigInPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SignInPageTest {

    SigInPage sigInPage;
    @Test
    public void signPageTest(){
        sigInPage= new SigInPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));

        sigInPage.signInTab.click();
       // Faker faker = new Faker();
        sigInPage.signInEmailBox.sendKeys(Faker.instance().internet().emailAddress());
        sigInPage.continueButton.click();

        String text = sigInPage.alertText.getText();
        Assert.assertEquals(text,"There was a problem" );

        sigInPage.NeedHelpButton.click();
        sigInPage.ForgotYourPasswordButton.click();
        String passWordText =sigInPage.passwordAssistanceText.getText();
        Assert.assertEquals(passWordText, "Password assistance");

        ReusableMethods.waitFor(1000);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        sigInPage.accountCreationButton.click();

        String createAccountText= sigInPage.createAccountText.getText();
        Assert.assertEquals(createAccountText,"Create account");




    }
}
