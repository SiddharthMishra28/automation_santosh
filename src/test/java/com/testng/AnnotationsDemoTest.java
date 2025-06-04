package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationsDemoTest {
    @Test
    public void loginValidation() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://vistacommerce-qa.rf.gd/?i=1");
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "istamart");
        driver.quit();
    }
}
