package com.leepans.code.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Author Victor
 * @Date 2026-06-02 6:13 p.m.
 */

public class G_TopKFrequentElement_347 {

    private int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            pq.offer(new int[]{num, freq});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = pq.poll()[0];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");

        G_TopKFrequentElement_347 solution = new G_TopKFrequentElement_347();

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] res = solution.topKFrequent(nums, k);

        System.out.println(Arrays.toString(res));
    }
}
