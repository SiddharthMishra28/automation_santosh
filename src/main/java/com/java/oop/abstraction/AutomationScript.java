package com.java.oop.abstraction;

public class AutomationScript {
    public static void main(String[] args) {
        WebDriver driver = new Firefox();
        driver.launch();
        driver.navigate("https://www.google.com");
        driver.findElement("query=automation");
        driver.closeBrowser();
    }
}
