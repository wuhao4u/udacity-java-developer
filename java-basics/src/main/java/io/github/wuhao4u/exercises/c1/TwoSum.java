package io.github.wuhao4u.exercises.c1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //    Given an integer array, return true if two numbers in this array can be summed to target.
//    Example1: input[1, 2, 3, 4], target:5, return true
//    Example2: input[1,4,5,1,6], target 12, return false
    public static boolean twoSum(int[] nums, int target) {
        if (nums == null) {
            return false;
        }

        Map<Integer, Integer> valToInx = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            valToInx.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; ++j) {
            int remaining = target - nums[j];
            if (valToInx.containsKey(remaining) && valToInx.get(remaining) != j) {
                return true;
            }
        }

        return false;
    }
}
