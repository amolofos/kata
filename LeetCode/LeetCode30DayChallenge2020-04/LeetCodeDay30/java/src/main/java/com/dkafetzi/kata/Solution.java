package com.dkafetzi.kata;

import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/532/week-5/3315/
 *
 * Given a binary tree where each path going from the root to any leaf form a valid sequence,
 * check if a given string is a valid sequence in such binary tree. We get the given string
 * from the concatenation of an array of integers arr and the concatenation of all values of
 * the nodes along a path results in a sequence in the given binary tree.
 * 
 * Example 1:
 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,0,1]
 * Output: true
 * Explanation: 
 *  The path 0 -> 1 -> 0 -> 1 is a valid sequence (green color in the figure). 
 * Other valid sequences are: 
 *  0 -> 1 -> 1 -> 0 
 *  0 -> 0 -> 0
 *  
 * Example 2:
 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,0,1]
 * Output: false 
 * Explanation: The path 0 -> 0 -> 1 does not exist, therefore it is not even a sequence.
 *  
 * Example 3:
 * Input: root = [0,1,0,0,1,0,null,null,1,0,0], arr = [0,1,1]
 * Output: false
 * Explanation: The path 0 -> 1 -> 1 is a sequence, but it is not a valid sequence.
 *  
 * Constraints:
 *  1 <= arr.length <= 5000
 *  0 <= arr[i] <= 9
 *  Each node's value is between [0 - 9].
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
	 * We try to solve this by doing a BFS.
	 * 
	 * Time  : O(nm), n the size of arr, m the maximum length of a level.
	 * Space : O(m), m the maximum length of a level.
	 */
    public boolean isValidSequence(TreeNode root, int[] arr) {
    	boolean result = false;
    	boolean noChildren = false;
    	Stack<TreeNode> stackCurrent = new Stack<TreeNode>();
    	Stack<TreeNode> stackNext = new Stack<TreeNode>();
    	
    	if (arr.length <= 0 && root == null)
    		return true;

    	if (arr.length <= 0 && root != null)
    		return false;
    	
    	if (arr.length > 0 && root == null)
    		return false;
    	
    	if (root.val != arr[0])
    		return false;
    	
    	stackCurrent.add(root);
    	int i = 0;
    	for (i = 0; i < arr.length; i++) {
    		result = false;
    		noChildren = false;

    		LOGGER.debug("i: {}, arr[i]: {}, result: {}, noChildren: {}, stackCurrent size: {}, stackNext size: {}.", i, arr[i], result, noChildren, stackCurrent.size(), stackNext.size());
    		
    		while (stackCurrent.isEmpty() == false) {
    			TreeNode currentNode = stackCurrent.pop();
    			
    			LOGGER.debug("i: {}, arr[i]: {}, current val: {}.", i, arr[i], currentNode.val);

    			if (currentNode.val != arr[i])
    				continue;
    			
    			result = true;
    			if (currentNode.left == null && currentNode.right == null)
    				noChildren = true;
    			
    			LOGGER.debug("i: {}, arr[i]: {}, current val: {}, noChildren: {}.", i, arr[i], currentNode.val, noChildren);
    			
    			if (currentNode.left != null)
    				stackNext.add(currentNode.left);
    			
    			if (currentNode.right != null)
    				stackNext.add(currentNode.right);
    		}
    		
			Stack<TreeNode> temp = stackCurrent;
			stackCurrent = stackNext;
			stackNext = temp;
			
    		LOGGER.debug("i: {}, arr[i]: {}, result: {}, noChildren: {}, stackCurrent size: {}, stackNext size: {}.", i, arr[i], result, noChildren, stackCurrent.size(), stackNext.size());
    		
    		if (result == false) {
    			break;
    		}
    	}

    	return result && noChildren;
    }
}