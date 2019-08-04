package io.github.wuhao4u.exercises.c1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    // Example1: input[1, 2, 3, 4], target:5, return true
    // Example2: input[1,4,5,1,6], target 12, return false
    @Test
    void twoSum() {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 4, 5, 1, 6};

        assertTrue(TwoSum.twoSum(nums1, 5));
        assertFalse(TwoSum.twoSum(nums2, 12));
    }
}