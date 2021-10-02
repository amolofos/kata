package com.dkafetzi.kata;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode implements Cloneable { 
	
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
	public boolean equals (Object o) {		
        if (this == o)
        	return true;
        
		if (!(o instanceof TreeNode))
	    	return false;
	    
		TreeNode other = (TreeNode) o;

		if (this.val != other.val)
			return false;
		
		if ((this.left == null && other.left != null) || (this.left != null && other.left == null)) 
			return false;
		if (this.left != null && other.left != null && !this.left.equals(other.left))
			return false;
		
		if ((this.right == null && other.right != null) || (this.right != null && other.right == null)) 
			return false;
		if (this.right != null && other.right != null && !this.right.equals(other.right))
			return false;		

		return true;
	}
	
	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;

	    result = prime * this.val;
	    if (left != null)
	    	result = prime * result + left.hashCode();
	    
	    if (right != null)
	    	result = prime * result + right.hashCode();

	    return result;
	}

	@Override
	public String toString() {
		String str = this.val + "";
		
	    Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(this);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();

			if (node.left == null && node.right == null)
				continue;

			if (node.left != null) {
				str += ", " + node.left.val;
				queue.add(node.left);
			} else
				str += ", null";

			if (node.right != null) {
				str += ", " + node.right.val;
				queue.add(node.right);
			} else
				str += ", null";
		}

		return str;
	}
	
	@Override
	public TreeNode clone() {
		try {
			return (TreeNode) super.clone();
		} catch (Exception e) {
			return null;
		}
	}
}