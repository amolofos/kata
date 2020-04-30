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
		 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,0,1]
		 * Output: true
		 * Explanation: 
		 *  The path 0 -> 1 -> 0 -> 1 is a valid sequence (green color in the figure). 
		 * Other valid sequences are: 
		 *  0 -> 1 -> 1 -> 0 
		 *  0 -> 0 -> 0
		 */
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(0);
		
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(1);
		
		root.right.left = new TreeNode(0);
		root.right.right = null;
		
		root.left.left.left = null;
		root.left.left.right = new TreeNode(1);
		
		root.left.right.left = new TreeNode(0);
		root.left.right.right = new TreeNode(0);
		
		int[] validSequence = {0, 1, 0, 1};
		boolean expectedOutput = true;
		
		Solution solution = new Solution();
		assertEquals(expectedOutput, solution.isValidSequence(root, validSequence));	
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,0,1]
		 * Output: false 
		 * Explanation: The path 0 -> 0 -> 1 does not exist, therefore it is not even a sequence.
		 *  
		 */
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(0);
		
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(1);
		
		root.right.left = new TreeNode(0);
		root.right.right = null;
		
		root.left.left.left = null;
		root.left.left.right = new TreeNode(1);
		
		root.left.right.left = new TreeNode(0);
		root.left.right.right = new TreeNode(0);
		
		int[] validSequence = {0, 0, 1};
		boolean expectedOutput = false;
		
		Solution solution = new Solution();
		assertEquals(expectedOutput, solution.isValidSequence(root, validSequence));	
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,1]
		 * Output: false
		 * Explanation: The path 0 -> 1 -> 1 is a sequence, but it is not a valid sequence.
		 *  
		 */
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(0);
		
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(1);
		
		root.right.left = new TreeNode(0);
		root.right.right = null;
		
		root.left.left.left = null;
		root.left.left.right = new TreeNode(1);
		
		root.left.right.left = new TreeNode(0);
		root.left.right.right = new TreeNode(0);
		
		int[] validSequence = {0, 1, 1};
		boolean expectedOutput = false;
		
		Solution solution = new Solution();
		assertEquals(expectedOutput, solution.isValidSequence(root, validSequence));	
	}
}