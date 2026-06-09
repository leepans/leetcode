package com.leepans.code75;

import java.util.Arrays;

/**
 * @Author Victor
 * @Date 2026-06-09 6:02 p.m.
 */

public class Solution13 {
    public int maxOperations(int[] nums, int k) {
        int operations = 0;
        int i = 0;
        int j = nums.length - 1;
        Arrays.sort(nums);
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                operations++;
                i++;
                j--;
            } else if (nums[i] + nums[j] > k) {
                j--;
            } else {
                i++;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        int nums[] = new int[]{3, 1, 3, 4, 3};
        int k = 6;
        System.out.println(solution13.maxOperations(nums, k));
    }
}
