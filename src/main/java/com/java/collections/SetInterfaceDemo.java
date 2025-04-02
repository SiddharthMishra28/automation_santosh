package com.java.collections;

import java.util.*;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        // Set<DATA_TYPE> variable_name = new HashSet<>(); or new TreeSet<>(); depending on your usage
        Set<String> students = new TreeSet<>(); // TreeSet has default alphabetical sorting order whereas HashSet doesn't
//        List<String> students = new ArrayList<>();
        students.add("santosh");
        students.add("sid");
        students.add("bhabani");
        System.out.println(students);
        students.add("sid");
        students.add("santosh");
        System.out.println(students);
    }
}
