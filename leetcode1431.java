package com.ywt.leetcode;
import java.util.LinkedList;
import java.util.List;

public class Code1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if(max < candies[i])
                max = candies[i];
        }
        List<Boolean> list = new LinkedList<>();
        for (int num : candies) {
            if(num + extraCandies >= max)
                list.add(true);
            else
                list.add(false);
        }
        return  list;
    }
}
