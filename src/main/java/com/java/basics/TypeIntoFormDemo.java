package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeIntoFormDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("http://127.0.0.1:5500/");
//        driver.findElement(By.id("fname")).sendKeys("Santosh");

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        Thread.sleep(2000);
        driver.quit();
    }
}
