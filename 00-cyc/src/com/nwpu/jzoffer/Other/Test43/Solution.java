package com.nwpu.jzoffer.Other.Test43;

/**
 * @Author: ch
 * @Description:
 * @Date: Created in 20:40 2021/9/15
 * @Modified By:
 */
public class Solution {
    public double Power(double base, int exponent) {
        double result = 1;
        if( exponent > 0 ) {
            for(int i = 0; i < exponent; i++) {
                result = base * result;
            }
        }else if( exponent == 0) {
            return result;
        }else {
            for(int i = 0; i < (-exponent);i++) {
                result = (1/base) * result;
            }
        }
        return result;
    }
}
