package com.java.oop.polymorphism;

public class AreaUtils {

    int width;
    int height;

    public void calcArea() {
        System.out.println("Area is "+(width*height));
    }

    // OVERLOADED METHOD
    public void calcArea(boolean isReactangle) {
        System.out.println("Area is "+(0.5*width*height));
    }
}
