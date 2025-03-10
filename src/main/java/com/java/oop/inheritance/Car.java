package com.java.oop.inheritance;

public class Car extends Vehicle {
    String brand;
    String color;
    int numWheels;

    public int move(int speed) {
        if(speed >0 && speed <=30) {
            System.out.println("started moving on "+speed+" km/hr");
            return 1;
        }else if(speed >30 && speed<=60) {
            System.out.println("started moving on "+speed+" km/hr");
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Car tataSumo = new Car();
        tataSumo.seatCapacity = 7; // INHERITED FROM PARENT VEHICLE
        tataSumo.startVehicle();
        int gear = tataSumo.move(42);
        System.out.println("changed to gear : "+gear);
        tataSumo.stopVehicle();
    }
}
