package tests;

import base.BaseTests;
import model.CommonMethods;
import model.Locators;
import model.Timout;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class SignInTest extends BaseTests {

    CommonMethods commonMethods = new CommonMethods(driver);

    @Test(priority = 1)
    public void usernameAndPassLoginTest(){
        HomePage homePage = new HomePage(driver);
        Timout.timeout();
        LoginPage loginPage = homePage.clickSignInButton();
        Timout.timeout();
        try {
            loginPage.setUserName("ashiq.qups@gmail.com");
            Timout.timeout();
            loginPage.getContinueButton();
            Timout.timeout();
            loginPage.setPassword("ashiq20");
            Timout.timeout();
            loginPage.getSignInButton();
            Timout.timeout();
        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }

    @Test (priority = 2)
    public void facebookLoginTest() {
        HomePage homePage = new HomePage(driver);
        Timout.timeout();
        LoginPage loginPage = homePage.clickSignInButton();
        Timout.timeout();
        try {
            loginPage.clickSignInWithFacebook();
            assertEquals(loginPage.getTitle(), Locators.fbLoginPageTitle);
        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
    @Test (priority = 3)
    public void googleLoginTest () {
        HomePage homePage = new HomePage(driver);
        Timout.timeout();
        LoginPage loginPage = homePage.clickSignInButton();
        Timout.timeout();
        try {
            loginPage.clickOnSignInWithGoogle();
            Timout.timeout();
            System.out.println(commonMethods.getTitle());
        } catch (Exception e) {
            CommonMethods commonMethods = new CommonMethods(driver);
            commonMethods.back();
        }
    }
}
