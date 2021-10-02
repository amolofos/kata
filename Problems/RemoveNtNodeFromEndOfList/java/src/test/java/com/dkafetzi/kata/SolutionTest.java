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
		 * Input: head = [1,2,3,4,5], n = 2
		 * Output: [1,2,3,5]
		 */
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);

		ListNode input;
		int n = 2;
		ListNode expectedOutput = null;
		ListNode output;
		Solution solution = new Solution();

		input = node1.clone();
		output = solution.removeNthFromEndPass2(input, n);
		LOGGER.info("Input: {}, n: {},  Expected output: {}, Output: {}.", input, n, expectedOutput, output);
		assertEquals(expectedOutput, output.next.next.next.next);
		assertEquals(5, output.next.next.next.val);

		input = node1.clone();
		output = solution.removeNthFromEndPass1(input, n);
		LOGGER.info("Input: {}, n: {}, Expected output: {}, Output: {}.", input, n, expectedOutput, output);
		assertEquals(expectedOutput, output.next.next.next.next);
		assertEquals(5, output.next.next.next.val);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: head = [1], n = 1
		 * Output: []
		 */
		ListNode node1 = new ListNode(1);

		ListNode input;
		int n = 1;
		ListNode expectedOutput = null;
		ListNode output;
		Solution solution = new Solution();

		input = node1.clone();
		output = solution.removeNthFromEndPass2(input, n);
		LOGGER.info("Input: {}, n: {},  Expected output: {}, Output: {}.", input, n, expectedOutput, output);
		assertEquals(expectedOutput, output);

		input = node1.clone();
		output = solution.removeNthFromEndPass1(input, n);
		LOGGER.info("Input: {}, n: {}, Expected output: {}, Output: {}.", input, n, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 2:
		 * Input: head = [1,2], n = 1
		 * Output: [1]
		 */
		ListNode node2 = new ListNode(2);
		ListNode node1 = new ListNode(1, node2);

		ListNode input;
		int n = 1;
		ListNode expectedOutput = null;
		ListNode output;
		Solution solution = new Solution();

		input = node1.clone();
		output = solution.removeNthFromEndPass2(input, n);
		LOGGER.info("Input: {}, n: {},  Expected output: {}, Output: {}.", input, n, expectedOutput, output);
		assertEquals(expectedOutput, output.next);
		assertEquals(1, output.val);

		input = node1.clone();
		output = solution.removeNthFromEndPass1(input, n);
		LOGGER.info("Input: {}, n: {}, Expected output: {}, Output: {}.", input, n, expectedOutput, output);
		assertEquals(expectedOutput, output.next);
		assertEquals(1, output.val);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Test case:
		 * Input: head = [1,2], n = 2
		 * Output: [2]
		 */
		ListNode node2 = new ListNode(2);
		ListNode node1 = new ListNode(1, node2);

		ListNode input;
		int n = 2;
		ListNode expectedOutput = null;
		ListNode output;
		Solution solution = new Solution();

		input = node1.clone();
		output = solution.removeNthFromEndPass2(input, n);
		LOGGER.info("Input: {}, n: {},  Expected output: {}, Output: {}.", input, n, expectedOutput, output);
		assertEquals(expectedOutput, output.next);
		assertEquals(2, output.val);

		input = node1.clone();
		output = solution.removeNthFromEndPass1(input, n);
		LOGGER.info("Input: {}, n: {}, Expected output: {}, Output: {}.", input, n, expectedOutput, output);
		assertEquals(expectedOutput, output.next);
		assertEquals(2, output.val);
	}
}
