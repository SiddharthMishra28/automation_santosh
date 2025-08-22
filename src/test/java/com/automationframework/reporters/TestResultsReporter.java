package com.automationframework.reporters;

import com.automationframework.config.Hooks;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestResultsReporter implements ITestListener {

    ExtentReports extent;
    ExtentSparkReporter spark;
    ExtentTest test;


    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test "+result.getTestName()+" PASSED");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.PASS, "Test "+result.getTestName()+" FAILED");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
//        test.log(Status.PASS, "Test "+result.getTestName()+" SKIPPED");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("On timeout");
    }

    @Override
    public void onStart(ITestContext context) {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter(Hooks.config.getProperty("report_directory"));
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
