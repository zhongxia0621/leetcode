package com.zhongxia.string;
/*
1.     1
2.     11
3.     21
4.     1211
5.     111221
1?������??"one 1"??("һ��һ") , ��?11��
11 ������?"two 1s"?("����һ"��, ��?21��
21 ������?"one 2", ?"one 1"?��"һ����"?,??"һ��һ")?, ��?1211��
*/
public class CountAndSay38 {
    public static String countAndSay(int n) {
        n=n-1;
        String str = "1";
        //��whileѭ����˫��ʱ���
        //��������for(int i=2;i<n;i++)
        while (n-->0){
            StringBuilder builder = new StringBuilder();
            //�ȱ����һ��Ȼ����ȥ������˼��
            char pre = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == pre) {
                    count++;
                } else {
                    builder.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            builder.append(count).append(pre);
            str = builder.toString();
        }

        return str;
}
public static void main(String[] args) {
System.out.println(countAndSay(4));
    }
}
