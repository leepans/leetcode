package com.leepans.code75;

import java.util.Stack;

/**
 * @Author Victor
 * @Date 2026-06-15 5:56 p.m.
 */

public class Solution24 {
    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder();
        String result = "";
        Stack<Character> stack = new Stack();
        char ss[] = s.toCharArray();
        for (char c : ss) {
            if (c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        for (int i = sb.length() - 1; i >= 0; i--) {
            result = result + sb.toString().charAt(i);
        }
        return result;
    }
}
