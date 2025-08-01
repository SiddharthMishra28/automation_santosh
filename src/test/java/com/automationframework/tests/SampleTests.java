package com.automationframework.tests;

import com.automationframework.config.Hooks;
import com.automationframework.pages.BankManagerHomePage;
import com.automationframework.pages.LoginPage;
import com.automationframework.utils.CommonUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTests extends Hooks {

    CommonUtils utils;

    @Test
    public void testOne() {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test
    public void loginBankPageTest() throws InterruptedException {
        utils = new CommonUtils(driver);
        utils.navigate(config.getProperty("base_url"));
        utils.typeIntoInputField(LoginPage.userIdField, "mngr629085");
        utils.typeIntoInputField(LoginPage.password, "Ymaguty");
        utils.clickElement(LoginPage.loginButton);
        utils.waitForXSeconds(2);
        utils.validateConditionTrue(true, utils.ifElementDisplayed(BankManagerHomePage.newCustomerLink));
    }
}
