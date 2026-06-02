package com.leepans.code.string;

import java.util.*;

/**
 * @Author Victor
 * @Date 2026-06-01 8:18 p.m.
 */

public class A_GroupAnagrams_49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char [] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return map.values().stream().toList();
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        String strs[] = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);
        for (int i = 0; i < result.size(); i++) {
            List<String> subStrs = result.get(i);
            String [] subs = new String[subStrs.size()];
            for (int j = 0; j < subStrs.size(); j++) {
                subs[j] = subStrs.get(j);
            }
            System.out.println(Arrays.toString(subs));
            System.out.println("=========");
        }
    }
}
