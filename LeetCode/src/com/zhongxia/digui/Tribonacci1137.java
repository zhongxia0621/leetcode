package com.zhongxia.digui;
/*
T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
输入：n = 4
输出：4
解释：
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
 */
public class Tribonacci1137 {

    public static int tribonacci(int n) {
/*if(n==0)
    return 0;
if(n==1||n==2)
    return 1;
return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
超时
*/
        int i;
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int a = 0,b = 0,c = 1,d = 1;
        for(i = 2; i < n; i++) {
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }
        return d;
    }

    public static void main(String[] args) {
System.out.print(tribonacci(25));
    }
}
