package org.litt.selfPowersPU;

import java.math.BigInteger;

public class Solution {

    public static String calculate(int lastNumber, int numDigits) {
        BigInteger sum = BigInteger.ZERO;

        for (int i = 1; i <= lastNumber; i++) {
            sum = sum.add(BigInteger.valueOf(i).pow(i));
        }

        char[] chars;
        chars = sum.toString().toCharArray();
        char[] lastX = new char[10];
        int counter = 0;
        for (int i = chars.length - 1; i > chars.length - numDigits - 1; i--) {
            lastX[counter] = chars[i];
            counter++;
        }

        StringBuilder sb = new StringBuilder(new String(lastX));

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(calculate(1000, 10));
    }

}
