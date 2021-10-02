package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
		 * Input: s = ["h","e","l","l","o"]
		 * Output: ["o","l","l","e","h"]
		 */
		char[] inputOrig = {'h', 'e', 'l', 'l', 'o'};
		char[] input;
		char[] expectedOutput = {'o', 'l', 'l', 'e', 'h'};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		solution.reverseStringOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
		
		input = inputOrig.clone();
		solution.reverseStringO1(input);
		LOGGER.info("O(1): Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: s = ["H","a","n","n","a","h"]
		 * Output: ["h","a","n","n","a","H"]
		 */
		char[] inputOrig = {'H', 'a', 'n', 'n', 'a', 'h'};
		char[] input;
		char[] expectedOutput = {'h', 'a', 'n', 'n', 'a', 'H'};
		Solution solution = new Solution();
		
		input = inputOrig.clone();
		solution.reverseStringOn(input);
		LOGGER.info("O(n): Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
		
		input = inputOrig.clone();
		solution.reverseStringO1(input);
		LOGGER.info("O(1): Input: {}, Expected output: {}, Output: {}.", Arrays.toString(inputOrig), Arrays.toString(expectedOutput), Arrays.toString(input));
		assertArrayEquals(expectedOutput, input);
	}
}
