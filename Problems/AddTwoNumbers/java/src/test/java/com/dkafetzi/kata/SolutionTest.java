package com.dkafetzi.kata;

import static org.junit.Assert.assertEquals;

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
		 * Input: Input: l1 = [2,4,3], l2 = [5,6,4]
		 * Output: [7,0,8]
		 */
		ListNode input1 = new ListNode(2);
		input1.next = new ListNode(4);
		input1.next.next = new ListNode(3);

		ListNode input2 = new ListNode(5);
		input2.next = new ListNode(6);
		input2.next.next = new ListNode(4);
		
		ListNode expectedOutput = new ListNode(7);
		expectedOutput.next = new ListNode(0);
		expectedOutput.next.next = new ListNode(8);
		
		Solution solution = new Solution();
		ListNode output;

		output = solution.addTwoNumbersOnOn(input1.clone(), input2.clone());
		LOGGER.info("O(n), O(n): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.addTwoNumbersOnO1(input1.clone(), input2.clone());
		LOGGER.info("O(n), O(1): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: Input: l1 = [0], l2 = [0]
		 * Output: [0]
		 */
		ListNode input1 = new ListNode(0);
		ListNode input2 = new ListNode(0);
		ListNode expectedOutput = new ListNode(0);
		
		Solution solution = new Solution();
		ListNode output;

		output = solution.addTwoNumbersOnOn(input1.clone(), input2.clone());
		LOGGER.info("O(n), O(n): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.addTwoNumbersOnO1(input1.clone(), input2.clone());
		LOGGER.info("O(n), O(1): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
		 * Output: [8,9,9,9,0,0,0,1]
		 */
		ListNode input1 = new ListNode(9);
		input1.next = new ListNode(9);
		input1.next.next = new ListNode(9);
		input1.next.next.next = new ListNode(9);
		input1.next.next.next.next = new ListNode(9);
		input1.next.next.next.next.next = new ListNode(9);
		input1.next.next.next.next.next.next = new ListNode(9);

		ListNode input2 = new ListNode(9);
		input2.next = new ListNode(9);
		input2.next.next = new ListNode(9);
		input2.next.next.next = new ListNode(9);
		
		ListNode expectedOutput = new ListNode(8);
		expectedOutput.next = new ListNode(9);
		expectedOutput.next.next = new ListNode(9);
		expectedOutput.next.next.next = new ListNode(9);
		expectedOutput.next.next.next.next = new ListNode(0);
		expectedOutput.next.next.next.next.next = new ListNode(0);
		expectedOutput.next.next.next.next.next.next = new ListNode(0);
		expectedOutput.next.next.next.next.next.next.next = new ListNode(1);
		
		Solution solution = new Solution();
		ListNode output;

		output = solution.addTwoNumbersOnOn(input1.clone(), input2.clone());
		LOGGER.info("O(n), O(n): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.addTwoNumbersOnO1(input1.clone(), input2.clone());
		LOGGER.info("O(n), O(1): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Example 4:
		 * Input: Input: l1 = [2,4,9], l2 = [5,6,4,9]
		 * Output: [7,0,4,0,1]
		 */
		ListNode input1 = new ListNode(2);
		input1.next = new ListNode(4);
		input1.next.next = new ListNode(9);

		ListNode input2 = new ListNode(5);
		input2.next = new ListNode(6);
		input2.next.next = new ListNode(4);
		input2.next.next.next = new ListNode(9);
		
		ListNode expectedOutput = new ListNode(7);
		expectedOutput.next = new ListNode(0);
		expectedOutput.next.next = new ListNode(4);
		expectedOutput.next.next.next = new ListNode(0);
		expectedOutput.next.next.next.next = new ListNode(1);
		
		Solution solution = new Solution();
		ListNode output;

		output = solution.addTwoNumbersOnOn(input1.clone(), input2.clone());
		LOGGER.info("O(n), O(n): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.addTwoNumbersOnO1(input1.clone(), input2.clone());
		LOGGER.info("O(n), O(1): Input1: {}, Input2: {}, Expected output: {}, Output: {}.", input1, input2, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}