package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(Utilities.TestListener.class)
public class BaseTest {

    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeTest
    public void buildDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Parameters.getEnvironmentParameters("url"));
    }
    @AfterClass
    public void driverClose(){
        driver.close();
    }
}
