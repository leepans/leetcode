package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-09 5:05 p.m.
 */

public class Solution11 {
    public boolean isSubsequence(String s, String t) {

        int index = 0;
        if (s.length() < 1) {
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }

            if (index == s.length()) {
                return true;
            }
        }
        return false;
    }
}
