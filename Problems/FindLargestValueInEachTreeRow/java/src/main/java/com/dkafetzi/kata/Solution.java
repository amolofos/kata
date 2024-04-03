package com.dkafetzi.kata;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public List<Integer> largestValuesOn2On(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		helper(root, result, 0);
		return result;
	}
	private void helper(TreeNode node, List<Integer> list, int level) {
		if (node == null)
			return;
		
		if (list.size() == level) {
			list.add(node.val);
		} else {
			int max = Math.max(list.get(level), node.val);
			list.set(level, max);
		}
		
		helper(node.left, list, level + 1);
		helper(node.right, list, level + 1);
	}

	public List<Integer> largestValuesOnOn(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		
		if (root == null)
			return result;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			int size = q.size();
			int max = Integer.MIN_VALUE;
			
			for (int i = 0; i < size; i++) {
				TreeNode curr = q.remove();
				max = Math.max(max, curr.val);
				
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
			
			result.add(max);
		}
		
		return result;
	}
}
