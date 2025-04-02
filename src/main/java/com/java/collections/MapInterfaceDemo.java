package com.java.collections;

import java.util.HashMap;
import java.util.Map; // ALL COLLECTION INTERFACES ARE PART OG JAVA.UTIL

public class MapInterfaceDemo {
    public static void main(String[] args) {
        // Map<Integer, String> variable_name = new HashMap<>();
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "Santosh");
        employees.put(2, "sid");
        employees.put(3, "bhabani");
        System.out.println(employees);
        System.out.println(employees.get(2));
    }
}
