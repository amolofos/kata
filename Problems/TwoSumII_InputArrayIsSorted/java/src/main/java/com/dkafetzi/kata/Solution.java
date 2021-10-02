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

    public int[] twoSum(int[] numbers, int target) {
    	int[] result = new int[2];

    	for (int i = 0; i < numbers.length - 1; i++) {
    		if (numbers[i] > target) {
    			continue;
    		}
    		if (result[1] != 0) {
    			break;
    		}

    		for (int j = i + 1; j < numbers.length; j++) {
    			int sum = numbers[i] + numbers[j];
    			if (target == sum) {
    				result[0] = i + 1;
    				result[1] = j + 1;
    				break;
    			}
    			if (target < sum)
    				break;
    		}
    	}
    	
    	return result;
    }
}
