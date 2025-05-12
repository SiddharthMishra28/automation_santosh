package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBasicSession2 {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
//        driver.findElement(By.xpath("//span[text()='Mobiles']")).click(); // FULL TEXT MATCH
        findByCompleteText("span", "Mobiles").click();
        // PARTIAL TEXT MATCH - //a[contains(text(), 'Seller')]
        Thread.sleep(3000);
        driver.quit();
    }

    public static WebElement findByCompleteText(String tagname, String text) {
        return driver.findElement(By.xpath("//"+tagname+"[text()='"+text+"']"));
    }
}
