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
		 * input = [2, 3, 1, 5, 4]
		 * k-th = 2
		 * output = [5, 4]
		 */
		int[] input = {2, 3, 1, 5, 4};
		int k = 2;
		int[] expectedOutput = {5, 4};
		
		Solution solution = new Solution();
		int[] output = solution.kthLargestValueBuiltInSort(input, k);

		LOGGER.info("Input: {}, k: {}, Expected output: {}, Output: {}.", input.toString(), k, expectedOutput, output.toString());
		assertArrayEquals(expectedOutput, output);

		output = solution.kthLargestValueNoBuiltInSort(input, k);
		LOGGER.info("Input: {}, k: {}, Expected output: {}, Output: {}.", input.toString(), k, expectedOutput, output.toString());
		assertArrayEquals(expectedOutput, output);
	}
}