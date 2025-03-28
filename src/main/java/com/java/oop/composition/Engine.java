package com.java.oop.composition;

public class Engine {
    private String engineType;
    private int numCylinder;
    private int capacityInCc;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getNumCylinder() {
        return numCylinder;
    }

    public void setNumCylinder(int numCylinder) {
        this.numCylinder = numCylinder;
    }

    public int getCapacityInCc() {
        return capacityInCc;
    }

    public void setCapacityInCc(int capacityInCc) {
        this.capacityInCc = capacityInCc;
    }

    public String toString() {
        return "["+this.engineType+" : "+this.capacityInCc+" : "+this.numCylinder+"]";
    }
}
