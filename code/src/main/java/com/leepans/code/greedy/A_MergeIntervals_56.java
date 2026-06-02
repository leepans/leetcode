package com.leepans.code.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Victor
 * @Date 2026-06-02 5:34 p.m.
 */

public class A_MergeIntervals_56 {
    public int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            int[] next = intervals[i];

            if (next[0] <= current[1]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                result.add(current);
                current = next;
            }
        }
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        A_MergeIntervals_56 solution = new A_MergeIntervals_56();

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] merged = solution.merge(intervals);

        System.out.println("Merged Intervals：");

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
