package pages;

import model.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public static By signIn = By.linkText("Sign in");
    public static By searchBox = By.xpath("//*[@id='gh-ac']");
    public static By searchBtn = By.xpath("//*[@id='gh-btn']");
    public static By categories = By.id("gh-cat");
    public static By categoryNameHealthAndBeauty = By.xpath("//*[@id='gh-cat']/option[20]");
    public static By dailyDeals = By.linkText("Daily Deals");

    public HomePage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String homePageUrl () {
        return Locators.homePageUrl;
    }

    public String getCurrentUrl () {
        return driver.getCurrentUrl();
    }

    public String getTitle () {
        return driver.getTitle();
    }

    public LoginPage clickSignInButton() {
        driver.findElement(signIn).click();

        return new LoginPage(driver);
    }

    public void clickOnSearchBox() {
        driver.findElement(searchBox).click();
    }

    public void setSearchItem(String item) {
        driver.findElement(searchBox).sendKeys(item);
    }

    public void clickOnSearchButton() {
        driver.findElement(searchBtn).click();
    }
    public void clickOnCategoryNameHealthAndBeauty() {
        driver.findElement(categoryNameHealthAndBeauty).click();
    }

    public void clickOnSearchCategories() {
        driver.findElement(categories).click();
    }

    public void clickOnDailydeals() {

    }
}
