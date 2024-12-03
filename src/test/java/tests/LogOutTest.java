package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTest {
    @Test
    @Parameters({"user", "password"})
    public void logOutTest(String user, String password){
        loginPage.login(user, password);
        productPage.clickOnBurqerMenu();
        Assert.assertTrue(productPage.isElementDisplayed(productPage.getLogOutButton()));
        productPage.logOut();
        Assert.assertTrue(loginPage.isLoginDisplayed());
    }
}