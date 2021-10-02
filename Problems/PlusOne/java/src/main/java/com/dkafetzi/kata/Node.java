package com.dkafetzi.kata;

import java.util.LinkedList;
import java.util.Queue;

public class Node implements Cloneable { 
	
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val   = _val;
        left  = _left;
        right = _right;
        next  = _next;
    }
	
	@Override
	public boolean equals (Object o) {		
        if (this == o)
        	return true;
        
		if (!(o instanceof Node))
	    	return false;
	    
		Node other = (Node) o;

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
		
		if ((this.next == null && other.next != null) || (this.next != null && other.next == null)) 
			return false;
		if (this.next != null && other.next != null && !this.next.equals(other.next))
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
	    
	    if (next != null)
	    	result = prime * result + next.hashCode();

	    return result;
	}

	@Override
	public String toString() {
		String str = this.val + "";
		
	    Queue<Node> queue = new LinkedList<Node>();
		queue.add(this);
		while (!queue.isEmpty()) {
			Node node = queue.poll();

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
			
			if (node.next != null) {
				str += ", " + node.next.val;
			} else
				str += ", null";
		}

		return str;
	}
	
	@Override
	public Node clone() {
		Node clone = null;
		
		try {
			clone = (Node) super.clone();
			if (this.left != null)
				clone.left = this.left.clone();
			if (this.right != null)
				clone.right = this.right.clone();
		} catch(Exception e) {}
		
		return clone;
	}
}