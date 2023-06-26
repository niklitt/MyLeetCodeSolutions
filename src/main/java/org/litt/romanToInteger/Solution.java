package org.litt.romanToInteger;

public class Solution {
    public static int romanToInt(String s) {
        char[] romans = s.toCharArray();
        int value = 0;
        for (int i = 0; i < romans.length; i++) {
            if (i+1 == romans.length) {
                value += singleRomanToInt(romans[i]);
            } else if(singleRomanToInt(romans[i]) >= singleRomanToInt(romans[i+1])) {
                value += singleRomanToInt(romans[i]);
            } else {
                value += (singleRomanToInt(romans[i+1]) - singleRomanToInt(romans[i]));
                i++;
            }
        }
        return value;
    }

//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    private static int singleRomanToInt(char s) {
        return switch (s) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

}
