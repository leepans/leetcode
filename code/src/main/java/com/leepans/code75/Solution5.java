package com.leepans.code75;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Victor
 * @Date 2026-06-07 5:04 p.m.
 */

public class Solution5 {

    public String reverseVowels(String s) {

        char chars[] = s.toCharArray();
        List<String> strList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                strList.add(c + "");
            }
        }
        int listRight = strList.size() - 1;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                sb.append(strList.get(listRight));
                listRight--;
            } else {
                sb.append(c + "");
            }
        }
        return sb.toString();
    }
}
