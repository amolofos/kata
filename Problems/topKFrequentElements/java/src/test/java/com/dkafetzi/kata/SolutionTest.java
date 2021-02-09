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

		/* Example 1:
		 * Input: nums = [1,1,1,2,2,3], k = 2
		 * Output: [1,2]
		 */
		int[] input = {1, 1, 1, 2, 2, 3};
		int k = 2;
		int[] expectedOutput = {1, 2};
		
		Solution solution = new Solution();
		int[] output;
		
		output = solution.topKFrequentElements(input, k);
		LOGGER.info("Input: {}, k: {}, Expected output: {}, Output: {}.", input.toString(), k, expectedOutput, output.toString());
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 2:
		 * Input: nums = [1], k = 1
		 * Output: [1]
		 */
		int[] input = {1};
		int k = 1;
		int[] expectedOutput = {1};
		
		Solution solution = new Solution();
		int[] output;
		
		output = solution.topKFrequentElements(input, k);
		LOGGER.info("Input: {}, k: {}, Expected output: {}, Output: {}.", input.toString(), k, expectedOutput, output.toString());
		assertArrayEquals(expectedOutput, output);
	}
}