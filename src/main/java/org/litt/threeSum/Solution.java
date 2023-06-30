package org.litt.threeSum;

import org.apache.commons.collections.CollectionUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = i + 2; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println("value at i is: " + nums[i]);
                        System.out.println("value at j is: " + nums[j]);
                        System.out.println("value at k is: " + nums[k]);
                        finalList.add(Arrays.asList(nums[i],nums[j],nums[k]));
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
        noDupList.add(checkingList.get(0));
        for(int i = 1; i < checkingList.size(); i++) {
            boolean foundDup = false;
            for(int j = 0; j < i; j++) {
                if (checkingList.get(i).containsAll(checkingList.get(j))) {
                    System.out.println("found two lists with same elements " + checkingList.get(i) + "\n" +checkingList.get(j));
                    foundDup = true;
                }
                if (j + 1 == i && !foundDup) {
                    noDupList.add(checkingList.get(i));
                }
            }
        }
        return noDupList;
    }
}
