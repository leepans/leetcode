package com.leepans.code75;

import java.util.HashMap;

/**
 * @Author Victor
 * @Date 2026-06-11 3:26 p.m.
 */

public class Solution17 {
    public int longestSubarray(int[] nums) {

        int count = 0;
        int left = 0;
        int max = count;

        HashMap<Integer, Integer> map = new HashMap();
        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                map.put(right, nums[right]);
            }
            count++;

            while (map.size() > 1) {
                count--;
                map.remove(left);
                left++;
            }
            max = Math.max(max, count);
        }
        return max - 1;
    }

    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        int nums[] = {1, 1, 1};
        System.out.println(solution17.longestSubarray(nums));
    }
}
