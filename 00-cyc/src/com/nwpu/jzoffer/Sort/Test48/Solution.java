package com.nwpu.jzoffer.Sort.Test48;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: ch
 * @Description: JZ 32
 * @Date: Created in 21:45 2021/9/16
 * @Modified By:
 */
public class Solution {
    public String PrintMinNumber(int [] numbers) {
        int numLen = numbers.length;
        String[] nums = new String[numLen];
        for (int i = 0; i < numLen; i++) {
            nums[i] = numbers[i] + "";
        }
        Arrays.sort(nums,(s1,s2)->
            (s1+s2).compareTo(s2+s1)
        );
        String resultStr = new String() ;
        for (String str : nums){
            resultStr +=str;
        }
        return  resultStr;
    }
}
