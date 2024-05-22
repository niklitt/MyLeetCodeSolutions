package org.litt.xDigitFibonacciPU;

import java.math.BigInteger;

public class Solution {

    public static int calculate(int numOfDigits) {
        int index = 2;
        BigInteger oldValue = BigInteger.ONE, preValue = BigInteger.ONE, currValue = BigInteger.ONE;

        while(currValue.compareTo(BigInteger.valueOf(10).pow(numOfDigits - 1)) <= 0) {
            currValue = oldValue.add(preValue);
            oldValue = preValue;
            preValue = currValue;
            index++;
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println("The index of the first fibonacci number with 2 digits is: " + calculate(2));
        System.out.println("The index of the first fibonacci number with 3 digits is: " + calculate(3));
        System.out.println("The index of the first fibonacci number with 4 digits is: " + calculate(4));
//        System.out.println("The index of the first fibonacci number with 20 digits is: " + calculate(20));
//        System.out.println("The index of the first fibonacci number with 40 digits is: " + calculate(40));
        System.out.println("The index of the first fibonacci number with 1000 digits is: " + calculate(1000));
    }

}
