package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		 * Input: arr = ["un","iq","ue"]
		 * Output: 4
		 */
		List<String> input = new ArrayList<String>();
		input.add("un");
		input.add("iq");
		input.add("ue");
		int expectedOutput = 4;
		int output;
		Solution solution = new Solution();

		output = solution.maxLengthBruteForceHashSet(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxLengthBruteForceBitwise(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: arr = ["cha","r","act","ers"]
		 * Output: 6
		 */
		List<String> input = new ArrayList<String>();
		input.add("cha");
		input.add("r");
		input.add("act");
		input.add("ers");
		int expectedOutput = 6;
		int output;
		Solution solution = new Solution();

		output = solution.maxLengthBruteForceHashSet(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxLengthBruteForceBitwise(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: arr = ["abcdefghijklmnopqrstuvwxyz"]
		 * Output: 26
		 */
		List<String> input = new ArrayList<String>();
		input.add("abcdefghijklmnopqrstuvwxyz");
		int expectedOutput = 26;
		int output;
		Solution solution = new Solution();

		output = solution.maxLengthBruteForceHashSet(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxLengthBruteForceBitwise(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Test case:
		 * Input: arr = ["a", "abc", "d", "de", "def"]
		 * Output: 6
		 */
		List<String> input = new ArrayList<String>();
		input.add("a");
		input.add("abc");
		input.add("d");
		input.add("de");
		input.add("def");
		int expectedOutput = 6;
		int output;
		Solution solution = new Solution();

		output = solution.maxLengthBruteForceHashSet(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxLengthBruteForceBitwise(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}
