package org.litt.amicableNumbersPU;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int calculate(int n) {
        Map<Integer,Boolean> integerBooleanMap = new HashMap<>();

        for (int i = 1; i < n; i++) {
            integerBooleanMap.put(i, null);
        }

        return sumOfAmicable(checkAmicable(integerBooleanMap, n), n);
    }

    private static Map<Integer,Boolean> checkAmicable(Map<Integer,Boolean> map, int n) {
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (n % entry.getKey() != 0) {
                map.replace(entry.getKey(), false);
            } else if (isAmicable(entry.getKey())){
                map.replace(entry.getKey(), true);
            } else {
                map.replace(entry.getKey(), false);
            }
        }
        return map;
    }

    private static int sumOfAmicable(Map<Integer,Boolean> map, int n) {
        int sum = 0;

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                sum += entry.getKey();
            }
        }

        return sum;
    }

    private static Boolean isAmicable(int val) {
        int firstSum = 0, secondSum = 0;

        for (int i = 1; i < val; i++) {
            if (val % i == 0) {
                firstSum += i;
            }
        }

        for (int i = 1; i < firstSum; i++) {
            if (firstSum % i == 0) {
                secondSum += i;
            }
        }

        return firstSum == secondSum;
    }

    public static void main(String[] args) {
        System.out.println("The final sum for 220 is: " + calculate(220));
        System.out.println("The final sum for 284 is: " + calculate(284));
        System.out.println("The final sum for 10000 is: " + calculate(10000));
        System.out.println("The final sum for 14211 is: " + calculate(14211));
        System.out.println("The final sum for 6329 is: " + calculate(6329));
    }

}
