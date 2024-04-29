package org.litt.longestCollatzSequence;

/**
 * TODO: with larger numbers, it runs into heap issues and needs to be split
 */
public class Solution {

    public static long[] calculate(int ceiling) {
        long[] result = new long[2];
        int currentCount = 0;
        long currentNum = 0;

        for (int i = ceiling; i > ceiling / 2; i--) {
            System.out.println("Onto the next i value: " + i);
            if (currentCount > result[0]) {
                result[0] = currentCount;
                result[1] = i + 1;
            }
            currentCount = 0;
            currentNum = i;
            while (currentNum != 1) {
                if (currentNum % 2 == 0) {
                    currentNum = currentNum / 2;
                    System.out.println("New currentNum is: " + currentNum);
                } else {
                    currentNum = (currentNum * 3) + 1;
                    System.out.println("New currentNum is: " + currentNum);
                }
                currentCount++;
            }
            System.gc();
        }
        return result;
    }

    public static void main(String[] args) {
        long[] thirteenResult = calculate(13);
        System.out.println("The number of terms for 13 is: " + thirteenResult[0] +
                " and the associated number is: " + thirteenResult[1]);

        long[] millionResult = calculate(1000000);
        System.out.println("The number of terms for 1000000 is: " + millionResult[0] +
                " and the associated number is: " + millionResult[1]);
    }

}
