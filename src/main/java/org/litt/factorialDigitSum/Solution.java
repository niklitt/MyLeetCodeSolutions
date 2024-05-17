package org.litt.factorialDigitSum;

import org.apache.commons.math3.util.MathUtils;

import java.math.BigInteger;

public class Solution {

    public static int calculate(int baseNum) {
        BigInteger factorial = calculateFactorial(baseNum);
        char[] chars = factorial.toString().toCharArray();
        int finalResult = 0;

        for (char c : chars) {
            finalResult += Character.getNumericValue(c);
        }

        return finalResult;
    }

    private static BigInteger calculateFactorial(int base) {
        BigInteger factorial = new BigInteger("1");

        for (int i = base; i >= 2; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);

        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("The end result of 100 is: " + calculate(100));
    }

}
