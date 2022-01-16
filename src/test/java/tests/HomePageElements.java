package tests;

import base.BaseTests;
import model.CommonMethods;
import model.Locators;
import model.Timout;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class HomePageElements extends BaseTests {

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

    //Deals
    @Test (priority = 1)
    public void dailyDealsTest () {
        HomePage homePage = new HomePage(driver);
        Timout.timeout();
        commonMethods.clickOnButton(Locators.dailyDeals);
        Timout.timeout();
        String deals = commonMethods.getText(Locators.deals);
        assertEquals(deals, Locators.dealsText);
        System.out.println("Successfully visit " + deals);
    }

    //help & contact
    @Test (priority = 2)
    public void helpAndContact () {
        commonMethods.back();
        Timout.timeout();
        commonMethods.clickOnButton(Locators.helpAndContact);
        Timout.timeout();
        String customerAndServicesText = commonMethods.getText(Locators.customerServiceId);
        assertEquals(customerAndServicesText, Locators.customerServicesText);
        System.out.println("Successfully visit " + customerAndServicesText);
    }

    //sell
    @Test (priority = 3)
    public void sellTest () {
        commonMethods.back();
        Timout.timeout();
        commonMethods.clickOnButton(Locators.sell);
        Timout.timeout();
        String sellText = commonMethods.getText(Locators.sellingPath);
        assertEquals(sellText, "You are on selling home page\n" + Locators.sellText);
        System.out.println("Successfully visit " + sellText);
    }
    //electronics
    @Test (priority = 4)
    public void electronicsTest () {
        commonMethods.back();
        Timout.timeout();
        commonMethods.clickOnButton(Locators.electronics);
        Timout.timeout();
        String electronicsText = commonMethods.getText(Locators.electronicsPath);
        assertEquals(electronicsText, Locators.electronicsText);
        System.out.println("Successfully visit " + electronicsText);
    }
    //fashion
    @Test (priority = 5)
    public void fashionTest () {
        commonMethods.back();
        Timout.timeout();
        commonMethods.clickOnButton(Locators.fashion);
        Timout.timeout();
        String fashionText = commonMethods.getText(Locators.fashionPath);
        assertEquals(fashionText,Locators.fashionText);
        System.out.println("Successfully visit " + fashionText);
    }
    //healthAndBeauty
    @Test (priority = 6)
    public void healthAndBeautyTest () {
        commonMethods.back();
        Timout.timeout();
        commonMethods.clickOnButton(Locators.healthAndBeauty);
        Timout.timeout();
        String healthAndBeautyText = commonMethods.getText(Locators.healthAndBeautyPath);
        assertEquals(healthAndBeautyText, Locators.healthAndBeautyText);
        System.out.println("Successfully visit " + healthAndBeautyText);
    }

    //homeAndGarden
    @Test (priority = 7)
    public void homeAndGardenTest () {
        commonMethods.back();
        Timout.timeout();
        commonMethods.clickOnButton(Locators.homeAndGarden);
        Timout.timeout();
        String homeAndGardenText = commonMethods.getText(Locators.homeAndGardenPath);
        assertEquals(homeAndGardenText, Locators.homeAndGardenText);
        System.out.println("Successfully visit " + homeAndGardenText);
    }
    //sports
    @Test (priority = 8)
    public void sportsTest () {
        commonMethods.back();
        Timout.timeout();
        commonMethods.clickOnButton(Locators.sports);
        Timout.timeout();
        String sportsText = commonMethods.getText(Locators.sportsPath);
        assertEquals(sportsText, Locators.sportsText);
        System.out.println("Successfully visit " + sportsText);
    }
    //collectiblesAndArtPage
    @Test (priority = 9)
    public void collectiblesAndArtPageTest () {
        commonMethods.back();
        Timout.timeout();
        commonMethods.clickOnButton(Locators.collectiblesAndArtPage);
        Timout.timeout();
        String collectiblesAndArtPageText = commonMethods.getText(Locators.collectiblesAndArtPagePath);
        assertEquals(collectiblesAndArtPageText, Locators.collectiblesAndArtPageText);
        System.out.println("Successfully visit " + collectiblesAndArtPageText);
    }
    //industrialEquipmentPage
    @Test (priority = 10)
    public void industrialEquipmentPageTest () {
        commonMethods.back();
        Timout.timeout();
        commonMethods.clickOnButton(Locators.industrialEquipmentPage);
        Timout.timeout();
        String industrialEquipmentPageText = commonMethods.getText(Locators.industrialEquipmentPagePath);
        assertEquals(industrialEquipmentPageText, Locators.industrialEquipmentPageText);
        System.out.println("Successfully visit " + industrialEquipmentPageText);
    }
    //motorsPage
    @Test (priority = 11)
    public void motorsPageTest () {
        commonMethods.back();;
        Timout.timeout();
        commonMethods.clickOnButton(Locators.motorsPage);
        Timout.timeout();
        //String motorsPageText = commonMethods.getText(Locators.motorsPagePath);
        assertEquals(driver.getCurrentUrl(), Locators.motorsPageUrl);
        System.out.println("Successfully visit Motor Page");
    }
}
