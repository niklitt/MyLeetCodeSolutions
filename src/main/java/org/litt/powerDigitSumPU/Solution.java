package org.litt.powerDigitSumPU;

import java.math.BigInteger;

public class Solution {

    public static int calculate(String powerInput) {
        String stringValue = String.valueOf(convertStringtoValue(powerInput));
        int result = 0;

        //TODO: loop through chars and add them
        for (char val : stringValue.toCharArray()) {
            result += Character.getNumericValue(val);
        }

        return result;
    }

    private static BigInteger convertStringtoValue(String valueToConvert) {
        char[] valueChars = valueToConvert.toCharArray();
        BigInteger prePower = new BigInteger("0");
        int postPower = 0;
        boolean hitCarrot = false;

        for (char valueChar : valueChars) {
            if (!hitCarrot && valueChar != '^') {
                prePower = prePower.multiply(BigInteger.valueOf(10));
                prePower = prePower.add(BigInteger.valueOf(Character.getNumericValue(valueChar)));
            } else if (valueChar == '^') {
                hitCarrot = true;
            } else {
                postPower = (postPower * 10) + Character.getNumericValue(valueChar);
            }
        }

        System.out.println("The prePower value is: " + prePower + " and the postPower value is: " + postPower);
        System.out.println("The result of the Math.pow is: " + prePower.pow(postPower));

        return prePower.pow(postPower);
    }

    public static void main(String[] args) {
        System.out.println("The solution for 2^1000 is: " + calculate("2^1000"));
    }

}
