package com.java.oop.composition;

public class Phone {
    private Motherboard motherboard; // HAS-A Relationship
    private LcdScreen lcdScreen;

    // GETTERS AND SETTERS
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Motherboard getMotherboard() {
        return this.motherboard;
    }

    public void setLcdScreen(LcdScreen lcdScreen) {
        this.lcdScreen = lcdScreen;
    }

    public LcdScreen getLcdScreen() {
        return this.lcdScreen;
    }

    @Override
    public String toString() {
        return this.lcdScreen+"..."+this.motherboard;
    }
}
