package org.litt.specialPythagoreanTripletPU;

public class Solution {

    // Does not work for infinite values of sumToHit
    public static double[] calculate(int sumToHit) {
        double[] values = new double[4];
        double a = 2, b = 3, c = 0;
        while (a + b + c != sumToHit) {
            for (int i = 3; i < a + 200; i++) {
                c = Math.sqrt(Math.pow(a, 2) + Math.pow(i, 2));
                if (a + i + c == sumToHit) {
                    b = i;
                    values[0] = a;
                    values[1] = b;
                    values[2] = c;
                    values[3] = a * b * c;
                    return values;
                }
            }
            a++;
            // Out of bounds so it won't loop indefinitely
            if (a > sumToHit) {
                return values;
            }
        }

        return values;
    }

    public static void main(String[] args) {
        double[] response = calculate(1000);
        System.out.println("The value to his is 1000, so the product is: " + (int) response[3]
                + ". The first value is: " + response[0] + ". The second value is " + response[1]
                + " and the third value is " + response[2]);
    }

}
