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
		 * Input: text1 = "abcde", text2 = "ace" 
		 * Output: 3  
		 * Explanation: The longest common subsequence is "ace" and its length is 3.
		 */
		String str1 = "abcde";
		String str2 = "ace";
		int expectedOuput = 3;
		Solution solution = new Solution();
		int output;
		
		output = solution.longestCommonSubsequenceBruteForce(str1, str2);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", str1 + " & " + str2, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: text1 = "abc", text2 = "abc"
		 * Output: 3
		 * Explanation: The longest common subsequence is "abc" and its length is 3.
		 * 
		 * Example 3:
		 * Input: text1 = "abc", text2 = "def"
		 * Explanation: There is no such common subsequence, so the result is 0.
		 * Output: 0
		 */
		String str1 = "abc";
		String str2 = "abc";
		int expectedOuput = 3;
		Solution solution = new Solution();
		int output;
		
		output = solution.longestCommonSubsequenceBruteForce(str1, str2);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", str1 + " & " + str2, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/* 
		 * Example 3:
		 * Input: text1 = "abc", text2 = "def"
		 * Explanation: There is no such common subsequence, so the result is 0.
		 * Output: 0
		 */
		String str1 = "abc";
		String str2 = "def";
		int expectedOuput = 0;
		Solution solution = new Solution();
		int output;
		
		output = solution.longestCommonSubsequenceBruteForce(str1, str2);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", str1 + " & " + str2, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/* 
		 * Test case
		 * Input: text1 = "bsbininm", text2 = "jmjkbkjkv"
		 * Output: 1
		 */
		String str1 = "bsbininm";
		String str2 = "jmjkbkjkv";
		int expectedOuput = 1;
		Solution solution = new Solution();
		int output;
		
		output = solution.longestCommonSubsequenceBruteForce(str1, str2);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", str1 + " & " + str2, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
	
	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/* 
		 * Test case
		 * Input: text1 = "hofubmnylkra", text2 = "pqhgxgdofcvmr"
		 */
		String str1 = "hofubmnylkra";
		String str2 = "pqhgxgdofcvmr";
		int expectedOuput = 5;
		Solution solution = new Solution();
		int output;
		
		output = solution.longestCommonSubsequenceBruteForce(str1, str2);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", str1 + " & " + str2, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
}