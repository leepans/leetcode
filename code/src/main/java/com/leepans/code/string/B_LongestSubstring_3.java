package com.leepans.code.string;

import java.util.HashSet;

/**
 * @Author Victor
 * @Date 2026-06-01 9:31 p.m.
 */

public class B_LongestSubstring_3 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        String s = "abcabcbb";
        System.out.println("Output: " + lengthOfLongestSubstring(s));
        s = "bbbbb";
        System.out.println("Output: " + lengthOfLongestSubstring(s));
        s = "pwwkew";
        System.out.println("Output: " + lengthOfLongestSubstring(s));
    }
}
