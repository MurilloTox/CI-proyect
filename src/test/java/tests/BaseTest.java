package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.ProductPage;

import java.sql.DriverManager;

public class BaseTest {
    private static DriverManager driverManager;
    public WebDriver driver = new ChromeDriver();
    public LoginPage loginPage;
    public ProductPage productPage;

    @BeforeClass
    public void setUp() {
        String browserType = System.getProperty("browserName");
        if (browserType == null || browserType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
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