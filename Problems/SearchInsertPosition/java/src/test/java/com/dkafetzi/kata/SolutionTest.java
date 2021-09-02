package com.dkafetzi.kata;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
		 * Example 1
		 * Input: nums = [1,3,5,6]
		 * target = 5
		 * Output: 2
		 */
		int[] input = {1, 3, 5, 6};
		int target = 5;
		int expectedOutput = 2;

		Solution solution = new Solution();
		int output = solution.searchInsert(input, target);

		LOGGER.info("Input: {}, Target: {}, Expected output: {}, Output: {}.", input, target, expectedOutput, output);

		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 4
		 * Input: nums = [1,3,5,6]
		 * target = 0
		 * Output: 0
		 */
		int[] input = {1, 3, 5, 6};
		int target = 0;
		int expectedOutput = 0;

		Solution solution = new Solution();
		int output = solution.searchInsert(input, target);

		LOGGER.info("Input: {}, Target: {}, Expected output: {}, Output: {}.", input, target, expectedOutput, output);

		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: nums = [1,3,5,6]
		 * target = 7
		 * Output: 4
		 */
		int[] input = {1, 3, 5, 6};
		int target = 7;
		int expectedOutput = 4;

		Solution solution = new Solution();
		int output = solution.searchInsert(input, target);

		LOGGER.info("Input: {}, Target: {}, Expected output: {}, Output: {}.", input, target, expectedOutput, output);

		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Input: nums = [1,3,5,6]
		 * target = 1
		 * Output: 1
		 */
		int[] input = {1, 3, 5, 6};
		int target = 2;
		int expectedOutput = 1;

		Solution solution = new Solution();
		int output = solution.searchInsert(input, target);

		LOGGER.info("Input: {}, Target: {}, Expected output: {}, Output: {}.", input, target, expectedOutput, output);

		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/*
		 * Input: nums = [1,3]
		 * target = 2
		 * Output: 1
		 */
		int[] input = {1, 3};
		int target = 2;
		int expectedOutput = 1;

		Solution solution = new Solution();
		int output = solution.searchInsert(input, target);

		LOGGER.info("Input: {}, Target: {}, Expected output: {}, Output: {}.", input, target, expectedOutput, output);

		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 6")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		/*
		 * Input: nums = [1,3,5]
		 * target = 3
		 * Output: 1
		 */
		int[] input = {1, 3, 5};
		int target = 3;
		int expectedOutput = 1;

		Solution solution = new Solution();
		int output = solution.searchInsert(input, target);

		LOGGER.info("Input: {}, Target: {}, Expected output: {}, Output: {}.", input, target, expectedOutput, output);

		assertEquals(expectedOutput, output);
	}
}
