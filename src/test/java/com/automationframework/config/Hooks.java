package com.automationframework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * <p>This class is responsible for controlling the execution lifecycle of the
 * test cases in the automation framework. Any configurable items relatd to
 * test lifecycle should be part of this file.</p>
 * @Author: Siddharth Mishra
 * @Version 1.0
 */
public class Hooks {
    public static Properties config;
    public WebDriver driver;

    @BeforeSuite
    public static void beforeSuite() {
        readConfig();
    }

    @BeforeTest
    public void beforeTest() {
        this.launchBrowser();
    }

    @BeforeMethod
    public void beforeMethod() {

    }

    @AfterMethod
    public void afterMethod() {

    }

    @AfterTest
    public void afterTest() {
        this.closeBrowser();
    }

    @AfterSuite
    public static void afterSuite() {

    }

    /**
     * <p>Launches Browser and configiures for execution as per provided config</p>
     * @return void
     * @Version 1.0
     */
    public void launchBrowser() {
        if(config.getProperty("browser").equalsIgnoreCase("CHROME")) {
            driver = new ChromeDriver();
        }else if(config.getProperty("browser").equalsIgnoreCase("EDGE")) {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
    }

    /**
     * <p>This method reads the config properties files and parses the same
     * into Key value pairs for usage across the framework</p>
     * @return Properties
     * @Version 1.0
     */
    public static Properties readConfig() {
        try {
            FileInputStream fis = new FileInputStream(new File("src/test/resources/config.properties"));
            config = new Properties();
            config.load(fis);
            return config;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * <p>Checks for an active instance of Webdriver based browser. If active
     * closes the same</p>
     * @return void
     * @Version 1.0
     */
    public void closeBrowser() {
        if(driver != null) {
            driver.quit();
        }
    }
}
