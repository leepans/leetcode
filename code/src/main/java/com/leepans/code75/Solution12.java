package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-09 5:38 p.m.
 */

public class Solution12 {
    public int maxArea(int[] height) {

        int n = height.length;
        int left = 0;
        int right = n - 1;
        int max = 0;
        while (left < right) {
            int temp = Math.min(height[left], height[right]);
            max = Math.max(temp * (right - left), max);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
