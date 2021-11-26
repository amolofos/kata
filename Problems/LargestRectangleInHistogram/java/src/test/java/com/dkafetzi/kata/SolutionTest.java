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
		 * Input: heights = [2,1,5,6,2,3]
		 * Output: 10
		 */
		int[] input = {2, 1, 5, 6, 2, 3};
		int expectedOutput = 10;
		
		Solution solution = new Solution();
		int output;

		output = solution.largestRectangleAreaOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOnOnePass(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 1:
		 * Input: heights = [2,4]
		 * Output: 4
		 */
		int[] input = {2, 4};
		int expectedOutput = 4;
		
		Solution solution = new Solution();
		int output;

		output = solution.largestRectangleAreaOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOnOnePass(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Test case
		 * Input: heights = null
		 * Output: 0
		 */
		int expectedOutput = 0;

		Solution solution = new Solution();
		int output;

		output = solution.largestRectangleAreaOn2O1(null);
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOn(null);
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOnOnePass(null);
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Test case
		 * Input: heights = []
		 * Output: 0
		 */
		int[] input = {};
		int expectedOutput = 0;
		
		Solution solution = new Solution();
		int output;

		output = solution.largestRectangleAreaOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOnOnePass(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/*
		 * Test case
		 * Input: heights = [2]
		 * Output: 2
		 */
		int[] input = {2};
		int expectedOutput = 2;
		
		Solution solution = new Solution();
		int output;

		output = solution.largestRectangleAreaOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOnOnePass(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 6")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		/*
		 * Test case
		 * Input: heights = [2, 1, 2, 1, 2, 1]
		 * Output: 6
		 */
		int[] input = {2, 1, 2, 1, 2, 1};
		int expectedOutput = 6;
		
		Solution solution = new Solution();
		int output;

		output = solution.largestRectangleAreaOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOnOnePass(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 7")
	void testSolution7(TestInfo testInfo) {
		LOGGER.debug("Simple test 7");

		/*
		 * Test case
		 * Input: heights = [2, 1, 0, 1, 2, 1]
		 * Output: 3
		 */
		int[] input = {2, 1, 0, 1, 2, 1};
		int expectedOutput = 3;
		
		Solution solution = new Solution();
		int output;

		output = solution.largestRectangleAreaOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOnOnePass(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 8")
	void testSolution8(TestInfo testInfo) {
		LOGGER.debug("Simple test 8");

		/*
		 * Test case
		 * Input: heights = [[3,5,5,2,5,5,6,6,4,4,1,1,2,5,5,6,6,4,1,3]]
		 * Output: 24
		 */
		int[] input = {3, 5, 5, 2, 5, 5, 6, 6, 4, 4, 1, 1, 2, 5, 5, 6, 6, 4, 1, 3};
		int expectedOutput = 24;
		
		Solution solution = new Solution();
		int output;

		output = solution.largestRectangleAreaOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOn(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.largestRectangleAreaOnOnOnePass(input.clone());
		LOGGER.info("O(n), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}