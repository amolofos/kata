package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3305/
 * 
 * Return the root node of a binary search tree that matches the given preorder traversal.
 * 
 * (Recall that a binary search tree is a binary tree where for every node, any descendant
 * of node.left has a value < node.val, and any descendant of node.right has a value > node.val.
 * Also recall that a preorder traversal displays the value of the node first, then traverses
 * node.left, then traverses node.right.)
 * 
 * Example 1:
 * Input: [8,5,1,7,10,12]
 * Output: [8,5,10,1,7,null,12]
 * 
 * Note: 
 *  1 <= preorder.length <= 100
 *  The values of preorder are distinct.
 * 
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Kata.class);

	public TreeNode bstFromPreorder(int[] preorder) {
		TreeNode root = null;

		if (preorder.length <= 0)
			return root;
		
		root = new TreeNode(preorder[0]);
		root.left = null;
		root.right = null;
		
		/*
		 * The input is a binary search tree presented
		 * to us in a depth first path.
		 * 
		 * Let's create the tree first.
		 */
		TreeNode parentTreeNode = root;
		for (int i = 1; i < preorder.length; i++) {
	    	LOGGER.debug("i: {}, preorder[{}]: {}", i, i, preorder[i]);
	    	
	    	
	    	
	    	
	    	
		}
		
		return root;
    }
}