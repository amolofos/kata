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
		 * Input: [73,74,75,71,69,72,76,73]
		 * Output: [1,1,4,2,1,1,0,0]
		 */
		int[] input = {73, 74, 75, 71, 69, 72,  76, 73};
		int[] expectedOutput = {1, 1, 4, 2, 1, 1, 0, 0};
		
		Solution solution = new Solution();
		int[] output;

		output = solution.dailyTemperaturesOn2On(input.clone());
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);

		output = solution.dailyTemperaturesOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.dailyTemperaturesOnO1(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");
	
		/*
		 * Example 2:
		 * Input: [30,40,50,60]
		 * Output: [1,1,1,0]
		 */
		int[] input = {30, 40, 50, 60};
		int[] expectedOutput = {1, 1, 1, 0};
		
		Solution solution = new Solution();
		int[] output;

		output = solution.dailyTemperaturesOn2On(input.clone());
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);

		output = solution.dailyTemperaturesOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.dailyTemperaturesOnO1(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");
	
		/*
		 * Example 2:
		 * Input: [30,60,90]
		 * Output: [1,1,0]
		 */
		int[] input = {30,60,90};
		int[] expectedOutput = {1, 1, 0};
		
		Solution solution = new Solution();
		int[] output;

		output = solution.dailyTemperaturesOn2On(input.clone());
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);

		output = solution.dailyTemperaturesOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.dailyTemperaturesOnO1(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");
	
		/*
		 * Test case:
		 * Input: null
		 * Output: [0]
		 */
		int[] expectedOutput = {0};
		
		Solution solution = new Solution();
		int[] output;

		output = solution.dailyTemperaturesOn2On(null);
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);

		output = solution.dailyTemperaturesOn2O1(null);
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.dailyTemperaturesOnO1(null);
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");
	
		/*
		 * Test case:
		 * Input: [1]
		 * Output: [0]
		 */
		int[] input = {1};
		int[] expectedOutput = {0};
		
		Solution solution = new Solution();
		int[] output;

		output = solution.dailyTemperaturesOn2On(input.clone());
		LOGGER.info("O(n^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);

		output = solution.dailyTemperaturesOn2O1(input.clone());
		LOGGER.info("O(n^2), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.dailyTemperaturesOnO1(input.clone());
		LOGGER.info("O(n), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
}