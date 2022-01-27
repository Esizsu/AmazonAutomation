package tests.alltests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class HomePageTest {
    HomePage homePage;
    @Test
    public void homePageTest() throws InterruptedException {
        homePage=new HomePage();

        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));
            homePage.searchBox.sendKeys("iphone");
            homePage.searchInitiator.click();
            // "iphone" daki tirnaklari kaldirmak icin regex kullandik
            String searchedTex= homePage.searchedText.getText().replaceAll("[^A-Za-z]",""); //("[^A-z]", "");
            Assert.assertEquals(searchedTex, "iphone");

            ReusableMethods.hover(homePage.languageDropdown);
            homePage.languageRadioButton.click();

            JSUtils.scrollDownByJS();
            Thread.sleep(3000);
            String language= homePage.languageButton.getText();
            Assert.assertEquals(language, "Español");

            ReusableMethods.hover(homePage.signInTab);
            Assert.assertTrue(homePage.signInButton.isDisplayed());
            homePage.dropdownBox.click();

            int dropdownList= homePage.dropdownList.size();
            Assert.assertEquals(dropdownList, 60);
            homePage.allDropdown.click();

            Assert.assertTrue(homePage.signInButtonDropdown.isDisplayed());
            String chart= homePage.chartCount.getText().toString();
            Assert.assertEquals(chart, "0");
            Thread.sleep(3000);
            Driver.closeDriver();

    }
}
