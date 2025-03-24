package com.java.oop.abstraction;

// PARTIAL ABSTRACTION!
abstract public class ImageProcessing { // TO AVOID DIRECT MODIFICATION
    float height;
    float width;
    String redHue;
    String greenHue;
    String blueHue;

    // METHODS
    public void convertToBlackAndWhite() {
        System.out.println("Black and white Converted..");
    }

    public abstract void resizeImage();
}
