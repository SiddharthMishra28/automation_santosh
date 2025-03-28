package com.java.oop.composition;

public class Wheels {
    private String radius;
    private String type;

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRadius() {
        return this.radius;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "radius='" + radius + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
