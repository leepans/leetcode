package com.leepans.code.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author Victor
 * @Date 2026-06-01 7:17 p.m.
 */

public class F_TwoNums_1 {

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int compensation = target - nums[i];
            if (map.containsKey(compensation) && map.get(compensation)!=i) {
                result[0] = i;
                result[1] = map.get(compensation);
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        int nums[] = {2,7,11,15};
        int target = 9;
        System.out.println("Output: " + Arrays.toString(twoSum(nums, target)));

        nums = new int[]{3, 2, 4};
        target = 6;
        System.out.println("Output: " + Arrays.toString(twoSum(nums,target)));

        nums = new int[]{3, 3};
        target = 6;
        System.out.println("Output: " + Arrays.toString(twoSum(nums,target)));
    }
}
