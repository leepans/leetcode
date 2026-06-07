package com.leepans.code75;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Victor
 * @Date 2026-06-07 4:09 p.m.
 */

public class Solution3 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList();

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= getMaxNum(candies)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    private int getMaxNum(int[] candies) {
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        return max;
    }
}
