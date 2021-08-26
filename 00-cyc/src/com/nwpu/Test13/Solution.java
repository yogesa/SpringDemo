package com.nwpu.Test13;

import java.util.ArrayList;
/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，返回两个数的乘积最小的，如果无法找出这样的数字，返回一个空数组即可。
 */
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array.length == 0 )
            return list;
        int min = Integer.MAX_VALUE;
        int j;
        for (int i = 0; i < array.length ; i++) {
            //i从0到sum-arr
            for(j = i+1;j<array.length;j++)
                if(array[i] == sum - array[j])
                    if( min > array[i] * array[j])
                    {
                        list.clear();;
                        min = array[i] * array[j];
                        list.add(array[i]);
                        list.add(array[j]);
                    }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,14,15};
        System.out.println(new Solution().FindNumbersWithSum(arr, 15));
    }
}
