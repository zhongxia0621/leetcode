package com.zhongxia.dynamic;
/** 

* @author 作者 : 仲夏

* @version 创建时间：2020年2月1日 下午10:14:53 

*/
public class MaxProfit122 {
public static int maxProfit(int[] prices) {
	int max=0;
        	for(int i=0;i<prices.length-1;i++)
        	{
        		if(prices[i]<prices[i+1])
        		{
        			max+=prices[i+1]-prices[i];
        		}
        	}
        	return max;
    }

	public static void main(String[] args) {
		int[] prices= {7,6,4,3,1};
		System.out.println(maxProfit(prices));

	}

}
