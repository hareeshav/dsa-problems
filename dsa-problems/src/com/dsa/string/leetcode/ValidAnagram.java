package com.dsa.string.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("rat","tar"));
        System.out.println(new ValidAnagram().isAnagramUsingMap("rat","tar"));
    }

    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] result = new int[26];
        for(int i=0; i<s.length(); i++){
            result[s.charAt(i)-'a']++;
            result[t.charAt(i)-'a']--;
        }
        for(int i=0; i<result.length;i++){
            if(result[i]!=0){
                return false;
            }
        }
        return true;
    }
    public boolean isAnagramUsingMap(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> resultMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            resultMap.put(s.charAt(i), resultMap.getOrDefault(s.charAt(i), 0)+1);
            resultMap.put(t.charAt(i), resultMap.getOrDefault(t.charAt(i), 0)-1);
        }
        for(Character c: resultMap.keySet()){
            if(resultMap.get(c)!=0){
                return false;
            }
        }
        return true;
    }
}
