package org.litt.zigzagConversion;

import java.util.ArrayList;
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

    private static int doMath(int iteration, int numRows, int currRow, List<Boolean> largeLastIteration) {
        if(numRows <= 2) {
            return iteration + numRows;
        } else {
            int totalRows = numRows - 1;
            int howCloseToBottom = totalRows - currRow;
            if (largeLastIteration.get(largeLastIteration.size() - 1)) {
                // Last iteration was a "big" one so just normally add rows minus short distance
                System.out.println("how close to bottom: " + howCloseToBottom);
                largeLastIteration.add(false);
                System.out.println("iteration val: " + iteration);
                System.out.println("total curr val: " + (iteration + (numRows * 2)));
                System.out.println("iteration only: " + (numRows * 2));
                System.out.println();
                return iteration + (totalRows * 2) - (howCloseToBottom * 2);
            } else if (totalRows == currRow || totalRows - currRow == totalRows) {
                // Last iteration was a "big" one so just normally add rows minus short distance
                System.out.println("how close to bottom: " + howCloseToBottom);
                largeLastIteration.add(false);
                System.out.println("iteration val: " + iteration);
                System.out.println("total curr val: " + (iteration + (numRows * 2)));
                System.out.println("iteration only: " + (numRows * 2));
                System.out.println();
                return iteration + (totalRows * 2);
            }else {
                // Last iteration was a normal one so perform logic to get short distance value
                System.out.println("how close to bottom: " + howCloseToBottom);
                largeLastIteration.add(true);
                System.out.println("iteration val: " + iteration);
                System.out.println("total curr val: " + (iteration + (numRows * 2)));
                System.out.println("iteration only: " + (numRows * 2));
                System.out.println();
                return iteration + (howCloseToBottom * 2);
            }
        }

    }

}
