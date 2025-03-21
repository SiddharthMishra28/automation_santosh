package com.java.oop.polymorphism;

public class Macbook extends Computer {

    //OVERRIDING PARENTS shutDown METHOD
    @Override // OPTIONAL BUT IMPROVES READABILITY
    public void shutDown() {
        System.out.println("Shutting down all processes..");
        System.out.println("Turning off your mac");
    }

    // OVERLOADED METHOD
    public void shutDown(String message) {
        System.out.println("Shutting down all processes..");
        System.out.println("Turning off your mac");
        System.out.println(message);
    }

    public static void main(String[] args) {
        Macbook air = new Macbook();
        air.brand = "Apple";
        air.os = "MacOS";
        air.processorCapacity = 3;
        air.ramCapacity = 18;
        air.storageInGb = 1000;

        air.bootUp();
        air.shutDown(); // METHOD OVERRIDING and MORPHING
    }
}
