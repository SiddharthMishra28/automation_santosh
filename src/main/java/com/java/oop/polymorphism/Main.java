package com.java.oop.polymorphism;

public class Main {
//    public static void main(String[] args) {
//        Mobile nokia = new Mobile();
//        nokia.brand = "Nokia";
//        nokia.model = "6600";
//        nokia.ram = 4;
//        nokia.storage = 128;
//
//        nokia.switchOn("IOS", "Hello there!");
//        nokia.switchOff();
//
//        Iphone16 iphone16 = new Iphone16();
//        iphone16.brand = "Apple";
//        iphone16.model = "Apple Iphone 16";
//        iphone16.ram = 6;
//        iphone16.storage = 256;
//        iphone16.network = "5G";
//        iphone16.switchOn("IOS");
//        iphone16.connectToNetwork();
//        iphone16.switchOff();
//    }

    public static void main(String[] args) {
        VolumeUtils utils = new VolumeUtils();
        utils.height = 10;
        utils.width = 12;
        utils.depth = 6;

        utils.calcArea();
    }
}
