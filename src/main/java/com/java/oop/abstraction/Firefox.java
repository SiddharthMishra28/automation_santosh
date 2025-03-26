package com.java.oop.abstraction;

public class Firefox implements WebDriver{
    @Override
    public void launch() {
        // FIREFOX SPECIFIC CODE
//        windows.run("dsdaad")
        System.out.println("Launched Firefox...");
    }

    @Override
    public void navigate(String url) {
//        document.header().get(url)
    }

    @Override
    public void findElement(String xpath) {

    }

    @Override
    public void closeBrowser() {

    }
}
