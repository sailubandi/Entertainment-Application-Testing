package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.SearchPage;

public class SearchTest extends BaseTest {

    @Test
    public void verifySearchFunctionality() throws InterruptedException {

        System.out.println("Search Test Started");

        // ✅ Direct navigation (IMPORTANT)
        driver.get("https://www.hotstar.com/in/search");

        Thread.sleep(5000);

        SearchPage search = new SearchPage(driver);
        search.searchContent("IPL");

        System.out.println("Search Completed Successfully");
    }
}