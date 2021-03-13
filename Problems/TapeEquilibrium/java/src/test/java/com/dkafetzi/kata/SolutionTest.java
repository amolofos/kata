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
		 * Input: [3, 1, 2, 4, 3]
		 * Output: 1
		 * Explanation:
		 * We can split this tape in four places:
		 *   P = 1, difference = |3 − 10| = 7
		 *   P = 2, difference = |4 − 9| = 5
		 *   P = 3, difference = |6 − 7| = 1
		 *   P = 4, difference = |10 − 3| = 7 
		 */
		int[] input = {3, 1, 2, 4, 3};
		int expectedOutput = 1;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}	

	
	@Test
	@DisplayName("Double element")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 2
		 * Input: [1, 2]
		 * Output: 1
		 */
		int[] input = {1, 2};
		int expectedOutput = 1;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Full array")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/* Example 3
		 * Input: [....] size is 100000.
		 * We start for -1000 to 1000 and repeat until we reach 100000 elements.
		 * Output: 0
		 */
		int[] input = new int[100000];
		int expectedOutput = 0;
		
		int everyTwoThousandAndOne = -1000;
		for (int i = 0; i < 100000; i++) {
			input[i] = everyTwoThousandAndOne;
			
			if (everyTwoThousandAndOne == 1000) {
				everyTwoThousandAndOne = -1000;
			}
			everyTwoThousandAndOne++;
		}
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: array from 1...100000, Expected output: {}, Output: {}.", expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/* Example 4
		 * Input: [1, 1, 3]
		 * Output: 1
		 */
		int[] input = {1, 1, 3};
		int expectedOutput = 1;
	
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", Arrays.toString(input), expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}