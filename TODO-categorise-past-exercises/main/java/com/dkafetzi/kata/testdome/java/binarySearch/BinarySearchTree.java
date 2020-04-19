/*
 * https://www.testdome.com/d/java-interview-questions/4
 * 
 * 3. Binary Search Tree
 * Binary search tree (BST) is a binary tree where the value of each node
 * is larger or equal to the values in all the nodes in that node's left subtree
 * and is smaller than the values in all the nodes in that node's right subtree.
 * 
 * Write a function that checks if a given binary search tree contains a given value.
 * For example, for the following tree:
 *  n1 (Value: 1, Left: null, Right: null)
 *  n2 (Value: 2, Left: n1, Right: n3)
 *  n3 (Value: 3, Left: null, Right: null)
 *  
 *  Call to contains(n2, 3) should return true since a tree with root at n2 contains number 3.
 * 
 */
package com.dkafetzi.kata.testdome.java.binarySearch;

public class BinarySearchTree {

    public static boolean contains(Node root, int value, String method) {
    	
    	boolean result = false;
    	switch (method) {
    		case "recurse":
    			result = contains_recursively(root, value);
    			break;
    		case "iterate": 
    			result = contains_iteratively(root, value);
    			break;
    		default:
    			// Do nothing for now.
    			break;
    	}
    	
    	return result;
    }
    
    public static boolean contains_recursively(Node root, int value) {
        if (root == null) {
            return false;
        }
        
        /*
         * Do we have the value at root level?
         */
        if (root.value == value) {
        	return true;
        }
        
        if (value < root.value) {
	        return contains_recursively(root.left, value);
    	}
    	
    	return contains_recursively(root.right, value);
    }
    
    public static boolean contains_iteratively(Node root, int value) {
        if (root == null) {
            return false;
        }
        
        while (root != null) {
            
        	/*
             * Do we have the value at root level?
             */
            if (root.value == value) {
            	return true;
            }
        	
            if (value < root.value) {
    	        root = root.left;
        	}
        	
            if (value > root.value) {
    	        root = root.right;
        	}
        }
        
        return false;
    }
}