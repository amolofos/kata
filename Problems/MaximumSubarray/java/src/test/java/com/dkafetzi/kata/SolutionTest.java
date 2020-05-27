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
		 * Input: [-2,1,-3,4,-1,2,1,-5,4],
		 * Output: 6
		 * Explanation: [4,-1,2,1] has the largest sum = 6.
		 * 
		 */
		int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int expectedOutput = 6;
		
		Solution solution = new Solution();
		int output = solution.maxSubArray(input);
		
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input.toString(), expectedOutput, output);
				
		assertEquals(expectedOutput, output);	
	}
}