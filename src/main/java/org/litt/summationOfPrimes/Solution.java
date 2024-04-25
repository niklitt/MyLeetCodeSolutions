package org.litt.summationOfPrimes;

public class Solution {

    public static long calculate(int belowThisValue) {
        long sum = 10L;

        for (int i = 7; i < belowThisValue; i++) {
            if (isPrime(i)) {
                System.out.println("The value is prime: " + i);
                sum += i;
            }
        }

        return sum;
    }

    private static Boolean isPrime(int value) {
        if (value % 10 == 1 || value % 10 == 3 || value % 10 == 7 || value % 10 == 9) {
            for (int i = 2; i < value; i++) {
                if (value % i == 0) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("The summation of primes for 2000000 is: " + calculate(2000000));
    }

}
