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

		/* Example 1
		 * Input: s = "(()"
		 * Output: 2
		 */
		String input = "(()";
		int expectedOutput = 2;
		
		Solution solution = new Solution();
		int output = solution.longestValidParentheses(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 1
		 * Input: s = ")()())"
		 * Output: 4
		 */
		String input = ")()())";
		int expectedOutput = 4;
		
		Solution solution = new Solution();
		int output = solution.longestValidParentheses(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/* Example 1
		 * Input: s = ""
		 * Output: 4
		 */
		String input = "";
		int expectedOutput = 0;
		
		Solution solution = new Solution();
		int output = solution.longestValidParentheses(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}