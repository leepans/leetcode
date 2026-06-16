package com.leepans.code75;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Victor
 * @Date 2026-06-16 6:20 p.m.
 */

public class Solution28 {
    public String predictPartyVictory(String senate) {

        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();

        int n = senate.length();

        for (int i = 0; i < n; i++) {
            char c = senate.charAt(i);
            if (c == 'R') {
                qr.offer(i);
            } else {
                qd.offer(i);
            }
        }

        while (!qr.isEmpty() && !qd.isEmpty()) {
            int sR = qr.poll();
            int sD = qd.poll();
            if (sR < sD) {
                qr.offer(sR + n);
            } else {
                qd.offer(sD + n);
            }
        }
        return qr.isEmpty()
                ? "Dire"
                : "Radiant";
    }

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        String senate = "RDDRRD";
        System.out.println(solution28.predictPartyVictory(senate));
    }
}
