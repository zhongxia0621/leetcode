package com.zhongxia.dynamic;
/** 

* @author ���� : ����

* @version ����ʱ�䣺2020��2��1�� ����2:44:33 
 ������������¥�ݡ���Ҫ n ������ܵ���¥����

ÿ��������� 1 �� 2 ��̨�ס����ж����ֲ�ͬ�ķ�����������¥���أ�

ע�⣺���� n ��һ����������
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
