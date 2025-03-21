package com.java.oop.polymorphism;

public class Computer {
    String brand;
    int ramCapacity;
    int processorCapacity;
    int storageInGb;
    String os;

    // INITIAL METHOD WIHOUT PARAMETER
    public void bootUp() {
        if(os.equalsIgnoreCase("Windows")) {
            System.out.println("Welcome to windows");
        }else if(os.equalsIgnoreCase("macOs")){
            System.out.println("Apple Logo");
        }else {
            System.out.println("Welcome to Unix System");
        }
    }

    // CONCEPT OF MORPHING
    // OVERLOADED METHOD WITH PARAMETER
    public void bootUp(String message) {
        if(os.equalsIgnoreCase("Windows")) {
            System.out.println("Welcome to windows");
            System.out.println("Welcome "+message);
        }else if(os.equalsIgnoreCase("macOs")){
            System.out.println("Apple Logo");
            System.out.println("Welcome "+message);
        }else {
            System.out.println("Welcome to Unix System");
            System.out.println("Welcome "+message);
        }
    }

    public void shutDown() {
        System.out.println("Turning off computer..");
    }

//    public void shutDown(String message) {
//
//    }

    public static void main(String[] args) {
        Computer hp = new Computer();
        hp.brand = "Hewelett Packard";
        hp.os = "Linux";
        hp.processorCapacity = 3;
        hp.ramCapacity = 16;
        hp.storageInGb = 2000;

        hp.bootUp("Siddharth"); // OVERLOADED METHOD

    }
}
