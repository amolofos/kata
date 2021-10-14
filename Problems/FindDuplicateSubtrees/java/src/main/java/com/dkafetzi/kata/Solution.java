package com.dkafetzi.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	/*
	 * We aim to parse the tree BFS and keep track of the elements
	 * seen. 
	 */
	public List<TreeNode> findDuplicateSubtreesRecursiveOnOn(TreeNode root) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		
		if (root == null || (root.left == null && root.right == null))
			return result;
		
		Map<String, Integer> hashes = new HashMap<>();
		traversePreOrder(root, result, hashes);
		
		return result;
	}

	private String traversePreOrder(TreeNode node, List<TreeNode> list, Map<String, Integer> map) {
		String key = "";
		
		if (node == null)
			return key;

		key = node.val +
				"l" + traversePreOrder(node.left, list, map) +
				"r" + traversePreOrder(node.right, list, map);

		int count = map.getOrDefault(key, 0) + 1;
		if (count == 2)
			list.add(node);

		map.put(key, count);
		
		return key;
	}
}
