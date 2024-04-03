package com.dkafetzi.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public List<Integer> findDuplicatesOnOn(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
	
		if (nums.length <= 1)
			return result;

		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			counts.put(nums[i], counts.getOrDefault(nums[i], 0)+1);
		}

		for (Integer e : counts.keySet())
			if (counts.get(e) == 2)
				result.add(e);

		return result;
	}
	
	public List<Integer> findDuplicatesOnO1(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
	
		if (nums.length <= 1)
			return result;
		
		// The goal here is to replace each element in nums
		// with its respective count. In order to avoid 
		// mixed original elements and counts, we will have 
		// negative counters.

		int count = 0;
		while (count < nums.length) {
			int current = nums[count];
			
			// It is a count element, skip.
			if (current <= 0) {
				count++;
				continue;
			}
				
			int tmp = nums[current - 1];
			
			// We have already started counting the element, count and skip.
			if (tmp <= 0) {
				nums[count] = 0;
				nums[current - 1] -= 1;
				count++;
				continue;
			}
			
			nums[current - 1] = -1;
			nums[count] = tmp;
			
			if (nums[count] == count + 1) {
				nums[count] = -1;
				count++;
			}
		}
		
		LOGGER.info("nums: {}.", nums);
		
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == -2)
				result.add(i + 1);
		
		LOGGER.info("nums: {}, result: {}.", nums, result);

		return result;
	}
}
