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
		 * Input: [-3, 1, 2, -2, 5, 6]
		 * Output: 60
		 * Explanation:
		 * The array contains the following example triplets:
		 *  * 
		 *  * (0, 1, 2), product is −3 * 1 * 2 = −6
		 *  * (1, 2, 4), product is 1 * 2 * 5 = 10
		 *  * (2, 4, 5), product is 2 * 5 * 6 = 60
		 */
		int[] input = {-3, 1, 2, -2, 5, 6};
		int expectedOutput = 60;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Minimum size or array")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 2
		 * Input: [2, 5, 3]
		 * Output: 30
		 */
		int[] input = {2, 5, 3};
		int expectedOutput = 30;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/* Example 3
		 * Input: [-5, 5, -5, 4]
		 * Output: 125
		 */
		int[] input = {-5, 5, -5, 4};
		int expectedOutput = 125;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}