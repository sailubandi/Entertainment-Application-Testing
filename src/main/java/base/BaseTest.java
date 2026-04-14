package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	public WebDriver driver; 
	public WebDriverWait wait;

	@BeforeMethod
	public void setup() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.hotstar.com/in");
	    

	    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}