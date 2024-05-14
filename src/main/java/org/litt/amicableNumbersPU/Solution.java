package org.litt.amicableNumbersPU;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int calculate(int n) {
        return sumOfAmicable(checkAmicable(n));
    }

    private static Map<Integer,Boolean> checkAmicable(int n) {
        Map<Integer,Boolean> map = new HashMap<>();

        for (int i = 1; i < n; i++) {
            map.put(i, null);
        }

        // Using these values to determine if amicable or not
        int firstSum = 0, secondSum = 0, currKey = 0;

        // Loop through each entry in map
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            currKey = entry.getKey();
            firstSum = 0;
            secondSum = 0;

            // Only do the check if value does not exist
            if (entry.getValue() == null) {

                for (int i = 1; i < currKey; i++) {
                    if (currKey % i == 0) {
                        firstSum += i;
                    }
                }

                for (int i = 1; i < firstSum; i++) {
                    if (firstSum % i == 0) {
                        secondSum += i;
                    }
                }

                if (currKey == secondSum && firstSum != secondSum) {
                    System.out.println("Current key being added is: " + currKey);
                    map.replace(currKey, true);
                } else {
                    map.replace(currKey, false);
                }

            }
        }
        return map;
    }

    private static int sumOfAmicable(Map<Integer,Boolean> map) {
        int sum = 0;

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                sum += entry.getKey();
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("The final sum for 220 is: " + calculate(220));
        System.out.println("The final sum for 284 is: " + calculate(284));
        System.out.println("The final sum for 10000 is: " + calculate(10000));
        System.out.println("The final sum for 14211 is: " + calculate(14211));
        System.out.println("The final sum for 6329 is: " + calculate(6329));
    }

}
