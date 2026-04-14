package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//input[@type='tel' or @type='text']")
    WebElement mobileInput;

    @FindBy(xpath = "//button")
    WebElement continueBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }

    public void enterMobile(String number) {
        wait.until(ExpectedConditions.visibilityOf(mobileInput));
        mobileInput.sendKeys(number);
    }

    public void clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();
    }
}