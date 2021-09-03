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
		 * Input: nums = [-4,-1,0,3,10]
		 * Output: [0,1,9,16,100]
		 */
		int[] input = {-4, -1, 0, 3, 10};
		int[] expectedOutput = {0, 1, 9, 16, 100};

		Solution solution = new Solution();
		int[] output = {};
		
		output = solution.sortedSquaresSimple(input);
		LOGGER.info("Simple: Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
	
		output = solution.sortedSquaresOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: nums = [-7,-3,2,3,11]
		 * Output: [4,9,9,49,121]
		 */
		int[] input = {-7, -3, 2, 3, 11};
		int[] expectedOutput = {4, 9, 9, 49, 121};

		Solution solution = new Solution();
		int[] output = {};
		
		output = solution.sortedSquaresSimple(input);
		LOGGER.info("Simple: Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
		
		output = solution.sortedSquaresOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Test case:
		 * Input: nums = [1]
		 * Output: [1]
		 */
		int[] input = {1};
		int[] expectedOutput = {1};

		Solution solution = new Solution();
		int[] output = {};
		
		output = solution.sortedSquaresSimple(input);
		LOGGER.info("Simple: Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
		
		output = solution.sortedSquaresOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Test case:
		 * Input: nums = [-5,-3,-2,-1]
		 * Output: [1,4,9,25]
		 */
		int[] input = {-5, -3, -2, -1};
		int[] expectedOutput = {1, 4, 9, 25};

		Solution solution = new Solution();
		int[] output = {};
		
		output = solution.sortedSquaresSimple(input);
		LOGGER.info("Simple: Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
		
		output = solution.sortedSquaresOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
	}
	
}
