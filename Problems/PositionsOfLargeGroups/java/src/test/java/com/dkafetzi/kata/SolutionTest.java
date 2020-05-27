package com.dkafetzi.kata;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

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
		 * Input: "abbxxxxzzy"
		 * Output: [[3,6]]
		 * Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
		 * 
		 */
		String input = "abbxxxxzzy";
		List<List<Integer>> expectedOutput = asList(
				asList(3,6)
				);
		
		Solution solution = new Solution();
		List<List<Integer>> output = solution.largeGroupPositions(input);
		
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput.toString(), output.toString());
				
		assertEquals(expectedOutput, output);	
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: "abc"
		 * Output: []
		 * Explanation: We have "a","b" and "c" but no large group.
		 * 
		 */
		String input = "abc";
		List<List<Integer>> expectedOutput = new ArrayList<>();
		
		Solution solution = new Solution();
		List<List<Integer>> output = solution.largeGroupPositions(input);
		
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput.toString(), output.toString());
				
		assertEquals(expectedOutput, output);	
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: "abcdddeeeeaabbbcd"
		 * Output: [[3,5],[6,9],[12,14]]
		 * 
		 */
		String input = "abcdddeeeeaabbbcd";
		List<List<Integer>> expectedOutput = asList(
				asList(3,5),
				asList(6,9),
				asList(12,14)
				);
		
		Solution solution = new Solution();
		List<List<Integer>> output = solution.largeGroupPositions(input);
		
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput.toString(), output.toString());
				
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Test case:
		 * Input: "aaa"
		 * Output: [[0,2]]
		 * 
		 */
		String input = "aaa";
		List<List<Integer>> expectedOutput = asList(
				asList(0,2)
				);
		
		Solution solution = new Solution();
		List<List<Integer>> output = solution.largeGroupPositions(input);
		
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput.toString(), output.toString());
				
		assertEquals(expectedOutput, output);
	}
}