package Utilities;

import Utilities.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;


public class TestListener extends BaseTest implements ITestListener {

    private static ExtentReports extent = utilities.extentReports.ExtentManager.createInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    private static ExtentTest extentTest;

    @Override
    public synchronized void onStart(ITestContext context) {
    }

    @Override
    public synchronized void onFinish(ITestContext context) {
        extent.flush();
    }

    @Override
    public synchronized void onTestStart(ITestResult result) {
    }

    @Override
    public synchronized void onTestSuccess(ITestResult result) {
        if (!result.getMethod().getDescription().equals("")) {
            System.out.println((result.getMethod().getDescription() + " passed!"));
            extentTest = extent.createTest(result.getMethod().getDescription());
            extentTest.log(Status.PASS, result.getMethod().getDescription() + " Passed");
            extentTest.assignCategory(result.getMethod().getGroups());
        } else
            System.out.println((result.getMethod().getMethodName() + " Description cannot be null or empty "));
    }

    @Override
    public synchronized void onTestFailure(ITestResult result) {
        if (!result.getMethod().getDescription().equals("")) {
            //System.out.println((result.getMethod().getMethodName() + " failed!"));
            extentTest = extent.createTest(result.getMethod().getDescription());
            extentTest.log(Status.FAIL, result.getMethod().getDescription() + " Failed");
            extentTest.log(Status.FAIL, result.getThrowable());
            extentTest.assignCategory(result.getMethod().getGroups());
            try {
                takeScreenShot(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            System.out.println((result.getMethod().getMethodName() + " Description cannot be null or empty "));
    }

    @Override
    public synchronized void onTestSkipped(ITestResult result) {
        if (!result.getMethod().getDescription().equals("")) {
            //System.out.println((result.getMethod().getMethodName() + " skipped!"));
            extentTest = extent.createTest(result.getMethod().getDescription());
            extentTest.log(Status.SKIP, result.getMethod().getDescription() + " Skipped");
            extentTest.log(Status.SKIP, result.getThrowable());
        } else
            System.out.println((result.getMethod().getMethodName() + " Description cannot be null or empty "));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println(("onTestFailedButWithinSuccessPercentage for " + result.getMethod().getMethodName()));
    }

    private void takeScreenShot(ITestResult result) throws IOException {
        Object testClass = result.getInstance();
        WebDriver driver = ((BaseTest) testClass).getDriver();
        String screenShotPath = System.getProperty("user.dir") + "\\Screenshot\\" + result.getMethod().getDescription() + ".png";
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(screenShotPath));
        extentTest.log(Status.FAIL, result.getMethod().getDescription()).addScreenCaptureFromPath(screenShotPath, result.getMethod().getDescription());
    }
}