package com.ywt.leetcode;

//数组异或操作
public class Code1486 {
    public int xorOperation(int n, int start) {
        int temp = start;
        for (int i = 1; i < n; i++) {
            temp += 2;
            start ^=  temp;
        }
        return start;
    }
}
