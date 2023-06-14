package org.litt.zigzagConversion;

public class Solution {

    public static String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int currRow = 0; currRow < numRows; currRow++) {
            for (int i = currRow; i < chars.length; i = doMath(i, numRows, currRow)) {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }

    private static int doMath(int iteration, int numRows, int currRow) {
        if(numRows <= 2) {
            return iteration + numRows;
        } else {
            int howCloseToEdge = Math.max(0, currRow % (numRows/2 + 1));
            System.out.println("how close to edge: " + howCloseToEdge);
            return iteration + numRows + (numRows - currRow - 2);
        }

    }

}
