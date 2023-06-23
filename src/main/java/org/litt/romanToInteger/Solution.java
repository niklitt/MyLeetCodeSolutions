package org.litt.romanToInteger;

public class Solution {
    public static int romanToInt(String s) {

        return 0;
    }

//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    private int singleRomanToInt(String s) {
        return switch (s) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };
    }

}
