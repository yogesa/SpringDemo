package com.nwpu.Array.Test12;

import java.util.ArrayList;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 *
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 * {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 *
 * 窗口大于数组长度的时候，返回空
 */
public class Solution {

    public ArrayList<Integer> maxInWindows(int [] num, int size) {
    ArrayList<Integer> list = new ArrayList<>();
    if(size == 0){
        return null;
    }
    int i = 0 , j = size-1;
    int max;
        for (i = 0; i < num.length-size+1; i++,j++) {
            max = Integer.MIN_VALUE;
            for (int m = i,n = j; m <= n; m++) {
                if(max < num[m]){
                    max = num[m];
                }
            }
            list.add(max);
        }
        return list;
    }
    public static void main(String[] args) {

        int[] num = {2,3,4,2,6,2,5,1};
        System.out.println(new Solution().maxInWindows(num, 4));
    }
}
