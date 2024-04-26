package org.litt.highlyDivisibleTriangularNumberPU;

import java.util.Scanner;

// TODO: Look into optimizing. Takes a long time with higher "divisors" value
public class Solution {

    public static long calculate(int divisors) {
        int currentDivisors = 0;
        long currentTriangleNumber = 1L;

        // First for loop used for incrementing the triangle number
        for (long i = 2; currentDivisors <= divisors; i++) {
            System.out.println("Current Divisors: " + currentDivisors);
            currentDivisors = 0;

            // Second for loop used for counting the divisors of the triangle number
            for (long j = 1; j <= currentTriangleNumber; j++) {
                if (currentTriangleNumber % j == 0) {
                    currentDivisors++;
                }
            }
            if (currentDivisors > divisors) {
                return currentTriangleNumber;
            }
            currentTriangleNumber += i;
            System.out.println("Current triangular number is: " + currentTriangleNumber);
        }

        return currentTriangleNumber;
    }

    public static void main(String[] args) {
        System.out.println("The value of the first triangle number to have over five divisors is: " + calculate(5));
        Scanner myObj = new Scanner(System.in);
        int val = myObj.nextInt();
        System.out.println("The value of the first triangle number to have over five hundred divisors is: " + calculate(val));
    }

}
