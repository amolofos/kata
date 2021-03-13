package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

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
		 * Input:  [9, 3, 9, 3, 9, 7, 9]  
		 * Output: 7
		 * Explanation:
		 *  the elements at indexes 0 and 2 have value 9,
		 *  the elements at indexes 1 and 3 have value 3,
		 *  the elements at indexes 4 and 6 have value 9,
		 *  the element at index 5 has value 7 and is unpaired.
		 * 
		 */
		int[] input = {9, 3, 9, 3, 9, 7, 9};
		int expectedOutput = 7;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}