package com.zhongxia.math;

import java.util.Stack;

/*
ʾ�� 1:
����: 121
���: true
ʾ��?2:
����: -121
���: false
����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
*/
public class IsPalindrome9 {

/*
Ч�ʵ�
 */
    public static boolean isPalindrome(int x) {
        int i;
        String str=Integer.toString(x);
        Stack<Character> stack=new Stack<>();

         for(i=0;i<str.length()/2;i++)
         {
             stack.push(str.charAt(i));
         }
         if(str.length()%2!=0)
              i++;
         while(!stack.isEmpty())
         {
             if(str.charAt(i)==stack.peek())
             {
                 i++;
                 stack.pop();
             }else
             {
                 return false;
             }

         }
         if(stack.isEmpty())
         {
             return true;
         }
         return false;
}
/*
Ч�ʸ�
 */
    public boolean isPalindrome2(int x) {
        int ans=0;
        int sum=x;
        if(x<0)
            return false;
        while(x!=0){
            ans=ans*10+x%10;
            x=x/10;
        }
        if(ans==sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrome(10));
    }
}
