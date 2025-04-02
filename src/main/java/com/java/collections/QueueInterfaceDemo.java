package com.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {
        // Queue<DAT_TYPE> variable_name = new PriorityQueue<>();
        Queue<String> myQueue = new PriorityQueue<>();
        myQueue.add("santosh");
        myQueue.add("sid");
        myQueue.add("bhabani");
//        System.out.println(myQueue);
//        myQueue.poll(); // NO EXCEPTION THROWN ONLy RETRIEVES HEAD
//        System.out.println(myQueue); // LIFO - LAST IN FIRST OUT
//        myQueue.remove(); // THROWS EXCEPTION IN CASE OF EMPTY QUEUE OR RETRIEVAL ISSUES
//        String s = myQueue.peek(); // RETRIEVES HEAD BUT DOESN't REMOVE IT
//        System.out.println(s);
//        System.out.println(myQueue);
        myQueue.offer("New Value"); // THROWS EXCEPTION
        System.out.println(myQueue);
    }
}
