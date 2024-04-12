package org.litt.evenFibonacciSumPU;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for https://projecteuler.net/ #2
 */
public class Solution {

    private static final int FOUR_MILLION = 4000000;

    public static int calculate(int limit) {
        // initialize the final sum value and the fibonacci list. Starting sum as two because that will not be traversed over
        int sum = 2;

        // This will be used to minimize calculations as a temp value
        int currentValue = 0;
        int firstVal = 1;
        int secondVal = 2;

        // This approach resolves potential time complexity issues. You only really ever need two most recent values
        while(currentValue < limit) {
            currentValue = firstVal + secondVal;
            firstVal = secondVal;
            secondVal = currentValue;
            if (currentValue % 2 == 0) {
                sum += currentValue;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(FOUR_MILLION));
    }
}
