package com.leepans.code.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Victor
 * @Date 2026-06-20 3:31 p.m.
 */

public class A_Valid_Anagram_242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : ss) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : tt) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        A_Valid_Anagram_242 aValidAnagram242 = new A_Valid_Anagram_242();
        System.out.println(aValidAnagram242.isAnagram("anagram", "nagaram"));
    }
}
