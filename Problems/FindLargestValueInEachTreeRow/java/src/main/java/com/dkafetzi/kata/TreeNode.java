package com.dkafetzi.kata;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		String s = "[";
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();

		q.add(this);
		while (!q.isEmpty()) {
			TreeNode curr = (TreeNode) q.remove();
			
			if (curr == null)
				s += " null,";
			else {
				s += curr.val + ",";
				q.add(curr.left);
				q.add(curr.right);
			}
		}
		s += "]";
		
		return s;
	}
  }