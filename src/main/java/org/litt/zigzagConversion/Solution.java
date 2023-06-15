package org.litt.zigzagConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> lastIteration = new ArrayList<>(List.of(0));
        for (int currRow = 0; currRow < numRows; currRow++) {
            for (int i = currRow; i < chars.length; i = doMath(i, numRows, currRow, lastIteration)) {
                stringBuilder.append(chars[i]);
            }
            lastIteration.add(0);
        }
        return stringBuilder.toString();
    }

    private static int doMath(int iteration, int numRows, int currRow, List<Integer> lastIteration) {
        if(numRows <= 2) {
            return iteration + numRows;
        } else {
            if (lastIteration.get(lastIteration.size() - 1) != 0) {
//                lastIteration.add();
            } else {
                lastIteration.add(0);
            }
//            int howCloseToEdge = (int) Math.max(0, currRow % ( Math.ceil((double) numRows / 2) + 1));
            numRows = numRows - 1;
            int howCloseToEdge = (numRows - currRow) % (numRows - (numRows/2));
            System.out.println("how close to edge: " + howCloseToEdge);
//            return iteration + numRows + (numRows - currRow - 2);
            return iteration + numRows;
        }

    }

}
