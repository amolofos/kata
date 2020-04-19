package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3307/
 * 
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 * 
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * 
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 * 
 */
public class Solution {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);
	
	/*
	 * ??
	 */
    public int subarraySum(int[] nums, int k) {
    	int counter = 0;
    	int runningSum = 0;
    	
    	if (nums == null || nums.length <= 0)
    		return counter;
    	
    	for (int i = 0; i < nums.length; i++) {
    		runningSum = 0;
    		
    		for (int j = i; j < nums.length; j++) {
    			runningSum += nums[j];
    			
    			if (runningSum == k) {
    				counter++;
    			}
    		}
    	}
    	
    	return counter;
    }
    
    /*
     * O(n^2)
     */
    public int subarraySumBruteForce(int[] nums, int k) {
    	int counter = 0;
    	int runningSum = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		runningSum = 0;
    		
    		for (int j = i; j < nums.length; j++) {
    			runningSum += nums[j];
    			
    			if (runningSum == k) {
    				counter++;
    			}
    		}
    	}
    	
    	return counter;
    }
}