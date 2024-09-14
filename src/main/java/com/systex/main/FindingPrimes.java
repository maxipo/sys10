package com.systex.main;

public class FindingPrimes {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i < 10000; i++) {
            boolean isPrime = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(j + ", ");
            }
        }
    }
}

