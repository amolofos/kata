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
		 * Input: [2,3,1,1,4]
		 * Output: true
		 * Explanation:
		 *   Jump 1 step from index 0 to 1, then 3 steps to the last index.
		 */
		int[] input = {2, 3, 1, 1, 4};
		boolean expectedOuput = true;
		
		Solution solution = new Solution();
		boolean output;
		
		output = solution.canJumpBruteForce(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
		
		output = solution.canJumpOn(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 1:
		 * Input: [3,2,1,0,4]
		 * Output: false
		 * Explanation:
		 *   You will always arrive at index 3 no matter what. Its maximum
		 *   jump length is 0, which makes it impossible to reach the last index.
		 */
		int[] input = {3, 2, 1, 0, 4};
		boolean expectedOuput = false;
		
		Solution solution = new Solution();
		boolean output;
		
		output = solution.canJumpBruteForce(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
		
		output = solution.canJumpOn(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Test case:
		 * Input: [0,2,3]
		 * Output: false
		 */
		int[] input = {0, 2, 3};
		boolean expectedOuput = false;
		
		Solution solution = new Solution();
		boolean output;
		
		output = solution.canJumpBruteForce(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
		
		output = solution.canJumpOn(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Test case:
		 * Input: [1,0,1,0]
		 * Output: false
		 */
		int[] input = {1, 0, 1, 0};
		boolean expectedOuput = false;
		
		Solution solution = new Solution();
		boolean output;
		
		output = solution.canJumpBruteForce(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
		
		output = solution.canJumpOn(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
	
	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/*
		 * Test case:
		 * Input: [2, 5, 0, 0]
		 * Output: true
		 */
		int[] input = {2, 5, 0, 0};
		boolean expectedOuput = true;
		
		Solution solution = new Solution();
		boolean output;
		
		output = solution.canJumpBruteForce(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
		
		output = solution.canJumpOn(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
	
	@Test
	@DisplayName("Simple test 6")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		/*
		 * Test case:
		 * Input: [1, 1, 1, 0]
		 * Output: true
		 */
		int[] input = {1, 1, 1, 0};
		boolean expectedOuput = true;
		
		Solution solution = new Solution();
		boolean output;
		
		output = solution.canJumpBruteForce(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
		
		output = solution.canJumpOn(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
	
	@Test
	@DisplayName("Simple test 7")
	void testSolution7(TestInfo testInfo) {
		LOGGER.debug("Simple test 7");

		/*
		 * Test case:
		 * Input: [2,0,6,9,8,4,5,0,8,9,1,2,9,6,8,8,0,6,3,1,2,2,1,2,6,5,3,1,2,2,6,4,2,4,3,0,0,0,3,8,2,4,0,1,2,0,1,4,6,5,8,0,7,9,3,4,6,6,5,8,9,3,4,3,7,0,4,9,0,9,8,4,3,0,7,7,1,9,1,9,4,9,0,1,9,5,7,7,1,5,8,2,8,2,6,8,2,2,7,5,1,7,9,6]
		 * Output: false
		 */
		int[] input = {
			2, 0, 6, 9, 8, 4, 5, 0, 8, 9,
			1, 2, 9, 6, 8, 8, 0, 6, 3, 1,
			2, 2, 1, 2, 6, 5, 3, 1, 2, 2,
			6, 4, 2, 4, 3, 0, 0, 0, 3, 8,
			2, 4, 0, 1, 2, 0, 1, 4, 6, 5,
			8, 0, 7, 9, 3, 4, 6, 6, 5, 8,
			9, 3, 4, 3, 7, 0, 4, 9, 0, 9,
			8, 4, 3, 0, 7, 7, 1, 9, 1, 9,
			4, 9, 0, 1, 9, 5, 7, 7, 1, 5,
			8, 2, 8, 2, 6, 8, 2, 2, 7, 5,
			1, 7, 9, 6
		};
		boolean expectedOuput = false;
		
		Solution solution = new Solution();
		boolean output;
		
		output = solution.canJumpBruteForce(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
		
		output = solution.canJumpOn(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
}