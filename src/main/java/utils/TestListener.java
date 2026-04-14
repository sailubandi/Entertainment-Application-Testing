package utils;

import org.openqa.selenium.WebDriver;
import org.testng.*;
import com.aventstack.extentreports.*;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getReportInstance();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        WebDriver driver = null;

        try {
            driver = (WebDriver) result.getTestClass()
                    .getRealClass()
                    .getField("driver")
                    .get(result.getInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        String path = ScreenshotUtil.captureScreenshot(driver, result.getName());

        test.addScreenCaptureFromPath(path);
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}