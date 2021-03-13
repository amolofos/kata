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
		 * Input: [1, 3, 1, 4, 2, 3, 5, 4], 5
		 * Output: 6
		 * Explanation:
		 * We can split this tape in four places:
		 *  * 
		 *  * A[0] = 1
		 *  * A[1] = 3
		 *  * A[2] = 1
		 *  * A[3] = 4
		 *  * A[4] = 2
		 *  * A[5] = 3
		 *  * A[6] = 5
		 *  * A[7] = 4
		 * In second 6, a leaf falls into position 5. This is
		 * the earliest time when leaves appear in every
		 * position across the river.
		 */
		int[] input = {1, 3, 1, 4, 2, 3, 5, 4};
		int X = 5;
		int expectedOutput = 6;
		
		Solution solution = new Solution();
		int output = solution.solution(X, input);

		LOGGER.info("Input: {} & {}, Expected output: {}, Output: {}.", X, Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 2
		 * Input: [3]
		 * Output: -1
		 */
		int[] input = {3};
		int X = 5;
		int expectedOutput = -1;
		
		Solution solution = new Solution();
		int output = solution.solution(X, input);

		LOGGER.info("Input: {} & {}, Expected output: {}, Output: {}.", X, Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}	
}