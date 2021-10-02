package com.dkafetzi.kata;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public void moveZeroes(int[] nums) {
    	if (nums.length <= 1)
    		return;

    	int countZeros = 0;

    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == 0)
    			countZeros++;
    		else
    			nums[i - countZeros] = nums[i];
    	}

    	for (int i = nums.length - countZeros; i < nums.length; i++)
    		nums[i] = 0;
    }
}
