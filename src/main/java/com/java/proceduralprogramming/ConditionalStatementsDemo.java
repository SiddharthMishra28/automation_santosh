package com.java.proceduralprogramming;

public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        // if(<CONDITION>) {
        // ....
        // ....
        // }
        // else {
        // ....
        // ...
        // }
//        int age = 16;
//        if(age > 18) {
//            System.out.println("Elligible to vote!");
//        }else  {
//            System.out.println("Not Elligble");
//        }

        // 0-250 - INR100
        // 250-500 - INR200
        // 500+ - INR300
//        int distance = 330;
//        if(distance > 0 && distance < 250) {
//            System.out.println("Travel Fare : 100");
//        }else if(distance > 250 && distance < 500) {
//            System.out.println("Travel Fare : 200");
//        }else {
//            System.out.println("Travel Fare 300");
//        }

        // country - india - voting age - 18
        //         - spain - voting age - 22
        //         - turkey - voting age - 23
        //         - SA     - voting age 25
        String country = "turkey";
        int age = 26;
        if(country == "India") {
            if(age > 18) {
                System.out.println("Elligible to vote in India");
            }else {
                System.out.println("Not Elligble to vote in India");
            }
        }else if(country == "spain") {
            if(age > 22) {
                System.out.println("Elligble to vote in Spain");
            }else {
                System.out.println("Not Elligible to vote in Spain");
            }
        }else if(country == "turkey") {
            if(age > 23) {
                System.out.println("Elligible to vote in Turkey");
            }else {
                System.out.println("Not Elligible to vote in Turkey");
            }
        }else if(country == "SA") {
            if(age > 25) {
                System.out.println("Elligible to vote in SA");
            }else {
                System.out.println("Not Elligible to vote in SA");
            }
        }
    }
}
