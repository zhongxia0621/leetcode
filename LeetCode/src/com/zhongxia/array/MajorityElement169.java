package com.zhongxia.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
   //暴力法
    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;

        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count ++;
                }
            }

            if (count > majorityCount) {
                return num;
            }

        }

        return -1;
    }
    //哈希表法
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }
//
    public static int majorityElement3(int[] nums) {

            int count = 0;
            Integer candidate = null;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                count += (num == candidate) ? 1 : -1;
            }

            return candidate;
        }


   public static void main(String[] args) {

        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement3(nums));
    }
}
