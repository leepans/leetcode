package com.leepans.code75;

import java.util.Stack;

/**
 * @Author Victor
 * @Date 2026-06-16 4:46 p.m.
 */

public class Solution26 {
    public String decodeString(String s) {

        char ss[] = s.toCharArray();
        Stack<StringBuilder> sStr = new Stack<>();
        Stack<Integer> sInt = new Stack<>();

        StringBuilder sb1 = new StringBuilder();
        int count = 0;

        for (char c : ss) {
            if (c == '[') {
                sStr.push(sb1);
                sInt.push(count);
                sb1 = new StringBuilder();
                count = 0;
            } else if (c == ']') {
                StringBuilder sb2 = sStr.pop();
                int n = sInt.pop();
                for (int j = 0; j < n; j++) {
                    sb2.append(sb1);
                }
                sb1 = sb2;

            } else if (isNum(c)) {
                count = 10 * count + (c - '0');
            } else {
                sb1.append(c);
            }
        }
        return sb1.toString();
    }

    private boolean isNum(char c) {
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution26 s = new Solution26();
        System.out.println(s.decodeString("3[a]2[bc]"));
    }
}
