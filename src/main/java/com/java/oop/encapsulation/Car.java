package com.java.oop.encapsulation;

public class Car {
    private String make;
    private String model;
    private int engineCapacity;
    private int numGears;

    // GETTERS AND SETTERS
    public String getMake() {
        return this.make;
    }
    public void setMake(String make) {
        if(make == "") {

        }else {
            this.make = make;
        }
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
