package com.zhongxia.array;
/*
给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
给定数组 nums = [1,1,2],
函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
你不需要考虑数组中超出新长度后面的元素。
给定 nums = [0,0,1,1,1,2,2,3,3,4],
函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
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
    //双指针法
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
