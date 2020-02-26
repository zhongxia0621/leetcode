package com.zhongxia.string;

import java.util.*;

/*
ÊäÈë: ["eat", "tea", "tan", "ate", "nat", "bat"],
Êä³ö:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/
public class GroupAnagrams49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, String> map = new HashMap<>();
        List<List<String>> result=new ArrayList<List<String>>();
        String[] str=new String[strs.length];
        for (int i=0;i<strs.length;i++) {
            str[i] = strs[i];

        }

        for (int i=0;i<str.length;i++) {

            if (!map.containsKey(str[i])) {

            }
        }
            return result;
    }

    public static void main(String[] args) {
        String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
groupAnagrams(strs);
    }
}
