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

		/* Example 1
		 * Input: [7,1,5,3,6,4]
		 * Output: 5
		 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
		 *              Not 7-1 = 6, as selling price needs to be larger than buying price.
		 * 
		 */
		int[] input = {7, 1, 5, 3, 6, 4};
		int expectedOutput = 5;
		
		Solution solution = new Solution();
		int output = solution.maxProfitOnePass(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitBruteForce(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 2
		 * Input: [7,6,4,3,1]
		 * Output: 0
		 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
		 * 
		 */
		int[] input = {7, 6, 4, 3, 1};
		int expectedOutput = 0;
		
		Solution solution = new Solution();
		int output = solution.maxProfitOnePass(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.maxProfitBruteForce(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}