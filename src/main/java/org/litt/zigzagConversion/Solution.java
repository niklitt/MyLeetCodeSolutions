package org.litt.zigzagConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        List<Boolean> lastIteration = new ArrayList<>(List.of(false));
        for (int currRow = 0; currRow < numRows; currRow++) {
            for (int i = currRow; i < chars.length; i = doMath(i, numRows, currRow, lastIteration)) {
                stringBuilder.append(chars[i]);
            }
            lastIteration.add(false);
        }
        return stringBuilder.toString();
    }

    private static int doMath(int iteration, int numRows, int currRow, List<Boolean> lastIteration) {
        if(numRows <= 2) {
            return iteration + numRows;
        } else {
            int totalRows = numRows - 1;
            if (lastIteration.get(lastIteration.size() - 1) || totalRows == currRow || totalRows - currRow == totalRows) {
                // Last iteration was a "big" one so just normally add rows
                int howCloseToBottom = totalRows - currRow;
                System.out.println("how close to bottom: " + howCloseToBottom);
                lastIteration.add(false);
                System.out.println("iteration val: " + iteration);
                System.out.println("total curr val: " + (iteration + (numRows * 2)));
                System.out.println("iteration only: " + (numRows * 2));
                System.out.println();
                return iteration + (totalRows * 2);
            } else {
                // Last iteration was a normal one so perform logic to get next value
                int howCloseToBottom = totalRows - currRow;
                System.out.println("how close to bottom: " + howCloseToBottom);
                lastIteration.add(true);
                System.out.println("iteration val: " + iteration);
                System.out.println("total curr val: " + (iteration + (numRows * 2)));
                System.out.println("iteration only: " + (numRows * 2));
                System.out.println();
                return iteration + (howCloseToBottom * 2);
            }
        }

    }

}
