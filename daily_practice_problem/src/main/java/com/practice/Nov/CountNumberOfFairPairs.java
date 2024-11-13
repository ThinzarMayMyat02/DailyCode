package com.practice.Nov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountNumberOfFairPairs {
    public static void main(String[] args) {
        int[] nums = {1,7,9,2,5};
        int lower = 3;
        int upper = 11;
        List<int[]> resultList = new ArrayList<>();
       
        for (int i =0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int sum = nums[i]+nums[j];
                int[] pair = new int[2];
                if (sum < upper && sum > lower) {
                    pair[0] = i;
                    pair[1] = j;
                }
                System.out.println("Pair : "+Arrays.toString(pair));
                resultList.add(pair);
            }
        }
        //resultList = resultList.retainAll()
        resultList.forEach(k->{System.out.println("Pair : "+Arrays.toString(k));});
    }
}


// Line 7: error: incompatible types: List<int[]> cannot be converted to long [in __Driver__.java]
//       long ret = new Solution().countFairPairs(param_1, param_2, param_3);
                                              