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
		 * Input: [2, 3, 1, 5]
		 * Output: 4
		 * Explanation:
		 *   The function should return 4, as it is the missing element.
		 */
		int[] input = {2, 3, 1, 5};
		int expectedOutput = 4;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Empty list")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 2
		 * Input: []
		 * Output: 1
		 */
		int[] input = {};
		int expectedOutput = 1;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("First element missing")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/* Example 3
		 * Input: [2, 3, 5, 4]
		 * Output: 1
		 */
		int[] input = {2, 3, 5, 4};
		int expectedOutput = 1;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Last element missing")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/* Example 4
		 * Input: [2, 3, 1, 4]
		 * Output: 5
		 */
		int[] input = {2, 3, 1, 4};
		int expectedOutput = 5;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Single element")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/* Example 5
		 * Input: [2]
		 * Output: 1
		 */
		int[] input = {2};
		int expectedOutput = 1;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Double element")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		/* Example 6
		 * Input: [1, 2]
		 * Output: 3
		 */
		int[] input = {1, 2};
		int expectedOutput = 3;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Full array")
	void testSolution7(TestInfo testInfo) {
		LOGGER.debug("Simple test 7");

		/* Example 6
		 * Input: [1, ..., 100000]
		 * Output: 100001
		 */
		int[] input = new int[100000];
		int expectedOutput = 100001;
		
		for (int i = 0; i < 100000; i++) {
			input[i] = i+1;
		}
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: array from 1...100000, Expected output: {}, Output: {}.", expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}