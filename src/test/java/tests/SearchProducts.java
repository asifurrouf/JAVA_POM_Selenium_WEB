package tests;

import base.BaseTests;
import model.CommonMethods;
import model.Locators;
import model.Timout;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class SearchProducts extends BaseTests {

    CommonMethods commonMethods = new CommonMethods(driver);
    HomePage homePage = new HomePage(driver);

    @BeforeTest
    public void beforeTests() {
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

    //search from searchBox
    @Test(priority = 1)
    public void searchFromSearchBoxTest () {
        HomePage homePage = new HomePage(driver);
        Timout.timeout();
        homePage.clickOnSearchBox();
        Timout.timeout();
        homePage.setSearchItem("Mobile");
        Timout.timeout();
        homePage.clickOnSearchButton();
        Timout.timeout();
    }

    //Select from categories
    @Test (priority = 2)
    public void selectFromCategory () {
        HomePage homePage = new HomePage(driver);
        Timout.timeout();
        homePage.clickOnSearchCategories();
        Timout.timeout();
        homePage.clickOnCategoryNameHealthAndBeauty();
        Timout.timeout();
        homePage.clickOnSearchButton();
    }
}
