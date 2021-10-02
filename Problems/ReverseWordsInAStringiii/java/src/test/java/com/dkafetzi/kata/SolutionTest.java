package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

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
		 * Input: s = "Let's take LeetCode contest"
		 * Output: "s'teL ekat edoCteeL tsetnoc"
		 */
		String input = "Let's take LeetCode contest";
		String expectedOutput = "s'teL ekat edoCteeL tsetnoc";
		String output;
		Solution solution = new Solution();
		
		output = solution.reverseWords1(input);
		LOGGER.info("1: Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.reverseWords2(input);
		LOGGER.info("2: Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: s = "God Ding"
		 * Output: "doG gniD"
		 */
		String input = "God Ding";
		String expectedOutput = "doG gniD";
		String output;
		Solution solution = new Solution();
		
		output = solution.reverseWords1(input);
		LOGGER.info("1: Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.reverseWords2(input);
		LOGGER.info("2: Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}
