package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		 * Input: [3,2,3]
		 * Output: 3
		 */
		int[] input = {3, 2, 3};
		int expectedOutput = 3;

		Solution solution = new Solution();
		int output;

		output = solution.majorityElementOnOnHashMap(input);
		LOGGER.info("O(n), O(n) HashMap: Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.majorityElementOnO1(input);
		LOGGER.info("O(n), O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: [2,2,1,1,1,2,2]
		 * Output: 2
		 */
		int[] input = {2, 2, 1, 1, 1, 2, 2};
		int expectedOutput = 2;

		Solution solution = new Solution();
		int output;

		output = solution.majorityElementOnOnHashMap(input);
		LOGGER.info("O(n), O(n) HashMap: Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.majorityElementOnO1(input);
		LOGGER.info("O(n), O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Test case:
		 * Input: []
		 * Output: -1
		 */
		int[] input = {};
		int expectedOutput = -1;

		Solution solution = new Solution();
		int output;

		output = solution.majorityElementOnOnHashMap(input);
		LOGGER.info("O(n), O(n) HashMap: Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.majorityElementOnO1(input);
		LOGGER.info("O(n), O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Test case:
		 * Input: null
		 * Output: -1
		 */
		int[] input = null;
		int expectedOutput = -1;

		Solution solution = new Solution();
		int output;

		output = solution.majorityElementOnOnHashMap(input);
		LOGGER.info("O(n), O(n) HashMap: Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.majorityElementOnO1(input);
		LOGGER.info("O(n), O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/*
		 * Test case:
		 * Input: [1]
		 * Output: 1
		 */
		int[] input = {1};
		int expectedOutput = 1;

		Solution solution = new Solution();
		int output;

		output = solution.majorityElementOnOnHashMap(input);
		LOGGER.info("O(n), O(n) HashMap: Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.majorityElementOnO1(input);
		LOGGER.info("O(n), O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}