package com.leepans.code75;

/**
 * @Author Victor
 * @Date 2026-06-08 10:08 p.m.
 */

public class Solution9 {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        char temp = chars[0];
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(c==temp){
                index++;
                if (i==chars.length-1){
                    if(index==1){
                        sb.append(temp);
                    }else{
                        sb.append(temp).append(index+"");
                    }
                    index = 1;
                    temp = c;
                }
            }else{
                if(index==1){
                    sb.append(temp);
                }else{
                    sb.append(temp).append(index+"");
                }
                index = 1;
                temp = c;
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }

    public static void main(String[] args) {
        Solution9 s = new Solution9();
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(s.compress(chars));
    }
}
