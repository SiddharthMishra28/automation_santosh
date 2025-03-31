package com.java.oop.composition;

public class Main {
//    public static void main(String[] args) {
//        Engine fiatEngine = new Engine();
//        fiatEngine.setEngineType("CNG");
//        fiatEngine.setNumCylinder(4);
//        fiatEngine.setCapacityInCc(1100);
//        System.out.println(fiatEngine);
//        Transmission cvtTransmission = new Transmission();
//        cvtTransmission.setType("CVT");
//        cvtTransmission.setNumGears(5);
//
//        Wheels mrf = new Wheels();
//        mrf.setRadius("17RF");
//        mrf.setType("Hot");
//
//        Car santro = new Car();
//        santro.setEngine(fiatEngine);
//        santro.setTransmission(cvtTransmission);
//        santro.setWheels(mrf);
//
//        System.out.println(santro);
//    }

    public static void main(String[] args) {
        Motherboard asus = new Motherboard();
        asus.setBoardId("AS100");
        asus.setProcessor("Snapdragon 850");
        asus.setRamCapacity(8);

        LcdScreen screen = new LcdScreen();
        screen.setType("Samsung TFT");
        screen.setNumColors(16000000);
        screen.setResolution(2048.0);

        Phone galaxyPhone = new Phone();
        galaxyPhone.setMotherboard(asus);
        galaxyPhone.setLcdScreen(screen);
        System.out.println(galaxyPhone);

    }
}
