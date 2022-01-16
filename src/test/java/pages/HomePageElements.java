package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {

    WebDriver driver;

    public HomePageElements (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
