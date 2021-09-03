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
		 * Input: numbers = [2,7,11,15]
		 * target = 9
		 * Output: [1,2]
		 */
		int[] inputOrig = {2, 7, 11, 15};
		int[] input;
		int target = 9;
		int[] expectedOutput = {1, 2};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		int[] output = solution.twoSum(input, target);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: numbers = [2,3,4]
		 * target = 6
		 * Output: [1,3]
		 */
		int[] inputOrig = {2, 3, 4};
		int[] input;
		int target = 6;
		int[] expectedOutput = {1, 3};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		int[] output = solution.twoSum(input, target);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: numbers = [-1,0]
		 * target = -1
		 * Output: [1,2]
		 */
		int[] inputOrig = {-1, 0};
		int[] input;
		int target = -1;
		int[] expectedOutput = {1, 2};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		int[] output = solution.twoSum(input, target);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Test case:
		 * Input: numbers = [0,0,3,4]
		 * target = -1
		 * Output: [1, 2]
		 */
		int[] inputOrig = {0, 0, 3, 4};
		int[] input;
		int target = 0;
		int[] expectedOutput = {1, 2};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		int[] output = solution.twoSum(input, target);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
	}
}
