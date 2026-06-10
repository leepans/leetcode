package com.leepans.code75;

import java.util.Arrays;

/**
 * @Author Victor
 * @Date 2026-06-10 4:34 p.m.
 */

public class Solution14 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int val = 0;
            for (int j = i; j < k + i; j++) {
                val = val + nums[j];
            }
            sum = Math.max(sum, val);
        }
        double result = (double) sum / k;
        return result;
    }

    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        int nums[] = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(solution14.findMaxAverage(nums, k));
    }
}
