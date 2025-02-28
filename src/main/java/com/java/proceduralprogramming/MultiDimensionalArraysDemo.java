package com.java.proceduralprogramming;

public class MultiDimensionalArraysDemo {
    public static void main(String[] args) {
        // <data_type>[][] variable_name = new <data_type>[row_size][column_size];
        // <data_type>[][] variable_name = new <data_type>{
        // {1,2,4...},
        // {3,4,5,...}
        // }
//        String[][] students = new String[3][6];
//        students[0][0] = "name";
//        students[0][1] = "makrs";
//        students[0][2] = "rollNumber";
//        ..
//        ..
//        ONE ARRAY IN ANOTHER ARRAY
        String[][] students = new String[][]{
                {"name", "marks", "rollNumber", "email", "phone"},
//                0,0     0,1      0,2           0,3      0,4
                {"santosh", "80", "1", "santosh@gmail.com", "840328"},
//                1,0        1,1   1,2   1,3                  1,4
                {"sid", "80", "2", "sid@test.com", "38203"}
        };
//        System.out.println(students[0][1]);
        for(int i=0; i<students.length; i++){
           for(int j=0; j<students[i].length; j++) {
               System.out.println(students[i][j]);
           }
        }
    }
}
