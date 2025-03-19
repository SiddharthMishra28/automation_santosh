package com.java.oop.polymorphism;

public class Mobile {
    String brand;
    String model;
    int ram;
    int storage;
    String network;

    public void switchOn() {
        System.out.println("Turning On Mobile Phone...");
    }
    // METHOD OVERLOADING
    public void switchOn(String os) {
        if(os.equalsIgnoreCase("Android")) {
            System.out.println("Welcome to Android..");
        }else if(os.equalsIgnoreCase("Ios")){
            System.out.println("Welcome to Apple Ecosystem...");
        }else {
            System.out.println("Swithing on phone...");
        }
    }
    // NOT ALLOWED WITH SAME SIGNATURE!
//    public void switchOn(String abc) {
//
//    }
    // METHOD OVERLOADING
    public void switchOn(String os, String message) {
        if(os.equalsIgnoreCase("Android")) {
            System.out.println("Welcome to Android..");
            System.out.println(message);
        }else if(os.equalsIgnoreCase("Ios")){
            System.out.println("Welcome to Apple Ecosystem...");
            System.out.println(message);
        }else {
            System.out.println("Swithing on phone...");
            System.out.println(message);
        }
    }
    public void switchOff() {
        System.out.println("Shutting Down Mobile Phone...");
    }

    // THIS WILL BE OVERRIDDEN IN CHILD CLASS
    public void connectToNetwork() {
        System.out.println("Searching for Network..");
        System.out.println("Connected!");
    }
}
