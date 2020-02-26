package com.zhongxia.dynamic;
/*
输入: [7,1,5,3,6,4]
输出: 5
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
*/
public class MaxProfit121 {
    public static int maxProfit(int[] prices) {
        int max=0;
   for(int i=0;i<prices.length-1;i++)
   {
       for(int j=i+1;j<prices.length;j++)
       {
         if(prices[i]<prices[j]&&prices[j]-prices[i]>max)
         {
             max=prices[j]-prices[i];
         }
       }

   }
         return max;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.print(maxProfit(prices));
    }
}
