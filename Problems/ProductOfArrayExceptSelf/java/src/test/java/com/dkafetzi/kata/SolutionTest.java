package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
		 * Input: nums = [1,2,3,4]
		 * Output: [24,12,8,6]
		 */
		int[] input = {1, 2, 3, 4};
		int[] expectedOutput = {24, 12, 8, 6};

		Solution solution = new Solution();
		int[] output;

		output = solution.productExceptSelfOn2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);

		output = solution.productExceptSelfOn(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: nums = [-1,1,0,-3,3]
		 * Output: [0,0,9,0,0]
		 */
		int[] input = {-1, 1, 0, -3, 3};
		int[] expectedOutput = {0, 0, 9, 0, 0};

		Solution solution = new Solution();
		int[] output;

		output = solution.productExceptSelfOn2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);

		output = solution.productExceptSelfOn(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 2:
		 * Input: nums = [-1,1,0,0,3]
		 * Output: [0,0,0,0,0]
		 */
		int[] input = {-1, 1, 0, 0, 3};
		int[] expectedOutput = {0, 0, 0, 0, 0};

		Solution solution = new Solution();
		int[] output;

		output = solution.productExceptSelfOn2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);

		output = solution.productExceptSelfOn(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
}