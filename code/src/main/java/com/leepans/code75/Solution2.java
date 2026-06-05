package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-05 7:33 p.m.
 */

public class Solution2 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
