package com.leepans.code75;

import java.util.Stack;

/**
 * @Author Victor
 * @Date 2026-06-15 6:49 p.m.
 */

public class Solution25 {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int num : asteroids) {

            boolean alive = true;

            while (alive &&
                    !stack.isEmpty() &&
                    stack.peek() > 0 &&
                    num < 0) {

                int temp = stack.peek();

                if (Math.abs(temp) < Math.abs(num)) {
                    stack.pop();
                } else if (Math.abs(temp) == Math.abs(num)) {
                    stack.pop();
                    alive = false;
                } else {
                    alive = false;
                }
            }

            if (alive) {
                stack.push(num);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        return result;
    }
}
