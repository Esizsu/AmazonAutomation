package tests.smoketests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddProductToCartPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.JSUtils;

public class AddProductToCartTest {
    AddProductToCartPage addProductToCartPage;

    @Test
    public void setSignInPage() throws InterruptedException {

        addProductToCartPage = new AddProductToCartPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));

        addProductToCartPage.searchBox.sendKeys("iphone 13", Keys.ENTER);
        addProductToCartPage.adressButton.click();
        addProductToCartPage.addressBox.sendKeys("95630");
        Thread.sleep(3000);
        addProductToCartPage.applyButton.click();
        Thread.sleep(2000);
//        addProductToCartPage.continueButton.click();
//        Thread.sleep(3000);
        addProductToCartPage.doneButton.click();   //   BENDE DONE CALISIYOR....
        addProductToCartPage.appleBox.click();
        addProductToCartPage.minimumPrice.sendKeys("500");
        addProductToCartPage.maxPrice.sendKeys("2500");
        addProductToCartPage.doneButton1.click();
        Thread.sleep(3000);
        addProductToCartPage.modelYear.click();
        Thread.sleep(3000);
        addProductToCartPage.sortButton.click();
        addProductToCartPage.highToLoxButton.click();

        for (WebElement product : addProductToCartPage.products) {

            if (product.getText().contains("iPhone 13")) {

                product.click();
                int actualPrice = Integer.parseInt(addProductToCartPage.actualPrice.getText().replaceAll("[^0-9]", ""))/100;
                Assert.assertTrue(actualPrice > 1000 && actualPrice < 2000);
                Thread.sleep(3000);
                JSUtils.clickElementByJS(addProductToCartPage.memoryCapacity);
                JSUtils.clickElementByJS(addProductToCartPage.color);
                addProductToCartPage.signInToCheckEligibility.click();
            }
        }

    }

}
