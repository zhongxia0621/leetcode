package com.zhongxia.math;

import java.util.ArrayList;
import java.util.List;

/*
����: 1
���: true
����: 20 = 1
ʾ�� 2:
����: 16
���: true
����: 24 = 16
 */
public class IsPowerOfTwo231 {
    public static boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
for(int i=0;i<30;i++)
{
    if(n==2<<i)
    {
        return true;
    }
}
     return false;
    }

    public static void main(String[] args) {

        System.out.print(isPowerOfTwo(0));
    }
}
