package com.dkafetzi.kata.hackerrank.isBinarySearchTree;

public class Node {
	public int id = -1;
	public int data;
	public Node[] Children;
	public Node right;
	public Node left;
	
	public Node(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Node[] getChildren() {
		return Children;
	}
	
	public void setChildren(Node[] Children) {
		this.Children = Children;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void setRight(Node Right) {
		this.right = Right;
		
		if (Right != null) {
			System.out.println(
				"node id: " + id + 
				", setting right to be : " + Right.getId()
			);
		}
	}
	
	public void addChild(Node child) {
		if (Children == null) {
			Children = new Node[1];
			Children[0] = child;

			return;
		}
		
		Node[] Children_new = new Node[Children.length + 1]; 
		
		for (int i = 0; i < Children.length; i++) {
			Children_new[i] = Children[i];
		}
		
		Children_new[Children.length] = child;
		Children = Children_new;
	}
}