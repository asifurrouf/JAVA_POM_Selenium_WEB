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
//public class RegistrationTest {
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
//    }
//
//    @Test
//    public void registrationTest () {
//        timeout.timeout();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,350)", "");
//        commonMethods.clickOnButton(Locators.registration);
//        timeout.timeout();
//        commonMethods.clickOnButton(Locators.firstSignUpBtn);
//        commonMethods.clickOnButton(Locators.secondSignUpBtn);
//        timeout.timeout();
//        assertEquals(commonMethods.getText(Locators.signUpPage), Locators.signUpPageText);
//    }
//
//    @AfterClass
//    public void tearDown() {
//        timeout.timeout();
//        driver.quit();
//    }
//}
