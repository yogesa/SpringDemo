package com.nwpu.jzoffer.binarysearch.Test44;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:43 2021/9/14
 * @Modified By:
 */
public class Solution {

//    public int GetNumberOfK(int [] array , int k) {
//        int len = array.length - 1;
//        if( len == 0){
//            return 0;
//        }
//        int k_count = 0;
//        for( int i = 0 ; i <= len ; i++){
//            if( array[i] == k){
//                k_count++;
//            }
//        }
//        return k_count;
//    }
    public int GetNumberOfK(int [] array , int k) {
        if( array.length == 0){
            return 0;
        }
        //a 比 k 稍微大一点
        int a = GetNumberOfK(array ,  k + 0.5);
        int b = GetNumberOfK(array ,  k - 0.5);
        //b 比 k 稍微小一点
        return  a - b ;
    }
    public int GetNumberOfK(int [] array , double k){
        int left = 0;
        int right = array.length;
        int mid = ( left + right ) / 2 ;
        while( left < right ){
            //若 mid 位置的值 ， 大于 k
            if ( array[mid] > k ){
                right = mid ;
            }else {
                left  = mid + 1;
            }
            mid = ( left + right ) / 2;
        }
        return  mid;
    }
}
