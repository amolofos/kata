package com.dkafetzi.kata;

import java.util.Queue;
import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * //Definition for a Node.
 * class Node {
 *  public int val;
 *  public Node left;
 *  public Node right;
 *  public Node next;
 *
 *  public Node() {}
 *
 *  public Node(int _val) {
 *      val = _val;
 *  }
 *
 *  public Node(int _val, Node _left, Node _right, Node _next) {
 *      val = _val;
 *      left = _left;
 *      right = _right;
 *      next = _next;
 *  }
 * };
 */
class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	 public Node connect(Node root) {		 
		 if (root == null)
			 return root;
		 
		 Queue<Node> queue = new LinkedList<Node>();
		 queue.add(root);
		 int nextLevelNodes = 2;
		 int currentLevelNodes = 1;
		 Node rightNode = null;

		 while (!queue.isEmpty()) {
			 Queue<Node> queueNextLevel = new LinkedList<Node>();

			 Node leftNode = queue.poll();
			 LOGGER.info("currentLevelNodes: {}, nextLevelNodes: {}, leftNode: {}, rightNode: {}.", currentLevelNodes, nextLevelNodes, leftNode, rightNode);
			 
			 leftNode.next = rightNode;
			 rightNode = leftNode;

			 if (rightNode != null) {
				 queueNextLevel.add(rightNode.right);
				 queueNextLevel.add(rightNode.left);
			 }
			 if (leftNode != null) {
				 queueNextLevel.add(leftNode.right);
				 queueNextLevel.add(leftNode.left);
			 }
			 
			 if (Math.pow(2, currentLevelNodes) == nextLevelNodes) {
				 LOGGER.info("currentLevelNodes: {}, nextLevelNodes: {}, leftNode: {}, rightNode: {}.", currentLevelNodes, nextLevelNodes, leftNode, rightNode);

				 int tmp = nextLevelNodes;
				 nextLevelNodes = (int) Math.pow(2, currentLevelNodes);
				 currentLevelNodes = tmp;
				 queue = queueNextLevel;
				 
				 rightNode = null;
			 } else
				 currentLevelNodes++;
		 }

		 return root;
    }
}
