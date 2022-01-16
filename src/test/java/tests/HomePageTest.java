package tests;

import base.BaseTests;
import model.CommonMethods;
import model.Locators;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import model.Timout;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class HomePageTest extends BaseTests {

    @Test
    public void homePageTest() {
        HomePage homePage = new HomePage(driver);
        Timout.timeout();
        String title = homePage.getTitle();
        assertEquals(title, "Electronics, Cars, Fashion, Collectibles & More | eBay");
    }
}
