package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-11 3:53 p.m.
 */

public class Solution18 {
    public int largestAltitude(int[] gain) {
        int highest = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum = sum + gain[i];
            highest = Math.max(highest, sum);
        }
        return highest < 0 ? 0 : highest;
    }

    public static void main(String[] args) {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(new Solution18().largestAltitude(gain));
    }
}
