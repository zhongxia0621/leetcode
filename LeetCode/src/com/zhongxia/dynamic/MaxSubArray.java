package com.zhongxia.dynamic;
/** 

* @author 作者 : 仲夏

* @version 创建时间：2020年2月1日 下午3:55:04 

*/
public class MaxSubArray {
	 public static int maxSubArray(int[] nums) {
	        
		 int[] dp=new int[nums.length+1];
		 dp[0]=nums[0];
		 int max=dp[0];
		 for(int i=1;i<nums.length;i++)
		 {
			dp[i]=Math.max(dp[i-1]+nums[i], nums[i]);
			if(max<dp[i])
				max=dp[i];
	    }
		 return max;
	 }

	public static void main(String[] args) {
		
int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
System.out.println(maxSubArray(nums));
	}

}
