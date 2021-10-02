package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

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
		 * Input: [0,1,0,3,12]
		 * Output: [1,3,12,0,0]
		 */
		int[] inputOrig = {0, 1, 0, 3, 12};
		int[] input;
		int[] expectedOutput = {1, 3, 12, 0, 0};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		solution.moveZeroes(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: [0]
		 * Output: [0]
		 */
		int[] inputOrig = {0};
		int[] input;
		int[] expectedOutput = {0};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		solution.moveZeroes(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Test case:
		 * Input: [0, 1]
		 * Output: [1, 0]
		 */
		int[] inputOrig = {0, 1};
		int[] input;
		int[] expectedOutput = {1, 0};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		solution.moveZeroes(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
	}
}
