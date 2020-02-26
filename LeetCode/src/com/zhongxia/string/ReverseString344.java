package com.zhongxia.string;
/*
���룺["h","e","l","l","o"]
�����["o","l","l","e","h"]
ʾ�� 2��
���룺["H","a","n","n","a","h"]
�����["h","a","n","n","a","H"]
*/
public class ReverseString344 {
    public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<=j)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
}

    public static void main(String[] args) {
        char[] s1={'h','e','l','l','o'};
        char[] s2={'H','a','n','n','a','h'};
        reverseString(s1);
        reverseString(s2);
      System.out.println(s1);
        System.out.println(s2);
   }
}
