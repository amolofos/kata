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
		 * Input: root = [1,2,3,4,5,6,7]
		 * Output: [1,#,2,3,#,4,5,6,7,#]
		 */
		Node input = new Node(1);
		input.left = new Node(2);
		input.right = new Node(3);
		input.left.left =  new Node(4);
		input.left.right =  new Node(5);		
		input.right.left = new Node(6);
		input.right.right = new Node(7);

		Node expectedOutput = input.clone();
		// #2 --> #3.
		expectedOutput.left.next = expectedOutput.right;
		// #4 --> #5.
		expectedOutput.left.left.next = expectedOutput.left.right;
		// #5 --> #6
		expectedOutput.left.right.next = expectedOutput.right.left;
		// #6 --> #7.
		expectedOutput.right.left.next = expectedOutput.right.right;

		Solution solution = new Solution();
		Node output;

		output = solution.connect(input.clone());
		LOGGER.info("O(n): Input: [{}], Expected output: [{}], Output: [{}].", input.clone(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: root = []
		 * Output: []
		 */
		Node input = null;
		
		Node expectedOutput = null;
		
		Solution solution = new Solution();
		Node output;

		output = solution.connect(input);
		LOGGER.info("O(n): Input: [{}], Expected output: [{}], Output: [{}].", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Test case:
		 * Input: root = [-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13]
		 * Output: [-1,#,0,1,#,2,3,4,5,#,6,7,8,9,10,11,12,13,#]
		 */
		Node input = new Node(-1);
		input.left = new Node(0);
		input.right = new Node(1);
		input.left.left =  new Node(2);
		input.left.right =  new Node(3);		
		input.right.left = new Node(4);
		input.right.right = new Node(5);
		input.left.left.left = new Node(6);
		input.left.left.right = new Node(7);
		input.left.right.left = new Node(8);
		input.left.right.right = new Node(9);
		input.right.left.left = new Node(10);
		input.right.left.right = new Node(11);
		input.right.right.left = new Node(12);
		input.right.right.right = new Node(13);
		
		Node expectedOutput = input.clone();
		// #0 --> #1.
		expectedOutput.left.next = expectedOutput.right;
		// #2 --> #3.
		expectedOutput.left.left.next = expectedOutput.left.right;
		// #3 --> #4
		expectedOutput.left.right.next = expectedOutput.right.left;
		// #4 --> #5.
		expectedOutput.right.left.next = expectedOutput.right.right;
		// #6 --> #7.
		expectedOutput.left.left.left.next = expectedOutput.left.left.right;
		// #7 --> #8.
		expectedOutput.left.left.right.next = expectedOutput.left.right.left;
		// #8 --> #9.
		expectedOutput.left.right.left.next = expectedOutput.left.right.right;
		// #9 --> #10.
		expectedOutput.left.right.right.next = expectedOutput.right.left.left;
		// #10 --> #11.
		expectedOutput.right.left.left.next = expectedOutput.right.left.right;
		// #11 --> #12.
		expectedOutput.right.left.right.next = expectedOutput.right.right.left;
		// #12 --> #13.
		expectedOutput.right.right.left.next = expectedOutput.right.right.right;
		
		Solution solution = new Solution();
		Node output;

		output = solution.connect(input.clone());
		LOGGER.info("O(n): Input: [{}], Expected output: [{}], Output: [{}].", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		LOGGER.info("expectedOutput.right.left.next: {}", output.right.left.next);
		LOGGER.info("expectedOutput.right.right.left.next: {}", output.right.right.left.next);
	}
}