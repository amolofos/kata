package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/532/week-5/3314/
 *
 * Given a non-empty binary tree, find the maximum path sum.
 * For this problem, a path is defined as any sequence of nodes
 * from some starting node to any node in the tree along the parent-child
 * connections. The path must contain at least one node and does not need
 * to go through the root.
 *
 * Example 1:
 * Input: [1,2,3]
 *     1
 *    / \
 *   2   3
 * Output: 6
 *
 * Example 2:
 * Input: [-10,9,20,null,null,15,7]
 *
 *   -10
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * Output: 42
 *
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);
	
	/*
	 * Time  : O(n), where n is the number of tree nodes. 
	 * Space : O(1), just the space to store the maximum value.
	 */
    public int maxPathSum(TreeNode root) {
		int result = Integer.MIN_VALUE;
		
		int leftMax = Integer.MIN_VALUE;
		int rightMax = Integer.MIN_VALUE;
		
		if (root.left == null && root.right == null)
			return root.val;
		
		if (root.left != null) {
			leftMax = maxPathSum(root.left);
			if (leftMax > result)
				result = leftMax;
			
			if (root.val + leftMax > result)
				result = root.val + leftMax;
		}
		
		if (root.right != null) {
			rightMax = maxPathSum(root.right);
			
			if (rightMax > result)
				result = rightMax;
			
			if (root.val + rightMax > result)
				result = root.val + rightMax;
		}
		
		if (root.left != null && root.right != null)
			if (root.val + leftMax + rightMax > result)
				result = root.val + leftMax + rightMax;

        if (root.val > result)
			result = root.val;

		return result;
    }
}