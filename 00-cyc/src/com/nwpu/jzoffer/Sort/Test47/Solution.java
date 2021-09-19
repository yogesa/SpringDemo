package com.nwpu.jzoffer.Sort.Test47;

import java.sql.Array;

/**
 * @Author: ch
 * @Description:
 * 排序，让奇数位于偶数的前面
 * @Date: Created in 21:35 2021/9/16
 * @Modified By:
 */
public class Solution {
    public int[] reOrderArray (int[] array) {
        int arrLen = array.length;
        int[] odd = new int[arrLen];
        int[] even = new int[arrLen];
        int m = 0, n = 0;
        for (int i = 0; i < arrLen; i++) {
            if(array[i] % 2 != 0){
                odd[m++] = array[i];
            } else {
                even[n++] = array[i];
            }
        }
        for( int i = 0 ; i < n ; i++) {
            odd[m++] = even[i];
        }
        return odd;
    }
}
