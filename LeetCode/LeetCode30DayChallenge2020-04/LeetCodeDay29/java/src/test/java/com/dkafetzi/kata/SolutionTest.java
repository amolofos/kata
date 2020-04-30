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
		 * Input: [1,2,3]
		 *     1
		 *    / \
		 *   2   3
		 * Output: 6
		 */
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		Solution solution = new Solution();
		assertEquals(6, solution.maxPathSum(root));
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: [-10,9,20,null,null,15,7]
		 * 
		 *   -10
		 *   / \
		 *  9  20
		 *    /  \
		 *   15   7
		 * Output: 42
		 */
		TreeNode root = new TreeNode(-10);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		
		root.left.left = null;
		root.left.right = null;
		
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		Solution solution = new Solution();
		assertEquals(42, solution.maxPathSum(root));
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Test case
		 * Input: [2,-1]
		 * 
		 *    2
		 *   /
		 * -1
		 * Output: 2
		 */
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(-1);
		root.right = null;
		
		Solution solution = new Solution();
		assertEquals(2, solution.maxPathSum(root));
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Test case
		 * Input: [1,-2,-3,1,3,-2,null,-1]
		 * 
		 *          1
		 *       /     \
		 *     -2      -3
		 *     / \     /
		 *    1   3  -2
		 *   /
		 * -1
		 * Output: 3
		 */
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(-2);
		root.right = new TreeNode(-3);
		
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		root.right.left = new TreeNode(-2);
		root.right.right = null;
		
		root.left.left.left = new TreeNode(-1);
		root.left.left.right = null;

		root.left.right.left = null;
		root.left.right.right = null;
		
		Solution solution = new Solution();
		assertEquals(3, solution.maxPathSum(root));
	}
}