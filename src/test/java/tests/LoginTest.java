package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void verifyLoginPage() throws InterruptedException {

	    driver.get("https://www.hotstar.com/in/login");

	    Thread.sleep(5000);

	    System.out.println("Login page opened");

	    String url = driver.getCurrentUrl();

	    if (url.contains("login")) {
	        System.out.println("Login Page Verified");
	    }
	}
    @Test
    public void verifyLoginFlow() throws InterruptedException {

        driver.get("https://www.hotstar.com/in/login");

        LoginPage login = new LoginPage(driver);

        login.enterMobile("9999999999"); // dummy number
        login.clickContinue();

        System.out.println("Login flow executed");
    }
}