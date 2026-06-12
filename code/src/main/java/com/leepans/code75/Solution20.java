package com.leepans.code75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author Victor
 * @Date 2026-06-12 6:09 p.m.
 */

public class Solution20 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> hs1 = new HashSet();
        HashSet<Integer> hs2 = new HashSet();

        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        List<List<Integer>> result = new ArrayList();
        for (int n1 : nums1) {
            hs1.add(n1);
        }

        for (int n2 : nums2) {
            hs2.add(n2);
        }

        for (int lg1 : hs1) {
            if (!hs2.contains(lg1)) {
                list1.add(lg1);
            }
        }
        result.add(list1);

        for (int lg2 : hs2) {
            if (!hs1.contains(lg2)) {
                list2.add(lg2);
            }
        }
        result.add(list2);
        return result;

    }
}
