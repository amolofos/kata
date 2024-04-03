package com.dkafetzi.kata;

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

	public int[] productExceptSelfOn2(int[] nums) {
		int[] result = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			for (int j = 0; j < nums.length; j++) {
				if (j == i)
					continue;

				product *= nums[j];
			}
			result[i] = product;
		}

		return result;
	}
	
	public int[] productExceptSelfOn(int[] nums) {
		int[] result  = new int[nums.length];
		
		/* This is my initial approach with
		 * intermediary arrays.
		 */
		/*
		int[] resultA = new int[nums.length];
		int[] resultB = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			resultA[i] = 1;
			resultB[i] = 1;
		}

		for (int i = 1; i < nums.length; i++) {
			resultA[i] = resultA[i - 1] * nums[i - 1];
		}

		for (int i = nums.length - 2; i >= 0; i--) {
			resultB[i] = resultB[i + 1] * nums[i + 1];
		}

		for (int i = 0; i < nums.length; i++) {
			result[i] = resultA[i] * resultB[i];
		}
		*/
		
		/* Another way to do this is by keeping the running
		 * product in a temp variable.
		 */
		for (int i = 0; i < nums.length; i++)
			result[i] = 1;

		int running = 1;
		for (int i = 0; i < nums.length; i++) {
			result[i] *= running;
			running *= nums[i];
		}

		running = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			result[i] *= running;
            running *= nums[i];
		}

		return result;
	}

	/*
	 * I could not find a solution without reserving
	 * an extra array for the result.
	 */
	public int[] productExceptSelfOnO1(int[] nums) {

		// Since we have product, zeros (0) matter.
		int zero_count = 0;
		int product_with_one_zero = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				zero_count++;
			else
				product_with_one_zero *= nums[i];
		}
		
		// If we have more than one zero, then every
		// element becomes zero.
		if (zero_count > 1) {
			for (int i = 0; i < nums.length; i++)
				nums[i] = 0;

			return nums;
		}
		
		// If we have just one zero, then all the
		// elements become zero apart from the 
		// one with zero value. That should be equal
		// to the product of all the rest elements.
		if (zero_count == 1) {
			for (int i = 0; i < nums.length; i++)
				if (nums[i] != 0)
					nums[i] = 0;
				else
					nums[i] = product_with_one_zero;

			return nums;
		}
		
		// Now we know that every element is non zero.
		
		
		return nums;
	}
}
