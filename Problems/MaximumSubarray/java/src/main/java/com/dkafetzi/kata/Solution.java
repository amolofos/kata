package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/problems/maximum-subarray/
 * 
 * See README.md for more information
 *   
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);
	
    public int maxSubArray(int[] nums) {
        int r = Integer.MIN_VALUE;
        for(int c = 0, p = 0, i = 0; i < nums.length; i++) {
            c = Math.max(p, 0) + nums[i];
            r = Math.max(c, r);
            p = c;
        }
        return r;
    }
}