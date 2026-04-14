package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

 

    // Input field (appears after click)
    @FindBy(xpath = "//input[@type='text']")
    WebElement searchBox;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

 
}