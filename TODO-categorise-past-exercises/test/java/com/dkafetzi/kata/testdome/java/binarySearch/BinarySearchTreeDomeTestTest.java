package com.dkafetzi.kata.testdome.java.binarySearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.testdome.java.binarySearch.BinarySearchTree;
import com.dkafetzi.kata.testdome.java.binarySearch.Node;

class BinarySearchTreeDomeTestTest {

	@Test
	@DisplayName("Binary Search tree Testdome test")
	void testDomeTest(TestInfo testInfo) {
		
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
	
		assertEquals(true, BinarySearchTree.contains(n2, 3, "iterate"), "n2 contains 3.");		
	}
}