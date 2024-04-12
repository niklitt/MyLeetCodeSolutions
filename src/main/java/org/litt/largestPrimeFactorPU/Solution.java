package org.litt.largestPrimeFactorPU;

public class Solution {
    public static long calculate(long input) {
        long result = 0;

        for(int i = 2; i < Math.sqrt(input); i++) {
            if(input % i == 0) {
                result = i;
                System.out.println("The new max prime is: " + result);
                input = input / i;
                System.out.println("The new input is: " + input);
            }
        }

        if(input > result) {
            result = input;
            System.out.println("The new max prime is: " + result);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("The solution is: " + calculate(600851475143L));
    }
}
