package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // EXPLICIT WAIT OBJECT INSTANTIATION
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.id("btn1")).click();
        WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txt1"))));
        element.sendKeys("Hello");
        driver.quit();
    }
}
