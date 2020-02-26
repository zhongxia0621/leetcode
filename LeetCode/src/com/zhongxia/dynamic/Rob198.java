package com.zhongxia.dynamic;

public class Rob198 {
	public static int job(int[] nums)
	{
		if(nums.length==0)
		{
			return 0;
		}
		if(nums.length==1)
		{
			return nums[0];
		}
		int[] dp=new int[1024];
		dp[0]=nums[0];
		dp[1]=Math.max(nums[1],nums[0]);
		
		for(int i=2;i<nums.length;i++)
		{
			
		dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
			
		}
		return dp[nums.length-1];
		
	}

	public static void main(String[] args) {
		int[] nums= {2,1,1,2};
		System.out.println(job(nums));

	}

}
