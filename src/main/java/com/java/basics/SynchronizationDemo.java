package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://juliemr.github.io/protractor-demo/");
        driver.findElement(By.xpath("//input[@ng-model='first']")).sendKeys("7");
        WebElement operation = driver.findElement(By.xpath("//select[@ng-model='operator']"));
        Select operatorDropdown = new Select(operation);
        operatorDropdown.selectByValue("SUBTRACTION");
        driver.findElement(By.xpath("//input[@ng-model='second']")).sendKeys("3");
        driver.findElement(By.id("gobutton")).click();
//        Thread.sleep(3000); // NOT RECOMMENDED
        // IMPLICIT WAIT - waits for x number of seconds before throwing nosuchelement exception
        String tableResult = driver.findElement(By.xpath("//tbody/tr[1]/td[3]")).getText(); // WAITS TILL THIS ELEMENT IS AVAILABLE MAX TILL 10 SECONDS
        System.out.println(tableResult);
        String result = driver.findElement(By.xpath("//h2[@class='ng-binding']")).getText();
        System.out.println(result);
        driver.quit();
    }
}
