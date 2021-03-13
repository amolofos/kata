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
		 * Input: [3, 2, 6, -1, 4, 5, -1, 2]
		 * Output: 17
		 * Explanation:
		 * The array
		 *   A[0] = 3
		 *   A[1] = 2
		 *   A[2] = 6
		 *   A[3] = -1
		 *   A[4] = 4
		 *   A[5] = 5
		 *   A[6] = -1
		 *   A[7] = 2
		 * contains the following example double slices:
		 *   double slice (0, 3, 6), sum is 2 + 6 + 4 + 5 = 17,
		 *   double slice (0, 3, 7), sum is 2 + 6 + 4 + 5 − 1 = 16,
		 *   double slice (3, 4, 5), sum is 0.
		 */
		int[] input = {3, 2, 6, -1, 4, 5, -1, 2};
		int expectedOutput = 17;
		
		Solution solution = new Solution();
		int output;
		
		output = solution.solutionOn2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOn3(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 2
		 * Input: [3, 2, 6]
		 * Output: 0
		 */
		int[] input = {3, 2, 6};
		int expectedOutput = 0;
		
		Solution solution = new Solution();
		int output;
		
		output = solution.solutionOn2(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.solutionOn3(input);
		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}