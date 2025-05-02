package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndNavigateDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://vistacommerce-qa.rf.gd/");
        // id, name, linktext, partiallinktext, xpath, csspath, tagname
        driver.findElement(By.id("_desktop_user_info")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
