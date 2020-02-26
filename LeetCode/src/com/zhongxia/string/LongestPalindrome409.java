package com.zhongxia.string;
/*
输入:
"abccccdd"
输出:
7
 */
public class LongestPalindrome409 {
    public static int longestPalindrome(String s) {
        int max=0;
        int flag=0;//是否有中心点
        int [] map=new int[128];//字符哈希
        //a的Ascii为97，map[97]=1;
        for( char ch:s.toCharArray())
        {
            map[ch]++;//利用整数数组下标实现字符哈希，统计字符个数
        }
        for(int i=0;i<128;i++)
        {
            if(map[i]%2==0)//字符为偶数则均可以使用在回文串里
                max+=map[i];
            else {
                max += map[i] - 1;//若为奇数则丢弃一个，其余使用
                flag = 1;//回文串有中心点
            }
        }
        return max+flag;
    }

    public static void main(String[] args) {
String s="bb";
System.out.println(longestPalindrome(s));
    }
}
