package com.automationframework.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CommonUtils {

    public WebDriver driver;

    //CONSTRUCTOR INJECTION
    public CommonUtils(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * <p>Navigates to provided URL</p>
     * @param url
     */
    public void navigate(String url) {
        driver.get(url);
    }

    /**
     * <p>Takes a locator and sends keystrokes to same</p>
     * @param locator
     * @param keys
     */
    public void typeIntoInputField(By locator, String keys) {
        driver.findElement(locator).sendKeys(keys);
    }

    /**
     * <p>Clicks on provided UI element</p>
     * @param locator
     */
    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    /**
     * <p>Validates for condition to be met and marks test case pass or fail</p>
     * @param expected
     * @param actual
     */
    public void validateCondition(String expected, String actual) {
        Assert.assertEquals(actual, expected);
    }

    /**
     * <p>Checks for condition to be true</p>
     * @param expected
     * @param actual
     */
    public void validateConditionTrue(boolean expected, boolean actual) {
        Assert.assertEquals(actual, expected);
    }

    /**
     * <p>Checks if a UI element is displayed on screen</p>
     * @param locator
     * @return
     */
    public boolean ifElementDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    /**
     * <p>Pauses script for provided number of seconds</p>
     * @param seconds
     * @throws InterruptedException
     */
    public void waitForXSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }
}
