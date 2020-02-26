package com.zhongxia.string;

import java.util.HashMap;
import java.util.Map;

/*
ʾ��1:
����: pattern = "abba", str = "dog cat cat dog"
���: true
ʾ�� 2:
����:pattern = "abba", str = "dog cat cat fish"
���: false
ʾ�� 3:
����: pattern = "aaaa", str = "dog cat cat dog"
���: false
ʾ��?4:
����: pattern = "abba", str = "dog dog dog dog"
���: false
*/
public class WordPattern290 {
    public static boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" "); //�Կո�ָ�str
        if(s.length != pattern.length()) return false; //���û��ȫ���ɶԵ�ӳ���򷵻�false
        Map<Character, String> map = new HashMap<>(); //���ӳ��
        for(int i = 0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){ //1. û��ӳ��ʱִ��
                if(map.containsValue(s[i])) return false; //2. û��ӳ��������s[i]�ѱ�ʹ�ã���ƥ�䷵��false
                map.put(pattern.charAt(i), s[i]); //3. ����ӳ��
            }else{
                if(!map.get(pattern.charAt(i)).equals(s[i])) return false; //��ǰ�ַ�����ӳ�䲻ƥ��,����false
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String pattern="abba";
        String str="dog dog dog dog";
        System.out.println(wordPattern(pattern,str));
    }
}
