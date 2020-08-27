package com.ywt.leetcode;

import java.util.Arrays;

public class Code1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Code1480 code1480 = new Code1480();
        int a[] = new int[]{1,2,3,4,5};
        int b[] = code1480.runningSum(a);
        System.out.println(Arrays.toString(b));
    }
}
