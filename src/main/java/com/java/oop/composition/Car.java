package com.java.oop.composition;

public class Car {
    private Engine engine; // HAS-A RELATIONSHIP car has an engine
    private Transmission transmission;
    private Wheels wheels;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Wheels getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + wheels +
                '}';
    }
}
