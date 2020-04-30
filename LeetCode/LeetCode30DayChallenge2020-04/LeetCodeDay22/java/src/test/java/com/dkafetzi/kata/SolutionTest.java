package com.dkafetzi.kata;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SolutionTest {

	private final static Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);
	
	@Test
	@DisplayName("Simple test 1")
	void testSubarraySum1(TestInfo testInfo) {
		LOGGER.debug("Simple test 1");

		Solution solution = new Solution();
		/*
		 * Example 1:
		 * Input:nums = [1,1,1], k = 2
		 * Output: 2
		 */
		int[] nums = {1, 1, 1};
		int k = 2;
		int expectedOutput = 2;
		int output = solution.subarraySumBruteForce(nums, k);
	
		LOGGER.debug("Input nums: {}, k: {}, expectedOutput: {}, output: {}", nums, k, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.subarraySum(nums, k);
		
		LOGGER.debug("Input nums: {}, k: {}, expectedOutput: {}, output: {}", nums, k, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSubarraySum2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		Solution solution = new Solution();
		/*
		 * Test case
		 * Input:nums = [0,0,0,0,0,0,0,0,0,0], k = 0
		 * Output: 55
		 */
		int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int k = 0;
		int expectedOutput = 55;
		int output = solution.subarraySumBruteForce(nums, k);
	
		LOGGER.debug("Input nums: {}, k: {}, expectedOutput: {}, output: {}", nums, k, expectedOutput, output);
		assertEquals(expectedOutput, output);
	
		output = solution.subarraySum(nums, k);
		
		LOGGER.debug("Input nums: {}, k: {}, expectedOutput: {}, output: {}", nums, k, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	
	@Test
	@DisplayName("Simple test 3")
	void testSubarraySum3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		Solution solution = new Solution();
		/*
		 * Test case
		 * Input:nums = [28, 54, 7, -70, 22, 65, -6], k = 100
		 * Output: 55
		 */
		int[] nums = {28, 54, 7, -70, 22, 65, -6};
		int k = 100;
		int expectedOutput = 1;
		int output = solution.subarraySumBruteForce(nums, k);
	
		LOGGER.debug("Input nums: {}, k: {}, expectedOutput: {}, output: {}", nums, k, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.subarraySum(nums, k);
		
		LOGGER.debug("Input nums: {}, k: {}, expectedOutput: {}, output: {}", nums, k, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}