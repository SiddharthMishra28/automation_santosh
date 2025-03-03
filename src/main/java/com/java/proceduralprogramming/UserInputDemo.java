package com.java.proceduralprogramming;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // INPUT READ
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+"!");
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age > 18) {
            System.out.println(name+" you are elligible for voting"); // CONCATENATION
        }else {
            System.out.println(name+" you are Not elligible for voting!");
        }
    }
}
