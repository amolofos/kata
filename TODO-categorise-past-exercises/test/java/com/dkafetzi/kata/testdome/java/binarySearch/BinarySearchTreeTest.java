package com.dkafetzi.kata.testdome.java.binarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.testdome.java.binarySearch.BinarySearchTree;
import com.dkafetzi.kata.testdome.java.binarySearch.Node;

class BinarySearchTreeTest {

	@Test
	@DisplayName("Testdome binary search treetest")
	void testSimpleBinarySearchTree(TestInfo testInfo) {
		
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
	
		assertEquals(true, BinarySearchTree.contains(n2, 3, "recurse"), "Recurse: n2 contains 3.");
		assertEquals(true, BinarySearchTree.contains(n2, 3, "iterate"), "Iterate: n2 contains 3.");
		
	}
	
	@Test
	@DisplayName("Binary Search tree with zero left part")
	void testZeroLeftBinarySearchTree(TestInfo testInfo) {
		
        Node n1 = new Node(0, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
	
		assertEquals(true, BinarySearchTree.contains(n2, 3, "recurse"), "Recurse: n2 contains 3.");
		assertEquals(true, BinarySearchTree.contains(n2, 3, "iterate"), "Iterate: n2 contains 3.");
	}
	
	@Test
	@DisplayName("Binary Search tree with zero head")
	void testZeroRootBinarySearchTree(TestInfo testInfo) {
		
        Node n1 = new Node(0, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(0, n1, n3);
	
		assertEquals(true, BinarySearchTree.contains(n2, 3, "recurse"), "Recurse: n2 contains 3.");
		assertEquals(true, BinarySearchTree.contains(n2, 3, "iterate"), "n2 contains 3.");
	}
	
	@Test
	@DisplayName("Binary Search tree with two levels")
	void testTwoLevelBinarySearchTree(TestInfo testInfo) {
		/*
		 * 
		 *       7
		 *     -- -- 
		 *    2     9
		 *  -- -- -- --
		 *  1   3 8   10
		 *  
		 */
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        Node n8 = new Node(8, null, null);
        Node n10 = new Node(10, null, null);
        Node n9 = new Node(9, n8, n10);
        
        Node n7 = new Node(7, n2, n9);
        
		assertEquals(true, BinarySearchTree.contains(n2,  3, "recurse"), "Recurse: n2 contains 3.");
		assertEquals(true, BinarySearchTree.contains(n2,  3, "iterate"), "Iterate: n2 contains 3.");
		assertEquals(true, BinarySearchTree.contains(n9,  8, "recurse"), "Recurse: n9 contains 8.");
		assertEquals(true, BinarySearchTree.contains(n9,  8, "iterate"), "Iterate: n9 contains 8.");
		
		assertEquals(true, BinarySearchTree.contains(n7, 10, "recurse"), "Recurse: n7 contains 10.");
		assertEquals(true, BinarySearchTree.contains(n7, 10, "iterate"), "Iterate: n7 contains 20.");
		assertEquals(true, BinarySearchTree.contains(n7,  2, "recurse"), "Recurse: n7 contains 2.");
		assertEquals(true, BinarySearchTree.contains(n7,  2, "iterate"), "Iterate: n7 contains 2.");
	}
}