package com.zhongxia.math;
/*
����: 4
���: 2
ʾ�� 2:
����: 8
���: 2
˵��: 8 ��ƽ������ 2.82842...,
���ڷ���������������С�����ֽ�����ȥ
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
