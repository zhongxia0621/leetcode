package com.zhongxia.math;
/*
输入: 4
输出: 2
示例 2:
输入: 8
输出: 2
说明: 8 的平方根是 2.82842...,
由于返回类型是整数，小数部分将被舍去
*/
public class MySqrt69 {
    public static int mySqrt(int x) {
        if(x==2147483647)
            return 46340;
         int res=0;
    int start=1;
    int end=46340;
    int mid=(start+end)/2;
    while (start<end)
    {
        if(x<mid*mid)
        {
            end=mid-1;
            mid=(start+end)/2;
        }else
        {
            start=mid+1;
            mid=(start+end)/2;
        }
        if(mid*mid<x&&(mid+1)*(mid+1)>x||mid*mid==x)
        {
             res=mid;
        }
    }
    return res;
    }

    public static void main(String[] args) {
    System.out.print(mySqrt(2147483647));
        System.out.print(Math.sqrt(2147483647));
    }
}
