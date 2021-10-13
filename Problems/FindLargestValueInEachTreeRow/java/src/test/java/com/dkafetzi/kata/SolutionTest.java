package com.dkafetzi.kata;

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
		 * Input: [1,3,2,5,3,null,9]
		 * Output: [1,3,9]
		 */
		TreeNode input = new TreeNode(1);
		input.left = new TreeNode(3);
		input.right = new TreeNode(2);
		input.left.left = new TreeNode(5);
		input.left.right = new TreeNode(3);
		input.right.left = null;
		input.right.right = new TreeNode(9);
		
		List<Integer> expectedOutput = new ArrayList<Integer>();
		expectedOutput.add(1);
		expectedOutput.add(3);
		expectedOutput.add(9);
		
		Solution solution = new Solution();
		List<Integer> output;

		output = solution.largestValuesOn2On(input);
		LOGGER.info("O(n^2), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.largestValuesOnOn(input);
		LOGGER.info("O(n), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: [1,2,3]
		 * Output: [1,3]
		 */
		TreeNode input = new TreeNode(1);
		input.left = new TreeNode(2);
		input.right = new TreeNode(3);

		List<Integer> expectedOutput = new ArrayList<Integer>();
		expectedOutput.add(1);
		expectedOutput.add(3);
		
		Solution solution = new Solution();
		List<Integer> output;

		output = solution.largestValuesOn2On(input);
		LOGGER.info("O(n^2), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.largestValuesOnOn(input);
		LOGGER.info("O(n), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: [1]
		 * Output: [1]
		 */
		TreeNode input = new TreeNode(1);

		List<Integer> expectedOutput = new ArrayList<Integer>();
		expectedOutput.add(1);
		
		Solution solution = new Solution();
		List<Integer> output;

		output = solution.largestValuesOn2On(input);
		LOGGER.info("O(n^2), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.largestValuesOnOn(input);
		LOGGER.info("O(n), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");
	
		/*
		 * Test case:
		 * Input: [1,null,2]
		 * Output: [1,2]
		 */
		TreeNode input = new TreeNode(1);
		input.left = null;
		input.right = new TreeNode(2);

		List<Integer> expectedOutput = new ArrayList<Integer>();
		expectedOutput.add(1);
		expectedOutput.add(2);
		
		Solution solution = new Solution();
		List<Integer> output;

		output = solution.largestValuesOn2On(input);
		LOGGER.info("O(n^2), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.largestValuesOnOn(input);
		LOGGER.info("O(n), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");
	
		/*
		 * Test case:
		 * Input: []
		 * Output: []
		 */
		TreeNode input = null;
		List<Integer> expectedOutput = new ArrayList<Integer>();
		
		Solution solution = new Solution();
		List<Integer> output;

		output = solution.largestValuesOn2On(input);
		LOGGER.info("O(n^2), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.largestValuesOnOn(input);
		LOGGER.info("O(n), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}