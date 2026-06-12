package com.leepans.code75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Victor
 * @Date 2026-06-12 6:44 p.m.
 */

public class Solution22 {
    public boolean closeStrings(String word1, String word2) {

        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();

        int arr1[] = new int[26];
        int arr2[] = new int[26];

        int i = 0;
        int j = 0;

        char[] cs1 = word1.toCharArray();
        char[] cs2 = word2.toCharArray();

        for (char c1 : cs1) {
            if (map1.containsKey(c1)) {
                map1.put(c1, map1.get(c1) + 1);
            } else {
                map1.put(c1, 1);
            }
        }

        for (char c2 : cs2) {
            if (map2.containsKey(c2)) {
                map2.put(c2, map2.get(c2) + 1);
            } else {
                map2.put(c2, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            arr1[i] = entry.getValue();
            i++;
        }
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            arr2[j] = entry.getValue();
            j++;
        }

        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int k = 0; k < 26; k++) {
            if (arr1[k] != arr2[k]) {
                return false;
            }
        }
        return true;
    }
}
