package LeetCodeDay11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* 
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3293/
 * 
 * Diameter of Binary Tree
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 * 
 * Example:
 * Given a binary tree
 *           1
 *          / \
 *         2   3
 *        / \     
 *       4   5    
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 * 
 * Note: The length of path between two nodes is represented by the number of edges between them. 
 * 
 */
public class LeetCodeDay11 {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public static void main(String[] argv) {
		LeetCodeDay11 solution = new LeetCodeDay11();
		
		System.out.println("Result: " + solution.diameterOfBinaryTreeWrapperTest1());
		System.out.println("Output: 3");
		
		System.out.println("Result: " + solution.diameterOfBinaryTreeWrapperTest2());
		System.out.println("Output: 6");
		
	}
	
	public int diameterOfBinaryTreeWrapperTest1() {
		/*           1
		 *          / \
		 *         2   3
		 *        / \     
		 *       4   5    
		 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
		 */
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
	
		return diameterOfBinaryTree(root);
	}
	
	public int diameterOfBinaryTreeWrapperTest2() {
		/* The following tree is invalid as a binary one,
		 * however the actual values do not matter in this
		 * problem.
		 *             1
		 *          /     \
		 *         2       3
		 *       /   \    / \ 
		 *      4     5  13 14
		 *     / \   / \
		 *    8   9 6   7
		 *   /         / \
		 *  10        11 12
		 * 
		 * Return 6.
		 */
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(14);
		root.left.left.left = new TreeNode(8);
		root.left.left.right = new TreeNode(9);
		root.left.right.left = new TreeNode(6);
		root.left.right.right = new TreeNode(7);
		root.left.left.left.left = new TreeNode(10);
		root.left.right.right.left = new TreeNode(11);
		root.left.right.right.right = new TreeNode(12);
		
		return diameterOfBinaryTreeDFS(root);
	}
	
	// DBS
	public int diameterOfBinaryTreeDFS(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
    	HashMap<Integer, Integer> weight = new HashMap<Integer, Integer>();
        ArrayList<TreeNode> leaves = new ArrayList<TreeNode>();
        
    	int result = 0;
        
        if (root.left == null && root.right == null) {
        	return result;
        }
        
        int runningWeight = 1;
        stack.add(root);
        while (!stack.isEmpty()) {
        	TreeNode currentNode = stack.pop();
        	
        	if (currentNode.left != null) {
        		stack.add(currentNode.left);
        	}
        	
        	if (currentNode.right != null) {
        		stack.add(currentNode.right);
        	}
        	
        	if (currentNode.left == null && currentNode.right == null) {
        		leaves.add(currentNode);
        		weight.put(currentNode.val, runningWeight);
        	}
        	
        	runningWeight++;
        	System.out.println("Node: " + currentNode.val);
        }
        
        for (int i = 0; i < leaves.size(); i++) {
        	System.out.println("i: " + i + ", Leaf: " + leaves.get(i).val);
        }
        for (Integer i : weight.keySet()) {
        	System.out.println("i: " + i + ", Weight: " + weight.get(i));
        }

        return result;
    }
	
	// BFS
    public int diameterOfBinaryTreeBFS(TreeNode root) {
    	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    	HashMap<Integer, Integer> weight = new HashMap<Integer, Integer>();
        ArrayList<TreeNode> leaves = new ArrayList<TreeNode>();
        
    	int result = 0;
        
        if (root.left == null && root.right == null) {
        	return result;
        }
        
        int runningWeight = 1;
        queue.add(root);
        while (!queue.isEmpty()) {
        	TreeNode currentNode = queue.pop();
        	
        	if (currentNode.left != null) {
        		queue.add(currentNode.left);
        	}
        	
        	if (currentNode.right != null) {
        		queue.add(currentNode.right);
        	}
        	
        	if (currentNode.left == null && currentNode.right == null) {
        		leaves.add(currentNode);
        		weight.put(currentNode.val, runningWeight);
        	}
        	
        	runningWeight++;
        	System.out.println("Node: " + currentNode.val);
        }
        
        for (int i = 0; i < leaves.size(); i++) {
        	System.out.println("i: " + i + ", Leaf: " + leaves.get(i).val);
        }
        for (Integer i : weight.keySet()) {
        	System.out.println("i: " + i + ", Weight: " + weight.get(i));
        }

        return result;
    }
}