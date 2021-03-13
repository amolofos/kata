package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
		 * Input: [3, 4, 4, 6, 1, 4, 4], 5
		 * Output: [3, 2, 2, 4, 2]
		 * Explanation:
		 * The values of the counters after each consecutive operation will be:
		 *  (0, 0, 1, 0, 0)
		 *  (0, 0, 1, 1, 0)
		 *  (0, 0, 1, 2, 0)
		 *  (2, 2, 2, 2, 2)
		 *  (3, 2, 2, 2, 2)
		 *  (3, 2, 2, 3, 2)
		 *  (3, 2, 2, 4, 2)
		 */
		int[] input = {3, 4, 4, 6, 1, 4, 4};
		int N = 5;
		int[] expectedOutput = {3, 2, 2, 4, 2};
		
		Solution solution = new Solution();
		int[] output = solution.solution(N, input);

		LOGGER.info("Input: {} & {}, Expected output: {}, Output: {}.", N, Arrays.toString(input), Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(expectedOutput, output);
	}
}