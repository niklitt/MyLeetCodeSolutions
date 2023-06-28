package org.litt.threeSum;

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
        return finalList;
    }
}
