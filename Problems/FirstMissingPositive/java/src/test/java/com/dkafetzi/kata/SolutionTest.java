package com.dkafetzi.kata;

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
		 * Example 1:
		 * Input: nums = [1,2,0]
		 * Output: 3
		 */
		int[] input = {1, 2, 0};
		int expectedOutput = 3;
		
		Solution solution = new Solution();
		int output;

		output = solution.firstMissingPositiveOnO1(input.clone());
		LOGGER.info("O(1), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: nums = [3,4,-1,1]
		 * Output: 2
		 */
		int[] input = {3, 4, -1, 1};
		int expectedOutput = 2;
		
		Solution solution = new Solution();
		int output;

		output = solution.firstMissingPositiveOnO1(input.clone());
		LOGGER.info("O(1), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: nums = [7,8,9,11,12]
		 * Output: 1
		 */
		int[] input = {7, 8, 9, 11, 12};
		int expectedOutput = 1;
		
		Solution solution = new Solution();
		int output;

		output = solution.firstMissingPositiveOnO1(input.clone());
		LOGGER.info("O(1), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Example 3:
		 * Input: nums = [-1, -1, -1]
		 * Output: 1
		 */
		int[] input = {-1, -1, -1};
		int expectedOutput = 1;
		
		Solution solution = new Solution();
		int output;

		output = solution.firstMissingPositiveOnO1(input.clone());
		LOGGER.info("O(1), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}