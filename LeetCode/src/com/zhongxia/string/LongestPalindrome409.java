package com.zhongxia.string;
/*
����:
"abccccdd"
���:
7
 */
public class LongestPalindrome409 {
    public static int longestPalindrome(String s) {
        int max=0;
        int flag=0;//�Ƿ������ĵ�
        int [] map=new int[128];//�ַ���ϣ
        //a��AsciiΪ97��map[97]=1;
        for( char ch:s.toCharArray())
        {
            map[ch]++;//�������������±�ʵ���ַ���ϣ��ͳ���ַ�����
        }
        for(int i=0;i<128;i++)
        {
            if(map[i]%2==0)//�ַ�Ϊż���������ʹ���ڻ��Ĵ���
                max+=map[i];
            else {
                max += map[i] - 1;//��Ϊ��������һ��������ʹ��
                flag = 1;//���Ĵ������ĵ�
            }
        }
        return max+flag;
    }

    public static void main(String[] args) {
String s="bb";
System.out.println(longestPalindrome(s));
    }
}
