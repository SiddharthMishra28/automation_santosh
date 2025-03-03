package com.java.proceduralprogramming;

import java.util.Scanner;

public class DynamicProgramExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("####### WELCOME TO EMPLOYEE MANAGEMENT PROGRAM #######");
        System.out.println("Enter Number of Employees to Save : ");
        int empCount = scanner.nextInt();
        scanner.nextLine();
        String[][] employeesData = new String[empCount+1][5];
        employeesData[0][0] = "id";
        employeesData[0][1] = "name";
        employeesData[0][2] = "email";
        employeesData[0][3] = "phone";
        employeesData[0][4] = "salary";
        for(int i=1; i<employeesData.length; i++){
            System.out.println("Enter Employee ID : ");
            employeesData[i][0] = scanner.nextLine();
            System.out.println("Enter Employee Name : ");
            employeesData[i][1] = scanner.nextLine();
            System.out.println("Enter Employee Email : ");
            employeesData[i][2] = scanner.nextLine();
            System.out.println("Enter Employee Phone : ");
            employeesData[i][3] = scanner.nextLine();
            System.out.println("Enter Employee Salary : ");
            employeesData[i][4] = scanner.nextLine();
        }
        System.out.println("Employee Data Storage Successful!");
        // 1. Read Employee Data
             // Enter Employee id :
             // Print Employee Details
        // 2. Calculate Average Salary
           // Use Loop and Calculate
        // 3. Search Employee Phone
           // Enter Employee ID
           // Print Phone for the Employee
    }
}
