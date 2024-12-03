package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.ProductPage;

import java.sql.DriverManager;

public class BaseTest {
    public WebDriver driver = new ChromeDriver();
    public LoginPage loginPage;
    public ProductPage productPage;

    @BeforeClass
    public void setUp() {
        String browserType = System.getProperty("browserName");
        if (browserType == null || browserType.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
            driver = new ChromeDriver();
        } else{
            driver = new EdgeDriver();
        }
        loginPage = new LoginPage(driver, "https://www.saucedemo.com/");
        productPage= new ProductPage(driver);
    }

    @AfterTest
    /**
     * Metodo que cierra la ventana cuando termina el test
     * */
    public void close(){
        driver.close();
    }
}