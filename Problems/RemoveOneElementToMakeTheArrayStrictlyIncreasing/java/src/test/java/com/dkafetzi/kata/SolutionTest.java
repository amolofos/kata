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
	void testSolution1(TestInfo testInfo) {
		LOGGER.debug("Simple test 1");

		/*
		 * Example 1:
		 * Input: nums = [1,2,10,5,7]
		 * Output: true
		 */
		int[] input = {1, 2, 3, 4, 5, 6, 7};
		boolean expectedOutput = true;
		boolean output;

		Solution solution = new Solution();

		output = solution.canBeIncreasing(input);
		LOGGER.info("O(n): Input: [{}], Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: nums = [2,3,1,2]
		 * Output: false
		 */
		int[] input = {2, 3, 1, 2};
		boolean expectedOutput = false;
		boolean output;

		Solution solution = new Solution();

		output = solution.canBeIncreasing(input);
		LOGGER.info("O(n): Input: [{}], Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: nums = [1, 1, 1]
		 * Output: false
		 */
		int[] input = {1, 1, 1};
		boolean expectedOutput = false;
		boolean output;

		Solution solution = new Solution();

		output = solution.canBeIncreasing(input);
		LOGGER.info("O(n): Input: [{}], Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Example 4:
		 * Input: nums = [1, 2, 3]
		 * Output: true
		 */
		int[] input = {1, 2, 3};
		boolean expectedOutput = true;
		boolean output;

		Solution solution = new Solution();

		output = solution.canBeIncreasing(input);
		LOGGER.info("O(n): Input: [{}], Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}