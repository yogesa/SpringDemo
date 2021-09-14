package com.nwpu.jzoffer.Array.Test13;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，返回两个数的乘积最小的，如果无法找出这样的数字，返回一个空数组即可。
 */
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if( array.length == 0 )
            return list;
        int i = 0 , j = array.length-1;
        int cur;
        while( i < j ){
            cur = array[i] + array[j];
            if( target == cur){
                return  new ArrayList<Integer>(Arrays.asList(array[i],array[j]));
            }
            if(target > cur){
                i++;
            }else {
                j--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8,14,15};
        System.out.println(new Solution().FindNumbersWithSum(arr, 16));
    }
}
