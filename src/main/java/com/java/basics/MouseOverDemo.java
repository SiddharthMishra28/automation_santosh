package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
//        WebElement homeFurniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
//        WebElement homeFurniturePicture = driver.findElement(By.xpath("/html/body/div[5]"));
//        WebElement kitchenDining = driver.findElement(By.xpath("//a[text()='Kitchen & Dining']"));
//        WebElement cookware = driver.findElement(By.xpath("//a[text()='Cookware']"));
        WebElement loginButton = driver.findElement(By.xpath("//span[text()='Login']"));
        actions.moveToElement(loginButton);
        Thread.sleep(2000);
//        actions.moveToElement(kitchenDining);
//        Thread.sleep(2000);
//        cookware.click();
//        driver.findElement(By.xpath("//a[text()='Kitchen & Dining']")).click(); // DOESN'T WORK DIRECTLY
//        Thread.sleep(3000);
        driver.quit();
    }
}
