package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-10 5:37 p.m.
 */

public class Solution15 {
    public int maxVowels(String s, int k) {
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int max = count;

        for (int right = k; right < s.length(); right++) {
            if (isVowel(s.charAt(right))) {
                count++;
            }
            if (isVowel(s.charAt(right - k))) {
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        String s = "abciiidef";
        int k = 3;
        System.out.println(solution15.maxVowels(s, k));
    }
}
