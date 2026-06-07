package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-07 5:28 p.m.
 */

public class Solution6 {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        String str[] = s.trim().split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i].trim().length() != 0) {
                System.out.println(str[i]);
                if (i != 0) {
                    sb.append(str[i] + " ");
                } else {
                    sb.append(str[i]);
                }
            }
        }
        return sb.toString();
    }
}
