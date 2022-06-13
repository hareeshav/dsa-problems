package com.dsa.string.leetcode;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
        System.out.println(new GroupAnagram().groupAnagrams(new String[]{"rat","tar","abc"}));
    }


    public List<List<String>> groupAnagrams(String[] input){
        if(input.length == 0){
            return null;
        }
        int[] count = new int[26];
        Map<String, List<String>> resultMap = new HashMap<>();
        for(String s: input){
            Arrays.fill(count, 0);
            for(Character c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!resultMap.containsKey(key)){
                resultMap.put(key, new ArrayList<>());
            }
                resultMap.get(key).add(s);
        }
        return new ArrayList<>(resultMap.values());
    }
}
