package LeetCodeDay5;

import java.util.Arrays;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3287/
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 * 
 * Example 1:
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation:
 * Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * 
 * Example 2:
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation:
 * Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 * engaging multiple transactions at the same time. You must sell before buying again.
 * 
 * Example 3:
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation:
 *  In this case, no transaction is done, i.e. max profit = 0.
 * 
 */
public class LeetCodeDay5 {
	
	
	public static void main (String[] args) {
		LeetCodeDay5 solution = new LeetCodeDay5();

		
		int [] test1 = {7, 1, 5, 3, 6, 4};
    	System.out.println("Result: " + solution.maxProfit(test1));
    	System.out.println("Input:  [7, 1, 5, 3, 6, 4]");
    	System.out.println("Output: 7");
	
    	int [] test2 = {1, 2, 3, 4, 5};
    	System.out.println("Result: " + solution.maxProfit(test2));
    	System.out.println("Input:  [1, 2, 3, 4, 5]");
    	System.out.println("Output: 4");
    	
    	int [] test3 = {7, 6, 4, 3, 1};
    	System.out.println("Result: " + solution.maxProfit(test3));
    	System.out.println("Input:  [7, 6, 4, 3, 1]");
    	System.out.println("Output: 0");
    
    	int [] test4 = {6, 1, 3, 2, 4, 7};
    	System.out.println("Result: " + solution.maxProfit(test4));
    	System.out.println("Input:  [6, 1, 3, 2, 4, 7]");
    	System.out.println("Output: 7");
	}
	
    public int maxProfit(int[] prices) {
    	return maxProfitV2(prices);
    }
    
 
    public int maxProfitV2(int[] prices) {
    	return maxProfitV2sub(prices, 0);
    }
    
    public int maxProfitV2sub(int[] prices, int start) {
    	int maxProfit = 0;
        
        if (start >= prices.length) {
        	System.out.println("Start: " + start + ", empty array");
        	return maxProfit;
        }
        
        for (int startingIndex = start; startingIndex < prices.length; startingIndex++) {
        	System.out.println("startingIndex: " + startingIndex);
        	
    		for (int step = 1; startingIndex + step < prices.length; step++) {
            	System.out.println("pre: Start: " + start + 
            			", startingIndex: " + startingIndex + 
            			", step: " + step +
            			", runningProfit: null" +
            			", maxProfit: " + maxProfit
            	);
            	
    			int calcProfit = maxProfitV2sub(prices, startingIndex + step);
    			int runningProfit = -1 * prices[startingIndex] + prices[startingIndex + step] + -1 * calcProfit;
    			
            	System.out.println("post: Start: " + start + 
            			", startingIndex: " + startingIndex + 
            			", step: " + step +
            			", runningProfit: " + runningProfit +
            			", maxProfit: " + maxProfit
            	);
            	
    			if (runningProfit > maxProfit)
    				maxProfit = runningProfit;
    		}
        }
        
        return maxProfit;
    }
    
	
    public int maxProfitV1(int[] prices) {
        int maxProfit = 0;
        

        for (int startingIndex = 0; startingIndex < prices.length; startingIndex++) {


    		for (int priceIndex = startingIndex + 1; priceIndex < prices.length; priceIndex++) {

                int runningProfit = 0;
                int addOrSunstract = -1;
                
        		runningProfit += addOrSunstract * prices[startingIndex];
            	System.out.println("startingIndex: " + startingIndex + ", addOrSunstract: " + addOrSunstract + ", runningProfit: " + runningProfit);
            	addOrSunstract *= -1;
            	
            	for (int step = priceIndex; step < prices.length; step++) {
                	
        			// If the last action is to buy, do not do it.
        			if (addOrSunstract == -1 && step + 1 >= prices.length - 1)
        				break;
        			
        			runningProfit += addOrSunstract * prices[step];
                	
                	System.out.println("startingIndex: " + startingIndex + "," + 
                			"step: " + step + 
                			", priceIndex: " + priceIndex +
                			", addOrSunstract: " + addOrSunstract +
                			", price: " + prices[step] +
                			", runningProfit: " + runningProfit);

                	
                	addOrSunstract *= -1;
        		}
            	System.out.println("runningProfit: " + runningProfit + ", maxProfit: " + maxProfit);
            	if (runningProfit > maxProfit) 
            		maxProfit = runningProfit;
            	System.out.println("runningProfit: " + runningProfit + ", maxProfit: " + maxProfit);
        	}
        }
        return maxProfit;
    }
    
}