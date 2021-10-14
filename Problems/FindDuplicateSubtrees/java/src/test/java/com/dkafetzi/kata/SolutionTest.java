package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
		 * Input: root = [1,2,3,4,null,2,4,null,null,4]
		 * Output: [[2,4],[4]]
		 */
		TreeNode input = new TreeNode(1);
		input.left = new TreeNode(2);
		input.right = new TreeNode(3);
		input.left.left = new TreeNode(4);
		input.left.right = null;
		input.right.left = new TreeNode(2);
		input.right.right = new TreeNode(4);
		input.right.left.left = new TreeNode(4);
		
		TreeNode tmp;

		List<TreeNode> expectedOutput = new ArrayList<TreeNode>();
		tmp = new TreeNode(2);
		tmp.left = new TreeNode(4);
		expectedOutput.add(tmp);
		tmp = new TreeNode(4);
		expectedOutput.add(tmp);
		
		Solution solution = new Solution();
		List<TreeNode> output;

		output = solution.findDuplicateSubtreesRecursiveOnOn(input);
		LOGGER.info("O(n), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertTrue(expectedOutput.size() == output.size() &&
				expectedOutput.containsAll(output) &&
				output.containsAll(expectedOutput));
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: root = [2,1,1]
		 * Output: [[1]]
		 */
		TreeNode input = new TreeNode(2);
		input.left = new TreeNode(1);
		input.right = new TreeNode(1);
		
		TreeNode tmp;

		List<TreeNode> expectedOutput = new ArrayList<TreeNode>();
		tmp = new TreeNode(1);
		expectedOutput.add(tmp);
		
		Solution solution = new Solution();
		List<TreeNode> output;

		output = solution.findDuplicateSubtreesRecursiveOnOn(input);
		LOGGER.info("O(n), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertTrue(expectedOutput.size() == output.size() &&
				expectedOutput.containsAll(output) &&
				output.containsAll(expectedOutput));
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: root = [2,2,2,3,null,3,null]
		 * Output: [[2,3],[3]]
		 */
		TreeNode input = new TreeNode(2);
		input.left = new TreeNode(2);
		input.right = new TreeNode(2);
		input.left.left = new TreeNode(3);
		input.left.right = null;
		input.right.left = new TreeNode(3);
		input.right.right = null;
		
		TreeNode tmp;

		List<TreeNode> expectedOutput = new ArrayList<TreeNode>();
		tmp = new TreeNode(2);
		tmp.left = new TreeNode(3);
		expectedOutput.add(tmp);
		tmp = new TreeNode(3);
		expectedOutput.add(tmp);
		
		Solution solution = new Solution();
		List<TreeNode> output;

		output = solution.findDuplicateSubtreesRecursiveOnOn(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);

		LOGGER.info("Size: {} vs {}.", expectedOutput.size(), output.size());
		assertTrue(expectedOutput.size() == output.size() &&
				expectedOutput.containsAll(output) &&
				output.containsAll(expectedOutput));
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Example 4:
		 * Input: root = null
		 * Output: []
		 */
		TreeNode input = null;

		List<TreeNode> expectedOutput = new ArrayList<TreeNode>();
		
		Solution solution = new Solution();
		List<TreeNode> output;

		output = solution.findDuplicateSubtreesRecursiveOnOn(input);
		LOGGER.info("O(n), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertTrue(expectedOutput.size() == output.size() &&
				expectedOutput.containsAll(output) &&
				output.containsAll(expectedOutput));
	}
	
	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/*
		 * Test case
		 * Input: root = [0]
		 * Output: []
		 */
		TreeNode input = new TreeNode(0);

		List<TreeNode> expectedOutput = new ArrayList<TreeNode>();
		
		Solution solution = new Solution();
		List<TreeNode> output;

		output = solution.findDuplicateSubtreesRecursiveOnOn(input);
		LOGGER.info("O(n), O(n): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertTrue(expectedOutput.size() == output.size() &&
				expectedOutput.containsAll(output) &&
				output.containsAll(expectedOutput));
	}
}