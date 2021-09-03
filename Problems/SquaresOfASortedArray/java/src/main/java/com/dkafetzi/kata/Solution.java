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

    public int[] sortedSquaresSimple(int[] nums) {
    	int[] result = new int[nums.length];
    	
        for (int i = 0; i < nums.length; i++)
        	result[i] = nums[i] * nums[i];
        
        for (int i = 0; i < result.length - 1; i++)
            for (int j = i; j < result.length; j++)
                if (result[i] > result[j]) {
                    int tmp = result[i];
                    result[i] = result[j];
                    result[j] = tmp;
                }
        
        return result;
    }
    
    public int[] sortedSquaresOn(int[] nums) {
    	int[] result = new int[nums.length];
    	
    	// Find the point zero.
    	int zeroIndex = nums.length - 1;
    	for (int i = 0; i < nums.length; i++)
            if (nums[i] >= 0) {
            	zeroIndex = i;
            	break;
            }
    	
    	LOGGER.info("zeroIndex {}.", zeroIndex);
 
    	int left = zeroIndex;
    	int right = zeroIndex + 1;
    	int newIndex = 0;
    	LOGGER.info("left {}, right {}, zeroIndex {}, newIndex {}, result {}", left, right, zeroIndex, newIndex, Arrays.toString(result));

    	while (left >= 0 || right < nums.length) {
        	LOGGER.info("pre: left {}, right {}, zeroIndex {}, newIndex {}, result {}", left, right, zeroIndex, newIndex, Arrays.toString(result));

    		if (left < 0) {
    			result[newIndex] = nums[right] * nums[right];
    			right++;
    		} else if (right >= nums.length) {
    			result[newIndex] = nums[left] * nums[left];
    			left--;
    		} else if (nums[left] * nums[left] < nums[right] * nums[right]) {
    			result[newIndex] = nums[left] * nums[left];
    			left--;
    		} else {
    			result[newIndex] = nums[right] * nums[right];
    			right++;
    		}
    		
    		newIndex++;
    		
        	LOGGER.info("post: left {}, right {}, zeroIndex {}, newIndex {}, result {}", left, right, zeroIndex, newIndex, Arrays.toString(result));
    	}

    	return result;
    }
}
