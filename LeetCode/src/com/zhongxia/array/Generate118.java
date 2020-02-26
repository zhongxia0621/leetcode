package com.zhongxia.array;

import java.util.ArrayList;
import java.util.List;

/*
����: 5
���:
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
        //����������С������ô�ͷ��ؿռ���
        if (numRows<=0) {
            return list;
        }
//���Ǳ�������list��װ�Ļ���һ������
        list.add(new ArrayList<>());
//��ü����еĵ�һ��Ԫ�أ�����ŵ�ȫ�Ǽ��ϣ�Ҳ���ǻ�õ�����ʵ����һ������
        list.get(0).add(1);
//Ȼ��Ӽ��ϵ�һ��Ԫ�أ�Ҳ�Ǽ��ϣ���ʼ����
        for (int i = 1; i <numRows; i++) {
            //����ÿһ��Ԫ�غ󴴽�һ���µļ���
            List<Integer> row=new ArrayList<>();
            //���ǻ��һ����ǰԪ�ص���һ��Ԫ�أ�Ҳ���ǻ��һ������
            List<Integer> prevrow=list.get(i-1);
            //�������ÿ�еĵ�һ��1
            row.add(1);
            //���ѭ���ǿ���ÿ�����һ��1��Ӧ�û���Ӽ���Ԫ�أ���ÿ�ж��ԣ�
            for (int j = 1; j < i; j++) {
                //���ʲôԪ�أ���ӵľ�����һ�е�ǰλ�ú���ǰһ��λ�õĺͣ�
                row.add(prevrow.get(j)+prevrow.get(j-1));
            }
            //Ȼ�������ÿ�����һ��Ԫ��1
            row.add(1);
            //Ȼ���������ϸ���ӵ�������ȥ
            list.add(row);
        }
        return list;

    }



    public static void main(String[] args) {
int n=5;
System.out.println(generate(n));
    }
}
