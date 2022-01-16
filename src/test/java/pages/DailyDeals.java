package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DailyDeals {

    WebDriver driver;

    public DailyDeals (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
