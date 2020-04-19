package com.dkafetzi.kata.interviews.restricted.eunoia.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.interviews.restricted.eunoia.tree.Tree;

class TreeTest {

	@Test
	@DisplayName("Eunoia tree simple test")
	void testSimpleTree(TestInfo testInfo) {
		
		Tree tree;
		
		tree = new Tree("1(2,4,6) 2(3,9) 4(5, 7 ) 6(11,12) 5(13,16) 12(14,23,17) 16(24,32)");
		/*	
		assertEquals( 1, tree.getParentNodeOfId(2).getId(),  "Node  2 has parent  1.");
		assertEquals( 1, tree.getParentNodeOfId(4).getId(),  "Node  4 has parent  1.");
		assertEquals( 1, tree.getParentNodeOfId(6).getId(),  "Node  6 has parent  1.");
		assertEquals( 2, tree.getParentNodeOfId(3).getId(),  "Node  3 has parent  2.");
		assertEquals( 2, tree.getParentNodeOfId(9).getId(),  "Node  9 has parent  2.");
		assertEquals( 4, tree.getParentNodeOfId(5).getId(),  "Node  5 has parent  4.");
		assertEquals( 4, tree.getParentNodeOfId(7).getId(),  "Node  7 has parent  4.");
		assertEquals( 6, tree.getParentNodeOfId(11).getId(), "Node 11 has parent  6.");
		assertEquals( 6, tree.getParentNodeOfId(12).getId(), "Node 12 has parent  6.");
		assertEquals( 5, tree.getParentNodeOfId(13).getId(), "Node 13 has parent  5.");
		assertEquals( 5, tree.getParentNodeOfId(16).getId(), "Node 16 has parent  5.");
		assertEquals(12, tree.getParentNodeOfId(14).getId(), "Node 14 has parent 12.");
		assertEquals(12, tree.getParentNodeOfId(23).getId(), "Node 23 has parent 12.");
		assertEquals(12, tree.getParentNodeOfId(17).getId(), "Node 17 has parent 12.");
		assertEquals(16, tree.getParentNodeOfId(24).getId(), "Node 24 has parent 16.");
		assertEquals(16, tree.getParentNodeOfId(32).getId(), "Node 32 has parent 16.");
		*/
		assertTrue(tree.getLevelOfNodeWithId(1) == 5);
		assertTrue(tree.getLevelOfNodeWithId(4) == 4);
		assertTrue(tree.getLevelOfNodeWithId(5) == 3);
		assertTrue(tree.getLevelOfNodeWithId(12) == 3);
		assertTrue(tree.getLevelOfNodeWithId(16) == 2);
		assertTrue(tree.getLevelOfNodeWithId(23) == 2);
		assertTrue(tree.getLevelOfNodeWithId(32) == 1);
		
		
		
		tree = new Tree(" 2(5, 4, 3,1)  5(7)   3(9) 7(12, 10)   9(11, 14)  10(13) 13(16,8,15)");
		
		/*
		assertEquals( 2, tree.getParentNodeOfId(5).getId(),  "Node  5 has parent 2.");
		assertEquals( 2, tree.getParentNodeOfId(4).getId(),  "Node  4 has parent 2.");
		assertEquals( 2, tree.getParentNodeOfId(3).getId(),  "Node  3 has parent 2.");
		assertEquals( 2, tree.getParentNodeOfId(1).getId(),  "Node  1 has parent 2.");
		assertEquals( 5, tree.getParentNodeOfId(7).getId(),  "Node  7 has parent 5.");
		assertEquals( 3, tree.getParentNodeOfId(9).getId(),  "Node  9 has parent 3.");
		assertEquals( 7, tree.getParentNodeOfId(12).getId(), "Node 12 has parent 7.");
		assertEquals( 7, tree.getParentNodeOfId(10).getId(), "Node 10 has parent 7.");
		assertEquals( 9, tree.getParentNodeOfId(11).getId(), "Node 11 has parent 9.");
		assertEquals( 9, tree.getParentNodeOfId(14).getId(), "Node 14 has parent 9.");
		assertEquals(10, tree.getParentNodeOfId(13).getId(), "Node 13 has parent 10.");
		assertEquals(13, tree.getParentNodeOfId(16).getId(), "Node 16 has parent 13.");
		assertEquals(13, tree.getParentNodeOfId(8).getId(),  "Node  8 has parent 13.");
		assertEquals(13, tree.getParentNodeOfId(15).getId(), "Node 15 has parent 13.");
		*/
		assertTrue(tree.getLevelOfNodeWithId(2) == 6);
		assertTrue(tree.getLevelOfNodeWithId(5) == 5);
		assertTrue(tree.getLevelOfNodeWithId(3) == 5);
		assertTrue(tree.getLevelOfNodeWithId(12) == 3);
		assertTrue(tree.getLevelOfNodeWithId(11) == 3);
		assertTrue(tree.getLevelOfNodeWithId(13) == 2);
		assertTrue(tree.getLevelOfNodeWithId(8) == 1);

	}
}