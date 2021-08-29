package com.nwpu.Array.test14;

import java.util.ArrayList;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 19:06 2021/8/28
 * @Modified By:
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> Lists = new ArrayList<>();
        int cur = 0;
        for(int i = 1 , j = 2 ; i < j ; ){
            cur = ( i + j )* ( j - i + 1) / 2 ;
            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for(int t1 = i , t2 = j ; t1 <= t2 ; t1++ ){
                    list.add(t1);
                }
                Lists.add(list);
                j++;
            }else if( cur < sum){
                j++;
            }else {
                i++;
            }
        }
        return Lists;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().FindContinuousSequence(9));

    }
}
