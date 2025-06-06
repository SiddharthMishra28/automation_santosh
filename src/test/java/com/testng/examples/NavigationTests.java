package com.testng.examples;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTestClass {

    @Test
    public void signInLinkTest() {
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
        String loginPageTitle = driver.getTitle();
        Assert.assertEquals(loginPageTitle, "Login");
    }

    @Test
    public void showProductTest() {
        driver.findElement(By.xpath("//div[@class='products']//a[1]//img")).click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Hummingbird printed sweater");
        String descriptionText = driver.findElement(By.xpath("//div[@id='product-description-short-2']/p")).getText();
        Assert.assertTrue(descriptionText.contains("100% cotton"));
    }
}
