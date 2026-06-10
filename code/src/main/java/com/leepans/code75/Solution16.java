package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-10 6:14 p.m.
 */

public class Solution16 {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int max = 0;

        for(int right = 0; right < nums.length; right++){

            if(nums[right] == 0){
                zeros++;
            }

            while(zeros > k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        int nums[] = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(solution16.longestOnes(nums, k));
    }
}
