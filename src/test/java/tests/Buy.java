//package tests;
//
//import base.BaseTests;
//import model.CommonMethods;
//import model.Locators;
//import model.Timout;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import pages.HomePage;
//
//import static org.testng.Assert.assertEquals;
//
//public class Buy {
//    BaseTests baseTests = new BaseTests();
//    WebDriver driver = baseTests.setUp();
//    Timout timeout = new Timout();
//    CommonMethods commonMethods = new CommonMethods(driver);
//    HomePage homePage = new HomePage(driver);
//
//    @BeforeClass
//    public void setUp () {
//        driver.manage().window().maximize();
//        driver.get(homePage.homePageUrl());
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.signIn);
//        timeout.timeout();
//        commonMethods.back();
//    }
//
//    @Test
//    public void buySection () {
//        timeout.timeout();
//        //JavascriptExecutor js = (JavascriptExecutor) driver;
//        //js.executeScript("window.scrollBy(0, 350)", "");
//        commonMethods.clickOnButton(Locators.moneyBackGuarantee);
//        assertEquals(homePage.getCurrentUrl(), Locators.moneyBackGuaranteeUrl);
//        timeout.timeout();
//        commonMethods.back();
//        commonMethods.clickOnButton(Locators.biddingAndBuyingHelp);
//        assertEquals(homePage.getCurrentUrl(), Locators.biddingAndBuyingHelpUrl);
//        timeout.timeout();
//        commonMethods.back();
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.stores);
//        timeout.timeout();
//        assertEquals(homePage.getCurrentUrl(), Locators.storesUrl);
//        timeout.timeout();
//    }
//    @AfterClass
//    public void tearDown() {
//        timeout.timeout();
//        driver.quit();
//    }
//}
