package com.zhongxia.dynamic;
/*
����һ�����飬���ĵ� i ��Ԫ����һ֧�����Ĺ�Ʊ�ڵ� i ��ļ۸�
���һ���㷨�����������ܻ�ȡ��������������������?����?���ס�
ע��:?�㲻��ͬʱ�����ʽ��ף���������ٴι���ǰ���۵�֮ǰ�Ĺ�Ʊ����
ʾ��?1:
����: [3,3,5,0,3,10,,4]
���: 6
����: �ڵ� 4 �죨��Ʊ�۸� = 0����ʱ�����룬�ڵ� 6 �죨��Ʊ�۸� = 3����ʱ����������ʽ������ܻ������ = 3-0 = 3 ��
?    ����ڵ� 7 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 8 �� ����Ʊ�۸� = 4����ʱ����������ʽ������ܻ������ = 4-1 = 3 ��
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
