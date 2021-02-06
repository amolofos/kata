package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * See README.md for more information
 *   
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public int maxProfitOnePass(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
            	minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
            	maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }

    public int maxProfitBruteForce(int[] prices) {
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit)
                	maxProfit = profit;
            }
        }
        return maxProfit;
    }
}