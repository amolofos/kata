package com.dkafetzi.kata;

import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3310/
 * 
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * 
 * Example 1:
 * Input: [2,3,1,1,4]
 * Output: true
 * Explanation:
 *  Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * 
 * Example 2:
 * Input: [3,2,1,0,4]
 * Output: false
 * Explanation:
 *  You will always arrive at index 3 no matter what. Its maximum
 *  jump length is 0, which makes it impossible to reach the last index.
 *  
 */
class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);
	HashSet<Integer> visited = new HashSet<Integer>();
	
	/*
	 * Time:  O(n)
	 * Space: O(1)
	 */
    public boolean canJumpOn(int[] nums) {
    	boolean result = false;
    	int length = nums.length; 
    	
    	if (length <= 1)
    		return true;
    	
    	if (nums[0] == 0)
    		return false;
    	
    	int maxDistance = 0;
    	for (int i = 0; i < length - 1; i++) {
    		LOGGER.debug("i: {}, maxDistance: {}, nums[i]: {}", i, maxDistance, nums[i]);
    		
    		if (nums[i] == 0 && maxDistance <= i) {
				result = false;
				LOGGER.debug("i: {}, maxDistance: {}, nums[i]: {}, result: {}", i, maxDistance, nums[i], result);
				break;
    		}
    		
    		if (maxDistance < i + nums[i]) {
    			maxDistance = i + nums[i];
    			if (maxDistance >= length - 1) {
    				result = true;
    				LOGGER.debug("i: {}, maxDistance: {}, nums[i]: {}, result: {}", i, maxDistance, nums[i], result);
    				break;
    			}
    		}
    	}
    	
    	return result;
    }
    
	/*
	 * Time:        O(n^2)
	 * Space: worst O(n)
	 */
    public boolean canJumpBruteForce(int[] nums) {
    	if (nums.length <= 1)
    		return true;
    	
    	if (nums[0] == 0)
    		return false;
    	
    	return canJumpBruteForce(nums, 0);
    }
    
    
    public boolean canJumpBruteForce(int[] nums, int startIndex) {
    	boolean result = false;
    	int length = nums.length;
    
    	LOGGER.debug("startIndex: {}.", startIndex);
    	
    	if (visited.contains(startIndex)) {
    		LOGGER.debug("startIndex: {}, visited already.", startIndex);
    		return false;
    	}
    	
    	visited.add(startIndex);
    	 	
    	int jumps = nums[startIndex];
    	if (jumps == 0 && startIndex < length - 1) {
    		LOGGER.debug("startIndex: {}, jumps: {}, result: {}.", startIndex, jumps, result);
    		return false;
    	}

    	if (nums[startIndex] >= length - startIndex - 1)
    		return true;
    	
    	for (int i = 1; i <= jumps; i++) {
    		LOGGER.debug("startIndex: {}, jumps: {}, i: {}.", startIndex, jumps, i);
    		if (startIndex + i >= length - 1) {
    			result = true;
    			LOGGER.debug("startIndex: {}, jumps: {}, i: {}, result: {}.", startIndex, jumps, i, result);
    			break;
    		}
    		
    		if (canJumpBruteForce(nums, startIndex + i)) {
    			result = true; 
    			LOGGER.debug("startIndex: {}, jumps: {}, i: {}, result: {}.", startIndex, jumps, i, result);
    			break;
    		}
    	}
    	
    	return result;
    }
    
    
    /*
	public boolean canJumpBruteForce(int[] nums, int startIndex) {
    	boolean result = false;
    	int length = nums.length;
    	
    	LOGGER.debug("startIndex: {}, length: {}.", startIndex, length);
    	
    	if (length <= 0)
    		return !result;
    	
    	if (nums[0] >= length - 1)
    		return !result;
    	
    	if (nums[0] == 0)
    		return result;
    	
    	for (int i = startIndex; i < length - 1; i++) {
    		LOGGER.debug("startIndex: {}, i: {}, nums[i]: {}.", startIndex, i, nums[i]);
    		
    		if (i + nums[i] >= length - 1)
				return !result;
    		
        	if (nums[i] == 0)
        		break;
    		
    		for (int j = 1; j <= nums[i]; j++) {
    			LOGGER.debug("startIndex: {}, i: {}, j: {}, nums[i + j]: {}.", startIndex, i, j, nums[i + j]);
    			
    			if (nums[i + j] + j >= length - 1) {
    				LOGGER.debug("startIndex: {}, i: {}, j: {}, nums[startIndex + j]: {}, length: {}.", i, i, j, nums[i + j], length);
    				return !result;
    			}
    			
    			if (nums[i + j] == 0) {
    				LOGGER.debug("startIndex: {}, i: {}, j: {}, nums[i + j]: {}.", i, i, j, nums[i + j]);
    				continue;
    			}

    			if (i + j >= length - 1 || canJumpBruteForce(nums, startIndex + j) == true)
    				return !result;
    		}
    	}
    	
    	return result;
    }
    */
}