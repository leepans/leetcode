package com.leepans.code75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @Author Victor
 * @Date 2026-06-12 6:31 p.m.
 */

public class Solution21 {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap();
        HashSet<Integer> hs = new HashSet();
        for (int n : arr) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            hs.add(val);
        }
        if (map.size() == hs.size()) {
            return true;
        }
        return false;
    }
}
