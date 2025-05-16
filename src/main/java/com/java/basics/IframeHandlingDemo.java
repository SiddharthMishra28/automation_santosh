package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandlingDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.switchTo().frame("frm2");
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Hello");
        Thread.sleep(3000);
        driver.switchTo().defaultContent(); // SWITCHES BACK TO MAIN DOCUMENT
        driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[1]/a")).click();
        driver.quit();
    }
}
