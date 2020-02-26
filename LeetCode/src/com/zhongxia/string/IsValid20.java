package com.zhongxia.string;

import java.util.Stack;

/*
输入: "()[]{}"
输出: true
示例 3:
输入: "(]"
输出: false
 */
public class IsValid20 {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='('||ch=='['||ch=='{')
            {
                stack.push(ch);
            }
            if(ch==')'&&stack.peek()=='(')
            {
                stack.pop();
            }
            if(ch==']'&&stack.peek()=='[')
            {
                stack.pop();
            }
            if(ch=='}'&&stack.peek()=='{')
            {
                stack.pop();
            }
        }
        if(s.isEmpty())
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(isValid(s));
    }
}
