package com.java.proceduralprogramming;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        // do {
        // ....
        // ...
        //}while(<CONDIITION>); - WILL EXECUTE ONCE EVEN IF CONDITION IS FALSE
        int i = 103;
        do {
            System.out.println("Value of i : "+i);
            i--;
        }while(i>101);
    }
}
