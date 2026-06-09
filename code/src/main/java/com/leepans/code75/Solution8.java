package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-08 9:16 p.m.
 */

public class Solution8 {
    public boolean increasingTriplet(int[] nums) {

        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= small) {
                small = n;
            } else if (n <= big) {
                big = n;
            } else {
                return true;
            }
        }
        return false;
    }
}
