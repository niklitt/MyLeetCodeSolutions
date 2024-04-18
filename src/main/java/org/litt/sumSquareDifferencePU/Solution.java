package org.litt.sumSquareDifferencePU;

public class Solution {

    public static int calculateSquareDifference(int ceiling) {
        double sumOfSquares = 0;
        double squareOfSum = 0;

        for (int i = 1; i <= ceiling; i++) {
            sumOfSquares += Math.pow(i, 2);
            squareOfSum += i;
        }

        squareOfSum = Math.pow(squareOfSum, 2);

        return (int) (squareOfSum - sumOfSquares);
    }

    public static void main(String[] args) {
        System.out.println("The final solution for the example problem is: " + calculateSquareDifference(10));
        System.out.println("The final solution for 100 is: " + calculateSquareDifference(100));
    }

}
