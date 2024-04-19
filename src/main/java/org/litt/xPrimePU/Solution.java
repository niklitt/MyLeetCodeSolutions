package org.litt.xPrimePU;

public class Solution {
    public static int findXPrime(int xPrime) {
        int counter = 6, currentNum = 14;

        while (counter < xPrime) {
            for (int i = 2; i <= currentNum; i++) {
                if(currentNum == i) {
                    currentNum++;
                    counter++;
                    break;
                }
                if(currentNum % i == 0) {
                    currentNum++;
                    break;
                }
            }
        }
        return currentNum - 1;
    }

    public static void main(String[] args) {
        System.out.println("The " + 10001 + " prime is: " + findXPrime(10001));
    }
}
