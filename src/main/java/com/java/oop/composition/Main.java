package com.java.oop.composition;

public class Main {
    public static void main(String[] args) {
        Engine fiatEngine = new Engine();
        fiatEngine.setEngineType("CNG");
        fiatEngine.setNumCylinder(4);
        fiatEngine.setCapacityInCc(1100);
        System.out.println(fiatEngine);
        Transmission cvtTransmission = new Transmission();
        cvtTransmission.setType("CVT");
        cvtTransmission.setNumGears(5);

        Wheels mrf = new Wheels();
        mrf.setRadius("17RF");
        mrf.setType("Hot");

        Car santro = new Car();
        santro.setEngine(fiatEngine);
        santro.setTransmission(cvtTransmission);
        santro.setWheels(mrf);

        System.out.println(santro);
    }
}
