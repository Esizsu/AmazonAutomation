package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

public class Driver {  // class is public
    /*
        What is Driver ? = Create and initialize the driver instance
        Why do we need driver class  ? => Usability. Avoid duplication
        Faster development
         *
         */
    private static WebDriver driver;  // made our instance of  WebDriver static to call it.

    private Driver() {  // constructor is private, which is singelton by making constructor private.
    }

    //Create getDriver method to Create and initialize the driver instance (private static WebDriver driver)
    public static WebDriver getDriver(){

        if (driver==null){
//           check the browser type
            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "safari":   // I don't have safari so this option won't works
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver= new SafariDriver();
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }
        //    closeDriver is used for closing the driver
    public static void closeDriver(){
        if (driver!=null){ // if driver is not null, pointing any driver like chromedriver then
            driver.quit(); // close driver
            driver=null; // and then make it null for we can use another driver object like mozilla.
        }
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
