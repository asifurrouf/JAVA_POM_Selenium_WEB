package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public static By userName = By.id("userid");
    public static By continueBtn = By.id("signin-continue-btn");
    public static By passWord = By.id("pass");
    public static By signInBtn = By.id("sgnBt");
    public static By fbXPath = By.xpath("//*[@id='signin_fb_btn']");
    public static By googleId = By.id("signin_ggl_btn");

    public LoginPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSignInWithGoogle() {
        driver.findElement(googleId).click();
    }

    public void setUserName(String userNameText) {
        driver.findElement(userName).sendKeys(userNameText);
    }

    public void getContinueButton() {
        driver.findElement(continueBtn).click();
    }

    public void setPassword(String pass) {
        driver.findElement(passWord).sendKeys(pass);
    }

    public void getSignInButton() {
        driver.findElement(signInBtn).click();
    }

    public void clickSignInWithFacebook() {
        driver.findElement(fbXPath).click();
    }

    public String getTitle () {
        return driver.getTitle();
    }
}
