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
		 * Input: n = 2
		 * Output: [0,1,1]
		 */
		int input = 2;
		int[] expectedOutput = {0, 1, 1};

		Solution solution = new Solution();
		int[] output;

		output = solution.countBits(input);
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: n = 5
		 * Output: [0,1,1,2,1,2]
		 */
		int input = 5;
		int[] expectedOutput = {0, 1, 1, 2, 1, 2};

		Solution solution = new Solution();
		int[] output;

		output = solution.countBits(input);
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
}