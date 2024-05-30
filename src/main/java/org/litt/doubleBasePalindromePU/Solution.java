package org.litt.doubleBasePalindromePU;

public class Solution {

    public static int calculate(int cap) {
        int sum = 0;
        StringBuilder sb, base2sb;

        for(int i = 0; i < cap; i++) {
            sb = new StringBuilder(Integer.toString(i));
            base2sb = new StringBuilder(Integer.toBinaryString(i));
            if (sb.toString().contentEquals(sb.reverse()) && base2sb.toString().contentEquals(base2sb.reverse())) {
                System.out.println("The base 10 palindrome is: " + i);
                System.out.println("The base 2 palindrome is: " + Integer.toBinaryString(i));
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The sum of all nums under 1000000 who are base 10 and base 2 palindromes is: " + calculate(1000000));
//        System.out.println("The sum of all nums under 586 who are base 10 and base 2 palindromes is: " + calculate(586));
    }

}
