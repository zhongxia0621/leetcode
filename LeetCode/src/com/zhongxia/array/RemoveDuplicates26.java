package com.zhongxia.array;
/*
����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
�������� nums = [1,1,2],
����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2��
�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
���� nums = [0,0,1,1,1,2,2,3,3,4],
����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��
*/
public class RemoveDuplicates26 {
    public static int removeDuplicates(int[] nums) {
        int temp=nums[0];
        int count=1;
        for (int i=1;i<nums.length;i++)
        {
            if(temp!=nums[i])
            {
                count++;
                temp=nums[i];
            }

            nums[count-1]=temp;
        }
        return count;
    }
    //˫ָ�뷨
    public int removeDuplicates2(int[] nums) {
         if (nums.length == 0)
         {
             return 0;
         }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums={1,1,2};
        removeDuplicates(nums);
        for (int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
