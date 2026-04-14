package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class SearchPage {

    WebDriver driver;
    WebDriverWait wait;

    // Search input field
    @FindBy(xpath = "//input")
    WebElement searchBox;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public void searchContent(String movie) {
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(movie);
    }
}