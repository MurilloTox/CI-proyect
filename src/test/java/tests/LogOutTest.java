package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTest {
    @Test
    @Parameters({"user", "password"})
    @Description("Test for logOut functionality")
    @Step("Paso uno")
    public void logOutTest(@Optional("standard_user") String user, @Optional("secret_sauce")String password){
        loginPage.login(user, password);
        productPage.clickOnBurqerMenu();
        Assert.assertTrue(productPage.isElementDisplayed(productPage.getLogOutButton()));
        productPage.logOut();
        Assert.assertTrue(loginPage.isLoginDisplayed());
    }
}
