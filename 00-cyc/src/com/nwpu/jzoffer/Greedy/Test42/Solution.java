package com.nwpu.jzoffer.Greedy.Test42;

/**
 * @Author: ch
 * @Description:
 * 减绳子，使用动态规划，用dp数组保存之前重复的值，然后通过暴力算法，求出最大值
 * @Date: Created in 20:37 2021/9/15
 * @Modified By:
 */
public class Solution {
    public int cutRope(int target) {
        if ( target < 2 ){
            return 0;
        }
        if ( target == 2 ) {
            return 1;
        }
        if ( target == 3 ) {
            return 2;
        }
        int dp[] = new int[target+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        int max = 0;
        int val = 0;
        for ( int i = 4; i <= target; i++ ){
            for ( int j = 2 ; j <  i   ; j++){
                val = dp[j] * dp[i - j];
                if( val > max){
                    max = val;
                }
            }
            dp[i] = max;
        }
        return dp[target];
    }
}
