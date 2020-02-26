package com.zhongxia.dynamic;
/** 

* @author 作者 : 仲夏

* @version 创建时间：2020年2月1日 下午2:44:33 
 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。
*/
public class Stair70 {
	public static int find(int n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		return find(n-1)+find(n-2);
	}
	public static int climbStairs(int n) {
       int[] dp=new int[1024];
       dp[1]=1;
       dp[2]=2;
       for(int i=3;i<=n;i++)
    	   dp[i]=dp[i-1]+dp[i-2];
       return dp[n];
    }
	public static void main(String[] args) {
		System.out.println(find(6));
		System.out.println(climbStairs(6));
	}

}
