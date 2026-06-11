package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-11 4:18 p.m.
 */

public class Solution19 {
    public int pivotIndex(int[] nums) {
        int sumLeft[] = new int[nums.length];
        int sumLeftVal = 0;
        int sumRight[] = new int[nums.length];
        int sumRightVal = 0;

        for (int i = 0; i < nums.length; i++) {
            sumLeftVal = sumLeftVal + nums[i];
            sumLeft[i] = sumLeftVal;
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            sumRightVal = sumRightVal + nums[j];
            sumRight[j] = sumRightVal;
        }

        for (int i = 0; i < nums.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, -1};
        System.out.println(new Solution19().pivotIndex(nums));
    }
}
