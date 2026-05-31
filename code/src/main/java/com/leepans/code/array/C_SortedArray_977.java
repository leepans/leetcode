package com.leepans.code.array;

import java.util.Arrays;

/**
 * @Author Victor
 * @Date 2026-05-31 3:54 p.m.
 */

public class C_SortedArray_977 {

    public static int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        int k = nums.length - 1;
        for (int i = 0, j = nums.length - 1; i <= j; ) {
            if (Math.pow(nums[i], 2) < Math.pow(nums[j], 2)) {
                result[k--] = (int) Math.pow(nums[j], 2);
                j--;
            } else {
                result[k--] = (int) Math.pow(nums[i], 2);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        int nums[] = {-4, -1, 0, 3, 10};
        System.out.println("Output: " + Arrays.toString(sortedSquares(nums)));

        nums = new int[]{-7, -3, 2, 3, 11};
        System.out.println("Output: " + Arrays.toString(sortedSquares(nums)));
    }
}
