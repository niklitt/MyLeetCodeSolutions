package org.litt.twoSum;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int inc = i+1; inc < nums.length; inc++) {
                if(nums[i] + nums[inc] == target) {
                    return new int[]{i, inc};
                }
            }
        }
        return null;
    }

}
