package com.java.proceduralprogramming;

public class SingleDimensionalArrayDemo {
    public static void main(String[] args) {
        // Stores more than one value
        // Homogeneous
        // syntax
        // <Data_type>[] <variable_name> = new <variable_name>[size];
        // int[] rollNumbers = new int[10]; - Total 10 elements will be saved
        String[] students = new String[10];
        // Arrays  always have Zero Based Index
        students[0] = "Santosh";
        students[1] = "Siddharth";
        students[2] = "Mohit";
//        students[3] = 100; - NOT PERMITTED!
        // <Data_type>[] <variable_name> = {1,2,3...};
        int[] rollNumbers = {1,2,3,4,5,6,7,8,9,10};
        //                   0 1 2 3 4...       9 - LAST INDEX SIZE-1
        for(int i=0; i<rollNumbers.length; i++) {
            System.out.println(rollNumbers[i]);
        }

        for(int j=0; j<students.length; j++) {
            System.out.println(students[j]);
        }

        int[] students_home_distance = {5, 10, 12, 11, 2, 4, 7};
        // average_distance = sum_of_values / number_of_values
//        int sum = students_home_distance[0] + students_home_distance[1]...
        int sum = 0;
        for(int k=0; k<students_home_distance.length; k++) {
            sum = sum + students_home_distance[k];
        }
        double average = ((double) sum / students_home_distance.length);
        System.out.println(average);
    }

}
