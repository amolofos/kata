package com.dkafetzi.kata;

import java.util.Queue;
import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
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

	// We just run through the two trees at the same time, and merge each node.
    public TreeNode mergeTreesOn2(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
        	return null;
        
        if (root1 != null && root2 == null)
        	return root1;
        if (root1 == null && root2 != null)
        	return root2;
        
        // At this point we have two non null trees.
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();

        queue1.add(root1);
        queue2.add(root2);
		while (!queue1.isEmpty() || !queue2.isEmpty()) {
			TreeNode node1 = queue1.isEmpty() ? null : queue1.poll();
			TreeNode node2 = queue2.isEmpty() ? null : queue2.poll();

			node1.val += node2 == null ? 0 : node2.val;
			if (node1.left == null && node2.left != null)
				node1.left = node2.left;
			else if (node1.left != null && node2.left != null) {
				queue1.add(node1.left);
				queue2.add(node2.left);
			}
			if (node1.right == null && node2.right != null)
				node1.right = node2.right;
			else if (node1.right != null && node2.right != null) {
				queue1.add(node1.right);
				queue2.add(node2.right);
			}
		}
        
        return root1;
    }
}
