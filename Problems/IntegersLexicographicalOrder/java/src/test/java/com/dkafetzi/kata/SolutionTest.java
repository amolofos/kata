package com.dkafetzi.kata;

import static org.junit.Assert.assertArrayEquals;

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
		  * Input: 15 
		  * Output: 1 10 11 12 13 14 15 2 3 4 5 6 7 8 9
		 */
		int input = 15;
		int[] expectedOutput = {1, 10, 11, 12, 13, 14, 15, 2, 3, 4, 5, 6, 7, 8, 9};
		
		Solution solution = new Solution();
		int[] output;

		output = solution.integersLexicographicalOrderComparator(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);

		output = solution.integersLexicographicalOrder(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 2
		  * Input: 19 
		  * Output: 1 10 11 12 13 14 15 16 17 18 19 2 3 4 5 6 7 8 9 
		 */
		int input = 19;
		int[] expectedOutput = {1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2, 3, 4, 5, 6, 7, 8, 9};
		
		Solution solution = new Solution();
		int[] output;

		output = solution.integersLexicographicalOrderComparator(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);

		output = solution.integersLexicographicalOrder(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
}