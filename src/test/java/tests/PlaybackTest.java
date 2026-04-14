package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.PlayerPage;

public class PlaybackTest extends BaseTest {

    @Test
    public void verifyPlayback() throws InterruptedException {

        System.out.println("Playback Test Started");

        driver.get("https://www.hotstar.com/in");

        Thread.sleep(5000);

        // ✅ Click any content (first clickable image)
        driver.findElement(By.xpath("(//img)[1]")).click();

        Thread.sleep(5000);

        PlayerPage player = new PlayerPage(driver);

        if (player.isPlayerLoaded()) {
            System.out.println("Player loaded successfully ✅");
        } else {
            System.out.println("Player NOT loaded ❌");
        }
    }
}