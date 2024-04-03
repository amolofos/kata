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
		 * Input: arr = [1,0,2,3,0,4,5,0]
		 * Output: [1,0,0,2,3,0,0,4]
		 */
		int[] input = {1, 0, 2, 3, 0, 4, 5, 0};
		int[] expectedOutput = {1, 0, 0, 2, 3, 0, 0, 4};

		Solution solution = new Solution();
		int[] output;

		output = solution.duplicateZerosOn2O1(input.clone());
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.duplicateZerosOnO1(input.clone());
		LOGGER.info("O(n) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: arr = [1,2,3]
		 * Output: [1,2,3]
		 */
		int[] input = {1, 2, 3};
		int[] expectedOutput = {1, 2, 3};

		Solution solution = new Solution();
		int[] output;

		output = solution.duplicateZerosOn2O1(input.clone());
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.duplicateZerosOnO1(input.clone());
		LOGGER.info("O(n) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Test case:
		 * Input: arr = []
		 * Output: []
		 */
		int[] input = {};
		int[] expectedOutput = {};

		Solution solution = new Solution();
		int[] output;

		output = solution.duplicateZerosOn2O1(input.clone());
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.duplicateZerosOnO1(input.clone());
		LOGGER.info("O(n) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Test case:
		 * Input: arr = [1,0,0,2,3,0,4,5]
		 * Output:      [1,0,0,0,0,2,3,0]
		 */
		int[] input = {1, 0, 0, 2, 3, 0, 4, 5};
		int[] expectedOutput = {1, 0, 0, 0, 0, 2, 3, 0};

		Solution solution = new Solution();
		int[] output;

		output = solution.duplicateZerosOn2O1(input.clone());
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.duplicateZerosOnO1(input.clone());
		LOGGER.info("O(n) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/*
		 * Test case:
		 * Input: arr = [1,0,0,2,3,4,0,5]
		 * Output:      [1,0,0,0,0,2,3,4]
		 */
		int[] input = {1, 0, 0, 2, 3, 4, 0, 5};
		int[] expectedOutput = {1, 0, 0, 0, 0, 2, 3, 4};

		Solution solution = new Solution();
		int[] output;

		output = solution.duplicateZerosOn2O1(input.clone());
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.duplicateZerosOnO1(input.clone());
		LOGGER.info("O(n) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 6")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		/*
		 * Test case:
		 * Input: arr = [0,0,0]
		 * Output:      [0,0,0]
		 */
		int[] input = {0, 0, 0};
		int[] expectedOutput = {0, 0, 0};

		Solution solution = new Solution();
		int[] output;

		output = solution.duplicateZerosOn2O1(input.clone());
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.duplicateZerosOnO1(input.clone());
		LOGGER.info("O(n) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 7")
	void testSolution7(TestInfo testInfo) {
		LOGGER.debug("Simple test 7");

		/*
		 * Test case:
		 * Input: arr = [1,5,2,0,6,8,0,6,0]
		 * Output:      [1,5,2,0,0,6,8,0,0]
		 */
		int[] input = {1, 5, 2, 0, 6, 8, 0, 6, 0};
		int[] expectedOutput = {1, 5, 2, 0, 0, 6, 8, 0, 0};

		Solution solution = new Solution();
		int[] output;

		output = solution.duplicateZerosOn2O1(input.clone());
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.duplicateZerosOnO1(input.clone());
		LOGGER.info("O(n) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 8")
	void testSolution8(TestInfo testInfo) {
		LOGGER.debug("Simple test 8");

		/*
		 * Test case:
		 * Input: arr = [1, 0, 4, 0, 0]
		 * Output:      [1, 0, 0, 4, 0]
		 */
		int[] input = {1, 0, 4, 0, 0};
		int[] expectedOutput = {1, 0, 0, 4, 0};

		Solution solution = new Solution();
		int[] output;

		output = solution.duplicateZerosOn2O1(input.clone());
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.duplicateZerosOnO1(input.clone());
		LOGGER.info("O(n) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
	//[1,0,5,0,0] -> [1,0,0,5,0
	                
	@Test
	@DisplayName("Simple test 9")
	void testSolution9(TestInfo testInfo) {
		LOGGER.debug("Simple test 9");

		/*
		 * Test case:
		 * Input: arr = [1,0,5,0,0]
		 * Output:      [1,0,0,5,0]
		 */
		int[] input = {1, 0, 5, 0, 0};
		int[] expectedOutput = {1, 0, 0, 5, 0};

		Solution solution = new Solution();
		int[] output;

		output = solution.duplicateZerosOn2O1(input.clone());
		LOGGER.info("O(n^2) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
		
		output = solution.duplicateZerosOnO1(input.clone());
		LOGGER.info("O(n) & O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
}