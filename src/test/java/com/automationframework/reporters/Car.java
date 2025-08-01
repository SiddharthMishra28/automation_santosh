package com.automationframework.reporters;

public class Car {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        Car santro = new Car();
        santro.setModel("Hyundai Xing");

        Car maruti = new Car();
        maruti.setModel("Vitara");

        if(santro == maruti){
            System.out.println("yes it is...");
        }else {
            System.out.println("not equal");
        }
    }
}
