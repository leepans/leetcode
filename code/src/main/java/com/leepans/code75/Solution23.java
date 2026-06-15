package com.leepans.code75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Victor
 * @Date 2026-06-15 4:43 p.m.
 */

public class Solution23 {
    public int equalPairs(int[][] grid) {

        int n = grid.length;

        List<String> row = new ArrayList();
        List<String> colum = new ArrayList();
        String sb1 = "";
        String sb2 = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb1 = sb1 + grid[i][j]+",";
                sb2 = sb2 + grid[j][i]+",";
            }
            row.add(sb1);
            colum.add(sb2);
            sb1 = "";
            sb2 = "";
        }
        int count = 0;
        for(String s: row){
            for (String s1: colum){
                if (s.equals(s1)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        int[][] grid = {{11,1}, {1,11}};
        System.out.println(new Solution23().equalPairs(grid));
    }
}
