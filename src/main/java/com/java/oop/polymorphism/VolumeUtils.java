package com.java.oop.polymorphism;

public class VolumeUtils extends AreaUtils {
    int depth;

    @Override
    public void calcArea() {
        System.out.println("Area is "+(2*width*height)+(2*height*depth)+(2*depth*width));
    }
}
