package com.zhongxia.dynamic;
/** 

* @author ���� : ����

* @version ����ʱ�䣺2020��2��1�� ����10:14:53 

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
