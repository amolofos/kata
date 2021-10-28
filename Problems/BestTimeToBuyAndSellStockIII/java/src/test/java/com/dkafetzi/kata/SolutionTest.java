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
		 * Input: [3,3,5,0,0,3,1,4]
		 * Output: 3
		 */
		int[] input = {3, 3, 5, 0, 0, 3, 1, 4};
		int expectedOutput = 6;
		
		Solution solution = new Solution();
		int output;

		output = solution.maxProfitOn4O1(input.clone());
		LOGGER.info("O(n^4), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOn2On(input.clone());
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOnO1Fin(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOnOnDP(input.clone());
		LOGGER.info("O(2n), O(3n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: [1,2,3,4,5]
		 * Output: 4
		 */
		int[] input = {1, 2, 3, 4, 5};
		int expectedOutput = 4;
		
		Solution solution = new Solution();
		int output;

		output = solution.maxProfitOn4O1(input.clone());
		LOGGER.info("O(n^4), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOn2On(input.clone());
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.maxProfitOnO1Fin(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOnOnDP(input.clone());
		LOGGER.info("O(2n), O(3n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: [7,6,4,3,1]
		 * Output: 0
		 */
		int[] input = {7, 6, 4, 3, 1};
		int expectedOutput = 0;
		
		Solution solution = new Solution();
		int output;

		output = solution.maxProfitOn4O1(input.clone());
		LOGGER.info("O(n^4), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOn2On(input.clone());
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.maxProfitOnO1Fin(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOnOnDP(input.clone());
		LOGGER.info("O(2n), O(3n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Example 4:
		 * Input: [1]
		 * Output: 0
		 */
		int[] input = {1};
		int expectedOutput = 0;
		
		Solution solution = new Solution();
		int output;

		output = solution.maxProfitOn4O1(input.clone());
		LOGGER.info("O(n^4), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOn2On(input.clone());
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.maxProfitOnO1Fin(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOnOnDP(input.clone());
		LOGGER.info("O(2n), O(3n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/*
		 * Test case:
		 * Input: []
		 * Output: 0
		 */
		int[] input = {};
		int expectedOutput = 0;
		
		Solution solution = new Solution();
		int output;

		output = solution.maxProfitOn4O1(input.clone());
		LOGGER.info("O(n^4), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOn2On(input.clone());
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.maxProfitOnO1Fin(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOnOnDP(input.clone());
		LOGGER.info("O(2n), O(3n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 6")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		/*
		 * Test case:
		 * Input: null
		 * Output: 0
		 */
		int expectedOutput = 0;
		
		Solution solution = new Solution();
		int output;

		output = solution.maxProfitOn4O1(null);
		LOGGER.info("O(n^4), O(1): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOn2On(null);
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.maxProfitOnO1Fin(null);
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitOnOnDP(null);
		LOGGER.info("O(2n), O(3n): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}