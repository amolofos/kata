package com.dkafetzi.kata;

import static org.junit.Assert.assertArrayEquals;
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
		 * Input: nums = [1, 2, 3]
		 * Output: [1, 2, 4]
		 */
		int[] input = {1, 2, 3};
		int[] expectedOutput = {1, 2, 4};
		int[] output;

		Solution solution = new Solution();

		output = solution.plusOne(input);
		LOGGER.info("O(n): Input: [{}], Expected output: [{}], Output: [{}].", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: nums = [4, 3, 2, 1]
		 * Output: [4, 3, 2, 2]
		 */
		int[] input = {4, 3, 2, 1};
		int[] expectedOutput = {4, 3, 2, 2};
		int[] output;

		Solution solution = new Solution();

		output = solution.plusOne(input);
		LOGGER.info("O(n): Input: [{}], Expected output: [{}], Output: [{}].", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: nums = [0]
		 * Output: [1]
		 */
		int[] input = {0};
		int[] expectedOutput = {1};
		int[] output;

		Solution solution = new Solution();

		output = solution.plusOne(input);
		LOGGER.info("O(n): Input: [{}], Expected output: [{}], Output: [{}].", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Example 4:
		 * Input: nums = [9]
		 * Output: [1, 0]
		 */
		int[] input = {9};
		int[] expectedOutput = {1, 0};
		int[] output;

		Solution solution = new Solution();

		output = solution.plusOne(input);
		LOGGER.info("O(n): Input: [{}], Expected output: [{}], Output: [{}].", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
}