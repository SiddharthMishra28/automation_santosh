package com.testng.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTestClass {

    public WebDriver driver;

    @BeforeSuite
    public void configureBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void gotoHomePage() {
        driver.get("http://vistacommerce-qa.rf.gd/?i=1");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
