package org.litt.selfPowersPU;

import java.math.BigInteger;

public class Solution {

    public static double calculate(int lastNumber) {
        double sum = 0;//BigInteger.ZERO;

        for (int i = 1; i <= lastNumber; i++) {
            sum = Math.pow(i, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1000));
    }

}
