package com.zhongxia.array;
/*
����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У�
���������ᱻ��˳������λ�á�����Լ������������ظ�Ԫ�ء�
����: [1,3,5,6], 5
���: 2
����: [1,3,5,6], 2
���: 1
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
