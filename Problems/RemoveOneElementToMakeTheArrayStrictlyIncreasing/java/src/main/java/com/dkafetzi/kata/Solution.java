package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public boolean canBeIncreasing(int[] nums) {
        boolean result = true;

        int count = 0;
        // p records the last index where we do not increment.
        int p = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1] || nums[i] == nums[i+1]) {
                count++;
                p = i;
            }
        }

        // If we have more than one increments, then
        // we need to remove more than one.
        if (count > 1)
        	result = false;
        
        // If we have only one, let's see what cases we have.
        else if (count == 1) {
        	
        	// If it is the first or the second to last, we can easily remove it.
            if (p == 0 || p == nums.length - 2)
            	result = true;
            
            // If it is in the middle, we can easily remove it.
            else if (nums[p+1] > nums[p-1] || nums[p+2] > nums[p])
            	result = true;
            else
            	result = false;
        }

        return result;
    }
}
