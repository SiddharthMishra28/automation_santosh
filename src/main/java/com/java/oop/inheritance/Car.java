package com.java.oop.inheritance;

public class Car extends Vehicle {
    String brand;
    String color;
    int numWheels;

    public static void main(String[] args) {
        Car tataSumo = new Car();
        tataSumo.seatCapacity = 7; // INHERITED FROM PARENT VEHICLE
    }
}
