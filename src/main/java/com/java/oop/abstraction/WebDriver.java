package com.java.oop.abstraction;

public interface WebDriver {

    void launch();

    void navigate(String url);

    void findElement(String xpath);

    void closeBrowser();
}
