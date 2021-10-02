package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public int[] plusOne(int[] digits) {
    	int[] result = digits;
 
    	for (int i = digits.length - 1; i >= 0; i--) {
    		if (digits[i] != 9) {
    			digits[i]++;
    			break;
    		}
    		
    		digits[i] = 0;
    	}

    	// If the first element is 0, it means we have a carry
    	// and thus we need to increase the size of the array.
    	// In this case, all of the right positions will be 
    	// zero as well.
        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            result = res;
        }

        return result;
    }
}
