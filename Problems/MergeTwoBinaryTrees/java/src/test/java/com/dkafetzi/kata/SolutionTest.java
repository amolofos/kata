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
		 * Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
		 * Output: [3,4,5,5,4,null,7]
		 */
		TreeNode input1 = new TreeNode(1);
		input1.left = new TreeNode(3);
		input1.right = new TreeNode(2);
		input1.left.left = new TreeNode(5);

		TreeNode input2 = new TreeNode(2);
		input2.left = new TreeNode(1);
		input2.right = new TreeNode(3);
		input2.left.right = new TreeNode(4);
		input2.right.right = new TreeNode(7);
		
		TreeNode expectedOutput = new TreeNode(3);
		expectedOutput.left = new TreeNode(4);
		expectedOutput.right = new TreeNode(5);
		expectedOutput.left.left = new TreeNode(5);
		expectedOutput.left.right = new TreeNode(4);
		expectedOutput.right.right = new TreeNode(7);
		
		Solution solution = new Solution();
		TreeNode output;

		output = solution.mergeTreesOn2(input1.clone(), input2.clone());
		LOGGER.info("O(n): Input1: [{}], Input2: [{}], Expected output: [{}], Output: [{}].", input1.clone(), input2.clone(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: root1 = [1], root2 = [1, 2]
		 * Output: [2, 2]
		 */
		TreeNode input1 = new TreeNode(1);

		TreeNode input2 = new TreeNode(1);
		input2.left = new TreeNode(2);
		
		TreeNode expectedOutput = new TreeNode(2);
		expectedOutput.left = new TreeNode(2);
		
		Solution solution = new Solution();
		TreeNode output;

		output = solution.mergeTreesOn2(input1.clone(), input2.clone());
		LOGGER.info("O(n): Input1: [{}], Input2: [{}], Expected output: [{}], Output: [{}].", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}