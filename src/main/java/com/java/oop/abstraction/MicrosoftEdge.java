package com.java.oop.abstraction;

public class MicrosoftEdge implements WebDriver{
    @Override
    public void launch() {
        // EDGE SPECIFIC CODE
        System.out.println("Launched Edge Browser...");
    }

    @Override
    public void navigate(String url) {
        // DIFFERENT CODE THAN FIREFOX TO NAVIGATE
        System.out.println("Navigating To "+url);
    }

    @Override
    public void findElement(String xpath) {
        System.out.println("Found Element "+xpath);
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser");
    }
}
