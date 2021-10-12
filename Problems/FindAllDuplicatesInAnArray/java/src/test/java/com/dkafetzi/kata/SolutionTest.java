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
		 * Input: nums = [4,3,2,7,8,2,3,1]
		 * Output: [2,3]
		 */
		int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> expectedOutput = new ArrayList<Integer>();
		expectedOutput.add(2);
		expectedOutput.add(3);
		
		Solution solution = new Solution();
		List<Integer> output;

		output = solution.findDuplicatesOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.findDuplicatesOnO1(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: nums = [1, 1, 2]
		 * Output: [1]
		 */
		int[] input = {1, 1, 2};
		List<Integer> expectedOutput = new ArrayList<Integer>();
		expectedOutput.add(1);
		
		Solution solution = new Solution();
		List<Integer> output;

		output = solution.findDuplicatesOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.findDuplicatesOnO1(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: nums = [1]
		 * Output: []
		 */
		int[] input = {1};
		List<Integer> expectedOutput = new ArrayList<Integer>();

		Solution solution = new Solution();
		List<Integer> output;

		output = solution.findDuplicatesOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.findDuplicatesOnO1(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");
	
		/*
		 * Test case:
		 * Input: nums = [4,3,2,7,8,5,6,1]
		 * Output: []
		 */
		int[] input = {4, 3, 2, 7, 8, 5, 6, 1};
		List<Integer> expectedOutput = new ArrayList<Integer>();
		
		Solution solution = new Solution();
		List<Integer> output;

		output = solution.findDuplicatesOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.findDuplicatesOnO1(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");
	
		/*
		 * Test case:
		 * Input: nums = [4,3,2,7,8,5,6,1]
		 * Output: []
		 */
		int[] input = {4, 4, 4, 4, 4, 4, 4, 4};
		List<Integer> expectedOutput = new ArrayList<Integer>();
		
		Solution solution = new Solution();
		List<Integer> output;

		output = solution.findDuplicatesOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.findDuplicatesOnO1(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}