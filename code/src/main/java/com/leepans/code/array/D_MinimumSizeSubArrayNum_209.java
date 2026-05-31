package com.leepans.code.array;

/**
 * @Author Victor
 * @Date 2026-05-31 5:09 p.m.
 */

public class D_MinimumSizeSubArrayNum_209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        int nums[] = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println("Output: " + minSubArrayLen(target, nums));

        nums = new int[]{1, 4, 4};
        target = 4;
        System.out.println("Output: " + minSubArrayLen(target, nums));

        nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        target = 11;
        System.out.println("Output: " + minSubArrayLen(target, nums));
    }
}
