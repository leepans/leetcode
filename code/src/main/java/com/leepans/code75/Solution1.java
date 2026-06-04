package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-04 7:13 p.m.
 */

public class Solution1 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();

        int i = 0;
        int j = 0;

        if (str1.length < str2.length) {
            for (; i < str1.length; i++) {
                sb.append(str1[i]);
                sb.append(str2[i]);
                j++;
            }
            for (; j < str2.length; j++) {
                sb.append(str2[j]);
            }
        } else if (str1.length > str2.length) {
            for (; j < str2.length; j++) {
                sb.append(str1[j]);
                sb.append(str2[j]);
                i++;
            }
            for (; i < str1.length; i++) {
                sb.append(str1[i]);
            }
        } else {
            for (; i < str1.length; i++) {
                sb.append(str1[i]);
                sb.append(str2[i]);
            }
        }
        return sb.toString();
    }
}
