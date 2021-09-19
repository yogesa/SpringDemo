package com.nwpu.jzoffer.Greedy.Test41;

/**
 * @Author: ch
 * @Description:
 *  给出连续几天的股票价格，计算出获得的最大利润
 * @Date: Created in 20:11 2021/9/15
 * @Modified By:
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int sofarMin = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            sofarMin = Math.min(sofarMin, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - sofarMin);
        }
        return maxProfit;
    }
}
