	package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class SolutionTest {

	private final static Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);

	@Test
	@DisplayName("Simple test 1")
	void testSolution1(TestInfo testInfo) {
		LOGGER.debug("Simple test 1");

		/*
		 * Example 1:
		 * Input: head = [1,2,3,4,5]
		 * Output: [3,4,5]
		 */
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		
		ListNode input = node1;
		String expectedOutput = "3";
		ListNode output;
		Solution solution = new Solution();
		
		output = solution.middleNode(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output.toString());
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: head = [1,2,3,4,5,6]
		 * Output: [4,5,6]
		 */
		ListNode node6 = new ListNode(6);
		ListNode node5 = new ListNode(5, node6);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		
		ListNode input = node1;
		String expectedOutput = "4";
		ListNode output;
		Solution solution = new Solution();
		
		output = solution.middleNode(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output.toString());
	}
}
