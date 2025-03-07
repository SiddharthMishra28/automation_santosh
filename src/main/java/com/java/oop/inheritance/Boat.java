package com.java.oop.inheritance;

public class Boat extends Vehicle {
    String material;
    String fuelType;
    int speed;

    public static void main(String[] args) {
        Boat speedBoat = new Boat();
        speedBoat.engineCapacity = 2000;
    }
}
