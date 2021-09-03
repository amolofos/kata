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
		 * Input: nums = [1,2,3,4,5,6,7]
		 * k = 3
		 * Output: [5,6,7,1,2,3,4]
		 */
		int[] inputOrig = {1, 2, 3, 4, 5, 6, 7};
		int[] input;
		int k = 3;
		int[] expectedOutput = {5, 6, 7, 1, 2, 3, 4};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		solution.rotateOn2(input, k);
		LOGGER.info("O(n^2): Input: {}, k: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), k, Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
		
		input = inputOrig.clone();
		solution.rotateOn(input, k);
		LOGGER.info("O(n): Input: {}, k: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), k, Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: nums = [-1,-100,3,99]
		 * k = 2
		 * Output: [3,99,-1,-100]
		 */
		int[] inputOrig = {-1, -100, 3, 99};
		int[] input;
		int k = 2;
		int[] expectedOutput = {3, 99, -1, -100};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		solution.rotateOn2(input, k);
		LOGGER.info("O(n^2): Input: {}, k: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), k, Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
		
		input = inputOrig.clone();
		solution.rotateOn(input, k);
		LOGGER.info("O(n): Input: {}, k: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), k, Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
	}

}
