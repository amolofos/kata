package com.dkafetzi.kata.hackerrank.isBinarySearchTree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dkafetzi.kata.KataSettings;
@Service
public class IsBinarySearchTree {

	private final static Logger LOGGER = LoggerFactory.getLogger(IsBinarySearchTree.class);
	
	@Autowired
	private KataSettings settings;
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = true;
    
    /*
     * https://www.hackerrank.com/challenges/is-binary-search-tree/problem
     * The Node class is defined as follows:
     *   class Node {
     *     int data;
     *     Node left;
     *     Node right;
     *   }
    */
	static boolean checkBST(Node root) {
        boolean isBinarySearchTree = false;
        
        if (root.left != null && root.left.data > root.data)
        	return isBinarySearchTree;
        
        if (root.right != null && root.right.data < root.data)
        	return isBinarySearchTree;

        // Go left
        if (root.left != null && !checkBST(root.left, root.data))
        	return isBinarySearchTree;

        // Go right
        if (root.right != null && !checkBST(root.right, root.data))
        	return isBinarySearchTree;
        
        return true;
	}
	
	static boolean checkBST(Node root, int parentData) {
        boolean isBinarySearchTree = false;
		
        if (root.left != null && (root.left.data > root.data || root.left.data > parentData))
        	return isBinarySearchTree;
        
        if (root.right != null && (root.right.data < root.data || root.right.data < parentData))
        	return isBinarySearchTree;
        		
        // Go left
        if (root.left != null && !checkBST(root.left, root.data))
        	return isBinarySearchTree;

        // Go right
        if (root.right != null && !checkBST(root.right, root.data))
        	return isBinarySearchTree;
        
        return true;
	}

	static boolean checkBST(String input) {
        boolean isBinarySearchTree = false;    
		
        return isBinarySearchTree;
	}
}