package com.zhongxia.array;
/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，
返回它将会被按顺序插入的位置。你可以假设数组中无重复元素。
输入: [1,3,5,6], 5
输出: 2
输入: [1,3,5,6], 2
输出: 1
*/
public class SearchInsert35 {
    public static int searchInsert(int[] nums, int target) {
int start=0;
int end=nums.length-1;
while(start<end)
{
    int mid=(start+end)/2;
    if(nums[mid]==target)
    {
        return mid;
    }
    else if (nums[mid]<target)
    {
        start=mid+1;
    }else if (nums[mid]>target)
    {
        end=mid-1;
    }
}
if(nums[start]>=target)
{
    return start;
}
return start+1;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }
}
