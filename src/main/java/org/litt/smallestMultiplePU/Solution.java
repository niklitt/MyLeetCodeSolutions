package org.litt.smallestMultiplePU;

public class Solution {

    public static int calculateSmallestMultiple(int multipleOf) {
        int result = 1;

        while(!isEvenMultipleOf(result, multipleOf)) {
            result++;
        }

        return result;
    }

    private static Boolean isEvenMultipleOf(int value, int multipleOf) {
        for (int i = 1; i <= multipleOf; i++) {
            if (value % i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The result is: " + calculateSmallestMultiple(20));
    }

}
