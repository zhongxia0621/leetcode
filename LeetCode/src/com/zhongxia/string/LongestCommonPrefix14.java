package com.zhongxia.string;
/*
输入: ["flower","flow","flight"]
输出: "fl"
输入: ["dog","racecar","car"]
输出: ""
*/
public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            //用第一个来卡情况
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                //
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
}

    public static void main(String[] args) {
        String[] strs={"abc","b"};
System.out.println(longestCommonPrefix(strs));
    }
}
