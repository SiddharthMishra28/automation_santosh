package com.java.proceduralprogramming;

public class OperatorsDemo {
    // Assignment Operators - =
    int a = 10;
    // Comparison Operator - ==, >=, <=, <, > - Result is true or false
    int age = 19;
    boolean result = age > 18;
    // Mathematical Operator - +, - , *, /, % (modulus / Remainder)
    // Miles to Km
    // 1 mile = 1.6KM
    int distance_in_miles = 100;
    double distance_in_km = 1.6 * 100;
    // Shift Operators - >>, <<
    // Logical Operators - And (&&), OR (||), NOT (!)
//    if(age > 0 && age <=18) { - if both are true
//        System.out.println("Not elligible to vote!");
//    }
//    String day_of_week = "Saturday";
//    int day_number = 6;
//    if(day_of_week.equals("Saturday") || day_number == 5) {
//        System.out.println("True!!");
//    }

    public static void main(String[] args) {
        int day_of_week = 4;
        String day = "Saturday";
        if(day_of_week == 6 || day.equals("Friday")) { // EITHER CONDITION SHOULD BE TRUE FOR RESULT TO bE TRUE
            System.out.println("True");
        }

        int card_number = 12;
        String card_house = "Hearts";
        if(card_number > 11 && card_house.equals("Hearts")) {
            System.out.println("Win!");
        }

    }
}
