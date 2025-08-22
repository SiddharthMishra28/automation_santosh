package com.automationframework.tests;

import com.automationframework.config.Hooks;
import com.automationframework.pages.BankManagerHomePage;
import com.automationframework.pages.LoginPage;
import com.automationframework.utils.CommonUtils;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTests extends Hooks {

    CommonUtils utils;

    @Test
    public void testOne() {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test(dataProvider = "login_provider")
    public void loginBankPageTest(String username, String password) throws InterruptedException {
        utils = new CommonUtils(driver);
        utils.navigate(config.getProperty("base_url"));
        utils.typeIntoInputField(LoginPage.userIdField, username);
        utils.typeIntoInputField(LoginPage.password, password);
        utils.clickElement(LoginPage.loginButton);
        utils.waitForXSeconds(2);
        utils.validateConditionTrue(true, utils.ifElementDisplayed(BankManagerHomePage.newCustomerLink));
    }

    @DataProvider(name = "login_provider")
    public String[][] loginProvider() {
        utils = new CommonUtils(driver);
        return utils.getExcelData(config.getProperty("excel_data_source_path"), "login_credentials");
    }
}
