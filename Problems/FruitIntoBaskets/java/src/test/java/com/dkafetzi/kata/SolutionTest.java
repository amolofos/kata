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
		 * Input: [1,2,1]
		 * Output: 3
		 * Explanation: We can collect [1,2,1].
		 */
		int[] input = {1, 2, 1};
		int expectedOutput = 3;

		Solution solution = new Solution();
		int output;

		output = solution.totalFruitOnV1(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.totalFruitOn2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.totalFruitOnV2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: [0,1,2,2]
		 * Output: 3
		 * Explanation: We can collect [1,2,2].
		 * If we started at the first tree, we would only collect [0, 1].
		 */
		int[] input = {0, 1, 2, 2};
		int expectedOutput = 3;

		Solution solution = new Solution();
		int output;

		output = solution.totalFruitOnV1(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.totalFruitOn2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.totalFruitOnV2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: [1,2,3,2,2]
		 * Output: 4
		 * Explanation: We can collect [2,3,2,2].
		 * If we started at the first tree, we would only collect [1, 2].
		 */
		int[] input = {1, 2, 3, 2, 2};
		int expectedOutput = 4;

		Solution solution = new Solution();
		int output;

		output = solution.totalFruitOnV1(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.totalFruitOn2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.totalFruitOnV2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Example 4:
		 * Input: [3,3,3,1,2,1,1,2,3,3,4]
		 * Output: 5
		 * Explanation: We can collect [1,2,1,1,2].
		 * If we started at the first tree or the eighth tree, we would only collect 4 fruits.
		 */
		int[] input = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
		int expectedOutput = 5;

		Solution solution = new Solution();
		int output;

		output = solution.totalFruitOnV1(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.totalFruitOn2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.totalFruitOnV2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}
