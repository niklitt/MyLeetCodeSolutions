package org.litt.namesScoresPU;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Approach:
 * First read in file DONE
 * TODO: Parse input to get each name and add to List
 * Learn ASCII values (decide how to approach values of each letter, they are all in caps) DONE
 * TODO: Use Collections.sort() or create another sorting method for fun
 * Put each name into a char array and calculate (value * position) add that to total sum DONE
 * Return sum
 */
public class Solution {

    public static BigInteger calculate(String fileName) {
        BigInteger sum = BigInteger.valueOf(0);
        List<String> names = new ArrayList<>();

        // Read names from file and add them to "names" list
        try {
            File namesFile = new File(fileName);
            Scanner reader = new Scanner(namesFile);
            while (reader.hasNextLine()) {
                names.add(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (String name : names) {
            System.out.println("Current name: " + name);
        }

        char[] chars;
        int tempValue;
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.get(i).length(); j++) {
                System.out.println("The current letter is: " + names.get(i).charAt(j));
                System.out.println("And the value is: " + (int) names.get(i).charAt(j));
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("I want the value for the PU_Names.txt file: "
                + calculate("C:\\Users\\Litt\\Documents\\Programming\\java\\MyLeetCodeSolutions\\src\\main\\java\\org\\litt\\namesScoresPU\\PU_Names.txt"));
    }

}
