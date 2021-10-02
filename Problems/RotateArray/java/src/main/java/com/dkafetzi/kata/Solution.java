package com.dkafetzi.kata;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/problems/positions-of-large-groups/
 *
 * See README.md for more information
 *
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public void rotateOn2(int[] nums, int k) {
    	if (nums.length <= 1)
    		return;
    	
    	if (k > nums.length)
    		k = k % nums.length;
 
    	int currenPosition = 0;
    	int prevPosition = nums.length - 1;	
    	int leftOver = nums[prevPosition];
    	
        for (int i = 0; i < k; i++) {
        	currenPosition = 0;
        	prevPosition = nums.length - 1;
        	leftOver = nums[prevPosition];

        	for (int j = 0; j < nums.length; j++) {	        	
	        	currenPosition = j;
	
	        	int tmp = nums[currenPosition];
	        	nums[currenPosition] = leftOver;
	        	leftOver = tmp;
        	}
        }
    }
    
    public void rotateOn(int[] nums, int k) {
    	if (nums.length <= 1)
    		return;
    	
    	if (k > nums.length)
    		k = k % nums.length;
    	
    	// Keep the items to rotate.
    	int[] tmpArray = new int[k];
    	for (int i = 0; i < k; i++) {
    		tmpArray[i] = nums[nums.length - k + i];
    	}
    	
    	// Move the remaining elements in the array.
    	for (int i = nums.length - k - 1; i >=0; i--) {
    		nums[i+k] = nums[i];
    	}
    	
    	// Bring back the numbers stored in the helper array.
    	for (int i = 0; i < k; i++) {
    		nums[i] = tmpArray[i];
    	}
    }
}
