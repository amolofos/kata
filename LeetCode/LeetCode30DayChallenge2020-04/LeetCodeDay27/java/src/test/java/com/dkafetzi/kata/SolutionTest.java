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
		 * Example:
		 * Input: 
		 *  1 0 1 0 0
		 *  1 0 1 1 1
		 *  1 1 1 1 1
		 *  1 0 0 1 0
		 * Output: 4
		 */
		char[][] input = {
				{'1', '0', '1', '0', '0'},
				{'1', '0', '1', '1', '1'},
				{'1', '1', '1', '1', '1'},
				{'1', '0', '0', '1', '0'}	
		};
		int expectedOuput = 4;
		
		Solution solution = new Solution();
		int output;
		
		output = solution.maximalSquareBruteForce(input);
		LOGGER.debug("Input: {}, expectedOuput: {}, output: {}.", input, expectedOuput, output);
		assertEquals(expectedOuput, output);
	}
}