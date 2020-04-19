package com.dkafetzi.kata;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class SolutionTest {

	@Test
	@DisplayName("Simple test")
	void testSimpleTree(TestInfo testInfo) {
		/*
		 * Example 1:
		 * Input: [8,5,1,7,10,12]
		 * Output: [8,5,10,1,7,null,12]
		 */ 
		Solution solution = new Solution();
		int[] input = {8, 5, 1, 7, 10, 12};
		TreeNode output = solution.bstFromPreorder(input);
		
		TreeNode expectedOutput = new TreeNode(8);
		expectedOutput.left = new TreeNode(5);
		expectedOutput.right = new TreeNode(10);
		expectedOutput.left.left = new TreeNode(1);
		expectedOutput.left.right = new TreeNode(7);
		expectedOutput.right.left = null;
		expectedOutput.right.right = new TreeNode(12);
		
		compareTreeNode(output, expectedOutput);
	}
	
	private void compareTreeNode(TreeNode output, TreeNode expectedOutput) {
		if (output == null && expectedOutput != null)
			assertEquals(1, 0);
		if (output != null && expectedOutput == null)
			assertEquals(1, 0);
		
		assertEquals(output.val, expectedOutput.val);
		
		Stack<TreeNode> stackOutput = new Stack<TreeNode>();
		Stack<TreeNode> stackExpectedOutput = new Stack<TreeNode>();
		
		stackOutput.push(output);
		stackExpectedOutput.push(expectedOutput);
		while (!stackOutput.isEmpty() || !stackExpectedOutput.isEmpty()) {
			TreeNode currentOutput = stackOutput.pop();
			TreeNode currentExpectedOutput = stackExpectedOutput.pop();
			
			assertEquals(currentOutput.val, currentExpectedOutput.val);

			if(currentOutput.left != null)
				stackOutput.push(currentOutput.left);
			if(currentOutput.right != null)
				stackOutput.push(currentOutput.right);
			
			if(currentExpectedOutput.left != null)
				stackExpectedOutput.push(currentExpectedOutput.left);
			if(currentExpectedOutput.right != null)
				stackExpectedOutput.push(currentExpectedOutput.right);
		}
	}

}