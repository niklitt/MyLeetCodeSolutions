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
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(2);

        // This will be used to minimize calculations as a temp value
        int currentValue = 0;

        while(fibonacci.get(fibonacci.size() - 1) < limit) {
            currentValue = (fibonacci.get(fibonacci.size() - 1)) + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(currentValue);
            if (currentValue % 2 == 0) {
                sum += currentValue;
            }
        }

        // TODO: Can be optimized by getting rid of list and just making two variables that get changed over and over
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(FOUR_MILLION));
    }
}
