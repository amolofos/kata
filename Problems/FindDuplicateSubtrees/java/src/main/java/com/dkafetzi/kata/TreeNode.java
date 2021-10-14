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
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		
		if (obj == null)
			return false;
		
		if ((obj instanceof TreeNode) == false)
			return false;

		TreeNode other = (TreeNode) obj;

		if (this.val != other.val)
			return false;

		if (this.left != null && other.left == null)
			return false;
		if (this.left == null && other.left != null)
			return false;

		if (this.right != null && other.right == null)
			return false;
		if (this.right == null && other.right != null)
			return false;

		if (this.left != null && other.left != null && !this.left.equals(other.left))
			return false;
		if (this.right != null && other.right != null && !this.left.equals(other.right))
			return false;

		return true;
	}

	@Override
	public TreeNode clone() {
		TreeNode c = new TreeNode(this.val);

		if (this.left != null)
			c.left = this.left.clone();
		if (this.right != null)
			c.right = this.right.clone();

	return c;
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