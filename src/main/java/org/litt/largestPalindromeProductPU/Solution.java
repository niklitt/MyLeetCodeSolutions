package org.litt.largestPalindromeProductPU;

public class Solution {

    public static int[] calculate() {
        int[] solution = new int[3];
        int product = 0;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 91; j--) {
                product = i * j;
                if (isPalindrome(product) && product > solution[2]) {
                    solution[0] = i;
                    solution[1] = j;
                    solution[2] = product;
                }
            }
        }

        return solution;
    }

    /**
     * Check if the product is a palindrome
     * @param product the product of the two ints from the calculate method
     * @return true if reverse equals forward, false if otherwise
     */
    private static Boolean isPalindrome(int product) {
        StringBuilder stringProduct = new StringBuilder();
        stringProduct.append(product);

//        if(stringProduct.toString().contentEquals(stringProduct.reverse().toString())) {
//            System.out.println("forward: " + stringProduct.toString());
//            System.out.println("reverse: " + stringProduct.reverse().toString());
//            return true;
//        }

        return stringProduct.toString().contentEquals(stringProduct.reverse().toString());
    }

    public static void main(String[] args) {
        int[] finalSolution = calculate();
        System.out.println("The first digit is: " + finalSolution[0]);
        System.out.println("The second digit is: " + finalSolution[1]);
        System.out.println("The answer is: " + finalSolution[2]);
    }

}
