package utils;

import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {

        String path = "reports/" + testName + ".png";

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File(path);
            FileUtils.copyFile(src, dest);
        } catch (Exception e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        }

        return path;
    }
}