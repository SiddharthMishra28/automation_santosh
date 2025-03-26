package com.java.oop.encapsulation;

public class Person {
    // ACCESS SPECIFIER / ACCESS MODIFIER - public, private, protected, default
    String name; // DEFAULT - ONLY ACCESSIBLE INSIDE SAME PACKAGE
    public String email; // PUBLIC - ACCESSIBLE EVERYWHERE
    protected String phone; // PROTECTED - ONLY IN SAME PACKAGE OR IN CHILD CLASSES
    private String password; // PRIVATE - ACCESSIBLE WITHIN SAME CLASS SCOPE ONLY
    public void setPassword(String pass) {
        this.password = pass;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.password = "abcd"; // ACCESSIBILE IN SAME CLASS ONLY
    }
}
