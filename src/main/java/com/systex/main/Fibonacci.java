package com.systex.main;

public class Fibonacci {
    public static void main(String[] args) {
        int firstTerm = 0, secondTerm = 1;
        int nextTerm = 1;
        while (nextTerm <= 1000) {
            System.out.print(firstTerm + ", ");
            // compute the next term
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(firstTerm);
    }
}
