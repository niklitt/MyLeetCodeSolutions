package org.litt.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        finalList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        if (finalList.isEmpty()) {
            return finalList;
        }
        return checkForDupes(finalList);
    }

    private static List<List<Integer>> checkForDupes(List<List<Integer>> checkingList) {
        List<List<Integer>> noDupList = new ArrayList<>();
        noDupList.add(checkingList.get(checkingList.size() - 1));
        for (int i = 0; i < checkingList.size() - 1; i++) {
            for (int j = i + 1; j < checkingList.size(); j++) {
                if (checkingList.get(i).containsAll(checkingList.get(j)) && checkingList.get(j).containsAll(checkingList.get(i))) {
                    break;
                }
                if (j + 1 == checkingList.size()) {
                    noDupList.add(checkingList.get(i));
                }
            }
        }
        return noDupList;
    }
}

