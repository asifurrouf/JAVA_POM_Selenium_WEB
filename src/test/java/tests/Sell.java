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
//public class Sell {
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
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,350)", "");
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.signIn);
//        timeout.timeout();
//        commonMethods.back();
//    }
//
//    //Start Selling
//    @Test(priority = 1)
//    public void startSellingTest () {
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.startSelling);
//        timeout.timeout();
//        assertEquals(homePage.getCurrentUrl(), Locators.startSellingPageUrl);
//        System.out.println("Successfully visit " + Locators.startSellingPageUrl);
//    }
//
//    //learn to sell
//    @Test (priority = 2)
//    public void learnToSell () {
//        commonMethods.back();
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.learnToSell);
//        timeout.timeout();
//        assertEquals(homePage.getCurrentUrl(), Locators.learnToSellPageUrl);
//        System.out.println("Successfully visit " + Locators.learnToSellPageUrl);
//    }
//
//    //Affiliates
//    @Test (priority = 3)
//    public void affiliatesTest () {
//        commonMethods.back();
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.affiliates);
//        timeout.timeout();
//        assertEquals(homePage.getCurrentUrl(), Locators.affiliatesPageUrl);
//        System.out.println("Successfully visit " + Locators.affiliatesPageUrl);
//    }
//
//    @AfterClass
//    public void tearDown() {
//        timeout.timeout();
//        driver.quit();
//    }
//}
