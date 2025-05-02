package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBasicSession1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://vistacommerce-qa.rf.gd/");
        // XPATH - Applicable only to markup language
        // CSSPATH - Uses Styling strategy to locate elements

        // XPATH
        // 1. Absolute xpath - Starts from root html element
        // example - /html/body/main/header/nav/div/div
        // 2. Relative xpath - with reference to other elements
        // syntax - //tagname[@attribute='value']
        // //div[@class='row']
        // CSSPath - #header .row:nth-of-type(1)
        String contactInfo = driver.findElement(By.xpath("//div[@id='contact-infos']")).getText();
        System.out.println("Contact Information : "+contactInfo);
        driver.quit();

    }
}
