package com.zhongxia.math;

import java.util.HashSet;
import java.util.Set;

/*
ÊäÈë: 19
Êä³ö: true
½âÊÍ:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
public class IsHappy202 {
    public static int change(int n){
        int sum = 0;
        int num;
        while(n != 0){
            num = n%10;
            n /= 10;
            sum += num*num;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1){
            n = change(n);
            if(set.contains(n)) return false;
            set.add(n);
        }
        return true;
    }


    public static void main(String[] args) {
      System.out.print(isHappy(25));
    }
}
