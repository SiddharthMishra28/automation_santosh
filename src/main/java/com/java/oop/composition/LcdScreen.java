package com.java.oop.composition;

public class LcdScreen {
    private String type;
    private int numColors;
    private double resolution;

    // GETTERS AND SETTERS

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumColors() {
        return numColors;
    }

    public void setNumColors(int numColors) {
        this.numColors = numColors;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "{"+this.type+" : "+this.numColors+" : "+this.resolution+"}";
    }
}
