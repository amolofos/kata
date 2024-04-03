package com.dkafetzi.kata;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* https://leetcode.com/problems/fruit-into-baskets/
*
* See README.md for more information
*
*/
class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public int majorityElementOnOnHashMap(int[] nums) {
		int result = -1;
		
		if (nums == null || nums.length < 1)
			return result;
		if (nums.length == 1)
			return nums[0];
		
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
		}
		
		int max = nums.length / 2;
		for ( Integer i : count.keySet()) {
			if (count.get(i) > max)
				result = i;
		}

		return result;
	}

	public int majorityElementOnO1(int[] nums) {
		int result = -1;

		if (nums == null || nums.length < 1)
			return result;
		if (nums.length == 1)
			return nums[0];

        int count = 0;
        for (int num : nums) {
        	if (count == 0)
        		result = num;
        	count += (num == result) ? 1 : -1;
        }

		return result;
	}
}
