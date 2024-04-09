package org.litt.multiplesOfThreeOrFivePU;

/**
 * Solution for https://projecteuler.net/ #1
 */
public class Solution {

    public static int calculateSolution(int ceiling) {
        int solution = 0;
        for(int i = 0; i < ceiling; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                solution += i;
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        System.out.println(calculateSolution(1000));
    }
}
