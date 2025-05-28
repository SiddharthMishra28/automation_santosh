package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropdownDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://vistacommerce-qa.rf.gd/");
        driver.findElement(By.xpath("//article[@data-id-product='2']")).click();
        WebElement sizeDropdownElement = driver.findElement(By.id("group_1"));
        Select sizeDropdown = new Select(sizeDropdownElement);
        sizeDropdown.selectByVisibleText("M");
        Thread.sleep(3000);
        driver.quit();
    }
}
