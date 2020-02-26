package com.zhongxia.string;
/*
1.     1
2.     11
3.     21
4.     1211
5.     111221
1?被读作??"one 1"??("一个一") , 即?11。
11 被读作?"two 1s"?("两个一"）, 即?21。
21 被读作?"one 2", ?"one 1"?（"一个二"?,??"一个一")?, 即?1211。
*/
public class CountAndSay38 {
    public static String countAndSay(int n) {
        n=n-1;
        String str = "1";
        //用while循环比双重时间多
        //建议这种for(int i=2;i<n;i++)
        while (n-->0){
            StringBuilder builder = new StringBuilder();
            //先保存第一个然后再去比这种思想
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
