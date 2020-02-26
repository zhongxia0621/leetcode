package com.zhongxia.math;

import java.util.Stack;

/*
示例 1:
输入: 121
输出: true
示例?2:
输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
*/
public class IsPalindrome9 {

/*
效率低
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
效率高
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
