package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		 * Input: s = "abcabcbb"
		 * Output: 3
		 */
		String input = "abcabcbb";
		int expectedOutput = 3;
		int output;
		Solution solution = new Solution();

		output = solution.lengthOfLongestSubstringOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.lengthOfLongestSubstringOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: s = "bbbbb"
		 * Output: 1
		 */
		String input = "bbbbb";
		int expectedOutput = 1;
		int output;
		Solution solution = new Solution();

		output = solution.lengthOfLongestSubstringOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.lengthOfLongestSubstringOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: s = "pwwkew"
		 * Output: 3
		 */
		String input = "pwwkew";
		int expectedOutput = 3;
		int output;
		Solution solution = new Solution();

		output = solution.lengthOfLongestSubstringOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.lengthOfLongestSubstringOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Example 4:
		 * Input: s = ""
		 * Output: 0
		 */
		String input = "";
		int expectedOutput = 0;
		int output;
		Solution solution = new Solution();

		output = solution.lengthOfLongestSubstringOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.lengthOfLongestSubstringOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/*
		 * Test case:
		 * Input: s = " "
		 * Output: 1
		 */
		String input = " ";
		int expectedOutput = 1;
		int output;
		Solution solution = new Solution();

		output = solution.lengthOfLongestSubstringOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.lengthOfLongestSubstringOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 6")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		/*
		 * Test case:
		 * Input: s = "cdd"
		 * Output: 2
		 */
		String input = "cdd";
		int expectedOutput = 2;
		int output;
		Solution solution = new Solution();

		output = solution.lengthOfLongestSubstringOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.lengthOfLongestSubstringOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}
