package com.leepans.code.map;

import java.util.*;

/**
 * @Author Victor
 * @Date 2026-06-20 3:41 p.m.
 */

public class B_Group_Anagram_49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String string = new String(charArray);
            if (map.containsKey(string)) {
                List<String> list = map.get(string);
                list.add(str);
                map.put(string, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(string, list);
            }
        }
        return map.values().stream().toList();
    }

    public static void main(String[] args) {
        System.out.println("==========Test==========");
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new B_Group_Anagram_49().groupAnagrams(strs));
    }
}
