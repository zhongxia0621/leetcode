package com.zhongxia.array;
/*
输入: [1,2,3,4]
输出: [24,12,8,6]
 */
public class ProductExceptSelf238 {
    /*
    超时
     */
 public static int[] productExceptSelf(int[] nums) {
 int[] output=new int[nums.length];
 for(int i=0;i<output.length;i++)
 {
     output[i]=1;
}
 for(int i=0;i<output.length-1;i++)
     {
         output[0]*=nums[i+1];

     }
 for(int i=1;i<nums.length;i++)
{
int t=i;
    while(t!=0)
    {
        output[i]*=nums[t-1];
        t--;
}
  for(int j=i+1;j<nums.length;j++)
    {
     output[i]*=nums[j];

}
}
   return output;
}
    public static int[] productExceptSelf2(int[] nums) {
        int[] output=new int[nums.length];
        for(int i=0;i<output.length;i++)
        {
            output[i]=1;
        }
     for(int i=0;i<nums.length;i++)
        {
            int t=i;
            while(t!=0)
            {
                output[i]*=nums[t-1];
                t--;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                output[i]*=nums[j];
}
        }
        return output;
    }
    public int[] productExceptSelf3(int[] nums) {
        int[] res = new int[nums.length];
        int k = 1;
        for(int i = 0; i < res.length; i++){
            res[i] = k;
            k = k * nums[i]; // 此时数组存储的是除去当前元素左边的元素乘积
        }
        k = 1;
        for(int i = res.length - 1; i >= 0; i--){
            res[i] *= k; // k为该数右边的乘积。
            k *= nums[i]; // 此时数组等于左边的 * 该数右边的。
        }
        return res;
    }

    public static void main(String[] args) {
         int[] nums={2,3,5};
       int[] output=productExceptSelf2(nums);
for(int i=0;i<output.length;i++)
{
    System.out.println(output[i]);
}

    }
}
