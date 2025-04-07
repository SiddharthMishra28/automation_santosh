package com.java.oop.composition;

public class Radio {
    private ReceiverAntenna antenna; // HAS-A
    private Speaker speaker;

    public ReceiverAntenna getAntenna() {
        return this.antenna;
    }

    public Speaker getSpeaker() {
        return this.speaker;
    }

    public void setAntenna(ReceiverAntenna antenna) {
        this.antenna = antenna;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public static void main(String[] args) {
        ReceiverAntenna antenna1 = new ReceiverAntenna();
        antenna1.setCrystal("quartz");
        antenna1.setFrequency(2100);

        Speaker ahujaSpeaker = new Speaker();
        ahujaSpeaker.setType("Mid Range");
        ahujaSpeaker.setBrand("Philips");

        Radio panasonicRadio = new Radio();
        panasonicRadio.setAntenna(antenna1);
        panasonicRadio.setSpeaker(ahujaSpeaker);
    }
}
