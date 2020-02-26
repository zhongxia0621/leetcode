package com.zhongxia.dynamic;
/*
给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
设计一个算法来计算你所能获取的最大利润。你最多可以完成?两笔?交易。
注意:?你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
示例?1:
输入: [3,3,5,0,3,10,,4]
输出: 6
解释: 在第 4 天（股票价格 = 0）的时候买入，在第 6 天（股票价格 = 3）的时候卖出，这笔交易所能获得利润 = 3-0 = 3 。
?    随后，在第 7 天（股票价格 = 1）的时候买入，在第 8 天 （股票价格 = 4）的时候卖出，这笔交易所能获得利润 = 4-1 = 3 。
*/
public class MaxProfit123 {
    public static int maxProfit(int[] prices) {
        int max=0;
        int count=0;
        for(int i=0;i<prices.length-1;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[i]<prices[j]&&prices[j]-prices[i]>max)
                {
                    count++;
                    max=prices[j]-prices[i];
                }

            }

        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices= {1,2,3,4,5};
        System.out.println(maxProfit(prices));

    }
}
