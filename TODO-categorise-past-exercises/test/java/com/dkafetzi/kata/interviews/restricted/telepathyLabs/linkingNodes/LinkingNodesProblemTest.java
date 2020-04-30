package com.dkafetzi.kata.interviews.restricted.telepathyLabs.linkingNodes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class LinkingNodesProblemTest {

	@Test
	@DisplayName("Telepathy Labs linking nodes simple test")
	void testSimpleLinkingNodes(TestInfo testInfo) {
		
		/*
		 *           1 (root)
		 *              |
		 *        ------ -------
		 *       |      |       |
		 *       2 -->  3  -->  4
		 *       |              |
		 *     -- --            |
		 *    |     |           |
		 *    5 --> 6    -->    7
		 */
		
		/*
		// Create the tree.
		Node child1 = new Node(1);
		Node child2 = new Node(2);
		Node child3 = new Node(3);
		Node child4 = new Node(4);
		Node child5 = new Node(5);
		Node child6 = new Node(6);
		Node child7 = new Node(7);
		
		child2.addChild(child5);
		child2.addChild(child6);
		
		child4.addChild(child7);
		
		child1.addChild(child2);
		child1.addChild(child3);
		child1.addChild(child4);
		
		LinkingNodesProblem givenTree = new LinkingNodesProblem(child1);
		
		//givenTree.printTreeDefinition();
		givenTree.setNodesRightProperty();
		givenTree.printTreeDefinition();
		
		assertEquals(3, child2.getRight(), "Child 2 should be on left of 3.");
		assertEquals(4, child3.getRight(), "Child 3 should be on left of 4.");
		assertEquals(5, child4.getRight(), "Child 4 should be on left of 5.");
		assertEquals(6, child5.getRight(), "Child 5 should be on left of 6.");
		*/
	}
}