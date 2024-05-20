package org.litt.namesScoresPU;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;

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

        // Read names from file and add them to "names" list
        String preparsedNames = null;
        try {
            File namesFile = new File(fileName);
            Scanner reader = new Scanner(namesFile);
            preparsedNames = reader.nextLine();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Parsing process. Assumes specific formatting
        preparsedNames = preparsedNames.replace("\"", "");
        String[] names = preparsedNames.split(",");

        // Sorting
        Arrays.sort(names);

        for (String name : names) {
            System.out.println("Current name: " + name);
        }

        char[] chars;
        int tempValue;
        for (int i = 0; i < names.length; i++) {
            tempValue = 0;
            for (int j = 0; j < names[i].length(); j++) {
                // Had to look at ASCII Table to get this value
                tempValue += (names[i].charAt(j) - 64);
            }
            sum = sum.add(BigInteger.valueOf((long) tempValue * (i + 1)));
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("I want the value for the PU_Names.txt file: "
                + calculate("C:\\Users\\Litt\\Documents\\Programming\\java\\MyLeetCodeSolutions\\src\\main\\java\\org\\litt\\namesScoresPU\\PU_Names.txt"));
    }

}
