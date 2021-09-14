package com.nwpu.jzoffer.binarysearch.Test43;
import java.util.ArrayList;
/**
 * @Author: ch
 * @Description:
 * @Date: Created in 19:59 2021/9/14
 * @Modified By:
 */
public class Solution {
//    public int minNumberInRotateArray(int [] array) {
//        int min = array[0];
//        for(int i = 0;i < array.length; i++){
//            if(min > array[i]){
//                min = array[i];
//            }
//        }
//        return min;
//    }

    /**
     *  旋转数组，利用中间的值与最右边的值比较，来确定它的大概位置
     *  当中间的值比最右边的大，那么缩小寻找区间 left = mid + 1
     *  当中间的值比最右边小，那么缩小寻找区间，left = min
     *  当中间的值等于最右边的值，right--;
     *
     * @param array
     * @return
     */
     public int  minNumberInRotateArray(int[] array){
        if(array.length == 0)
            throw new RuntimeException("input error");
        if(array.length == 1)
            return array[0];
        int left = 0;
        int right = array.length-1;
        int mid = (left + right) / 2 ;
        while(left < right){
            if(array[mid] > array[right]){
                left = mid + 1;
            }else if(array[mid] < array[right]){
                right = mid;
            }else{
                right--;
            }
            mid = (left + right) / 2 ;
        }
        return array[mid];
    }
}
