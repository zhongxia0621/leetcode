package com.zhongxia.array;

import java.util.ArrayList;
import java.util.List;

/*
输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
public class Generate118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<List<Integer>>();
        //如果输入得数小于零那么就返回空集合
        if (numRows<=0) {
            return list;
        }
//这是表明集合list中装的还是一个集合
        list.add(new ArrayList<>());
//获得集合中的第一个元素（里面放的全是集合）也就是获得到的其实还是一个集合
        list.get(0).add(1);
//然后从集合的一个元素（也是集合）开始遍历
        for (int i = 1; i <numRows; i++) {
            //这是每一个元素后创建一个新的集合
            List<Integer> row=new ArrayList<>();
            //这是获得一个当前元素的上一个元素，也就是获得一个集合
            List<Integer> prevrow=list.get(i-1);
            //这是添加每行的第一个1
            row.add(1);
            //这个循环是控制每行添加一个1后应该还添加几个元素（对每行而言）
            for (int j = 1; j < i; j++) {
                //添加什么元素（添加的就是上一行当前位置和他前一个位置的和）
                row.add(prevrow.get(j)+prevrow.get(j-1));
            }
            //然后在添加每行最后一个元素1
            row.add(1);
            //然后把这个集合给添加到集合中去
            list.add(row);
        }
        return list;

    }



    public static void main(String[] args) {
int n=5;
System.out.println(generate(n));
    }
}
