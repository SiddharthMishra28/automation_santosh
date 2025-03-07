package com.java.oop.basics;

public class Car {
    String brand;
    String model;
    int engineCapacity;
    int seatCapacity;
    int numWheels;

    public static void main(String[] args) {
        Car santro = new Car(); // new - 1. Reserve Memory, 2. Instantiate
        santro.brand = "Hyundai";
        santro.model = "Xing";
        santro.numWheels = 4;
        santro.seatCapacity = 5;
        santro.engineCapacity = 1100;

        Car creta = new Car();
        creta.brand = "Hyundai";
        creta.model = "ZX";
        creta.engineCapacity = 1600;
        creta.numWheels = 4;
        creta.seatCapacity = 5;

        Horse blackHorse = new Horse();
        blackHorse.numLegs = 4;
        blackHorse.species = "Equus caballus";

//        if(creta instanceof Horse){ // COMPILATION ERROR - NO DIRECT COMPARISON OF OBJECT TYPE ALLOWED
//            System.out.println("True");
//        }
    }
}
