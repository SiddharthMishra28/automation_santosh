package com.java.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee p1 = new Employee();
//        p1.password = "abcd" // THROWS ERROR BECAUSE NOT IN SAME CLASS
        p1.phone = "12345"; // PROTECTED ACCESSIBLE WITHIN SAME PACKAGE SCOPE
    }
}
