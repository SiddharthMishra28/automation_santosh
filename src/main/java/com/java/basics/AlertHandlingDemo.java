package com.java.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        // SIMPLE ALERT HANDLING
//        driver.findElement(By.xpath("//button[text()='Alert']")).click();
//        driver.switchTo().alert().accept();

        // CONFIRM ALERT
//        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept(); // OK or YES or AGREE

        // YET TO BE COVERED!
        driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
//        driver.switchTo().alert().sendKeys("Santosh");
        Thread.sleep(3000);
//        driver.switchTo().alert().accept();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Santosh");
        alert.accept();
        Thread.sleep(2000);
        driver.quit();
    }
}
