package org.litt.digitFifthPowersPU;

public class Solution {

    private static final int ONE_MILLION = 1000000;

    public static int calculate(int power) {
        int sum = 0;

        for (int i = 2; i < ONE_MILLION; i++) {
            if(i%2==0) { // TODO: complete if statement, last thing left to do.
                System.out.println("Acceptable value: " + i);
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of all the numbers that can be written as the sum of fourth powers of their digits is: " + calculate(4));
        System.out.println("The sum of all the numbers that can be written as the sum of fifth powers of their digits is: " + calculate(5));
    }

}
