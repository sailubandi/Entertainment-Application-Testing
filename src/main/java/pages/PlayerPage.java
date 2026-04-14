package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class PlayerPage {

    WebDriver driver;
    WebDriverWait wait;

    // ✅ Instead of video, check play button or player container
    @FindBy(xpath = "//button[contains(@class,'play') or contains(@aria-label,'Play')]")
    WebElement playButton;

    public PlayerPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }

    public boolean isPlayerLoaded() {

        String url = driver.getCurrentUrl();
        String title = driver.getTitle();

        return url.contains("watch") || title.toLowerCase().contains("hotstar");
    }
}