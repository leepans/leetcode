package com.leepans.code75;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Victor
 * @Date 2026-06-16 5:40 p.m.
 */

public class Solution27 {

    Queue<Integer> q;

    public Solution27() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.offer(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }

    public static void main(String[] args) {
        Solution27 s = new Solution27();
        System.out.println(s.ping(1));
    }
}
