package com.java.proceduralprogramming;

public class PrintFormatDemo {
    public static void main(String[] args) {
        String lastLine = String.format("Final Date of Payment is %dth of every month", 12);
        String name = "Santosh";
        System.out.println(String.format("Hello mr %s", name));
        System.out.println(lastLine);
    }
}
