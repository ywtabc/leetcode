package com.ywt.leetcode;

import java.util.HashMap;
import java.util.Map;

//1512. 好数对的数目
public class Code1512 {
    /**
     * 暴力枚举
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * @param nums
     * @return
     */
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1 ; j < nums.length; j++) {
                if(nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }

    /**
     * 组合技术,使用hashmap计数
     * 时间复杂度：O(n)。
     * 空间复杂度：O(n)，即哈希表使用到的辅助空间的空间代价
     * @param nums
     * @return
     */
    public int numIdenticalPairs_1(int[] nums) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            count += (entry.getValue()*(entry.getValue()-1) / 2);
        }
        return count;
    }

    public static void main(String[] args) {
        Code1512 code1512 = new Code1512();
        int a[] = new int[]{1,1,1,1};
        System.out.println(code1512.numIdenticalPairs(a));
        System.out.println(code1512.numIdenticalPairs_1(a));
    }
}
