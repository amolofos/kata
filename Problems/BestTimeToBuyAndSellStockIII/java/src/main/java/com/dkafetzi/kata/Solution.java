package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public int maxProfitOn4O1(int[] prices) {
    	if (prices == null || prices.length < 2)
    		return 0;
    
    	int profit = 0;
    	for (int i = 0; i < prices.length; i++) {
    		int runningProfit = -prices[i];
        	for (int j = i; j < prices.length; j++) {
        		int tmpj = runningProfit;
        		runningProfit += prices[j];
            	for (int k = j; k < prices.length; k++) {
            		int tmpk = runningProfit;
            		runningProfit -= prices[k];
                	for (int l = k; l < prices.length; l++) {
                		int tmpl = runningProfit;
                		runningProfit += prices[l];
                		
                		if (runningProfit > profit)
                			profit = runningProfit;
                			
                		runningProfit = tmpl;
                	}
                	runningProfit = tmpk;
            	}
        		if (runningProfit > profit)
        			profit = runningProfit;
            	runningProfit = tmpj;
        	}
        	
    	}
    	
    	return profit;
    }
    
    public int maxProfitOn2On(int[] prices) {
    	if (prices == null || prices.length < 2)
    		return 0;
   
		  int[] oneSaleProfit = new int[prices.length];
		  int[] oneSaleDay = new int[prices.length];

		  oneSaleProfit[0] = 0;
    	  oneSaleDay[0] = 0;
		  for (int i = 1; i < prices.length; i++) {
		    int salePrice = prices[i];
		    for (int j = i - 1; j >= 0; j--) {
		      int buyPrice = prices[j];
		      int profit = salePrice - buyPrice;
		      if (profit > oneSaleProfit[i]) {
		    	  oneSaleProfit[i] = profit;
		    	  oneSaleDay[i] = j;
		      }      
		    }
		  }

		  int maxProfit[] = new int[prices.length];
		  maxProfit[0] = 0;
		  for (int i = 1; i < prices.length; i++) {
			  int maxFromOneSale = oneSaleProfit[i];
			  int dayFromOneSale = oneSaleDay[i];
			  maxProfit[i] = Math.max(maxProfit[i - 1], maxProfit[dayFromOneSale] + maxFromOneSale);
		  }
		  return maxProfit[prices.length - 1];
    }
 
	// See https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/discuss/39615/My-explanation-for-O(N)-solution!.
    public int maxProfitOnO1Fin(int[] prices) {
    	if (prices == null || prices.length < 2)
    		return 0;
   
		int sell1 = 0, sell2 = 0, buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
		for (int i = 0; i < prices.length; i++) {
			buy1 = Math.max(buy1, -prices[i]);
			sell1 = Math.max(sell1, buy1 + prices[i]);
			buy2 = Math.max(buy2, sell1 - prices[i]);
			sell2 = Math.max(sell2, buy2 + prices[i]);
		}
		return sell2;
    }

	/*
	 * See https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/discuss/39681/Generalized-DP-solution-in-Java.
	 *
	 * Idea is simple : Keep track of the minimum value till previous day and 
	 * check how much maximum profit can be obtained for current day.
     */
    public int maxProfitOnOnDP(int[] prices) {
    	if (prices == null || prices.length < 2)
    		return 0;
    	
    	int trans = 2;
    	int dp[][] = new int[trans + 1][prices.length];
	
		for(int i = 1; i <= trans; i++) {
			int min = Integer.MAX_VALUE;
			for(int j = 1; j < prices.length; j++) {
				min = Math.min(min, prices[j - 1] - dp[i - 1][j - 1]);
				dp[i][j] = Math.max(dp[i][j - 1], prices[j] - min);
			}
		}
		
		return dp[trans][prices.length - 1];
    }
}
