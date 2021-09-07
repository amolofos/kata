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
		 * Input: s1 = "ab", s2 = "eidbaooo"
		 * Output: true
		 */
		String input1 = "ab";
		String input2 = "eidbaooo";
		boolean expectedOutput = true;
		boolean output;
		Solution solution = new Solution();

		output = solution.checkInclusionOn2(input1, input2);
		LOGGER.info("O(n^2): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: s1 = "ab", s2 = "eidboaoo"
		 * Output: false
		 */
		String input1 = "ab";
		String input2 = "eidboaoo";
		boolean expectedOutput = false;
		boolean output;
		Solution solution = new Solution();

		output = solution.checkInclusionOn2(input1, input2);
		LOGGER.info("O(n^2): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Test case:
		 * Input: s1 = "adc", s2 = "dcda"
		 * Output: true
		 */
		String input1 = "adc";
		String input2 = "dcda";
		boolean expectedOutput = true;
		boolean output;
		Solution solution = new Solution();

		output = solution.checkInclusionOn2(input1, input2);
		LOGGER.info("O(n^2): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}
