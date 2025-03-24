package com.java.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Http browser = new Chrome(); // CONVENIENT FOR CHANGES
        browser.getMethod();
        browser.deleteMethod();
    }
}
