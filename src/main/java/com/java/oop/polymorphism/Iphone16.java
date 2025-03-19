package com.java.oop.polymorphism;

public class Iphone16 extends Mobile {

    // METHOD OVERRIDING
    // OVERRIDES PARENT METHOD connectToNetwork()
    @Override
    public void connectToNetwork() {
        System.out.println("Searching for Network");
        if(network.equalsIgnoreCase("5G")) {
            System.out.println("Connected to 5G!");
        }else {
            System.out.println("Connected!");
        }
    }
}
