package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		 * Input: 10, 85, 30
		 * Output: 3
		 * Explanation:
		 *   after the first jump, at position 10 + 30 = 40
		 *   after the second jump, at position 10 + 30 + 30 = 70
		 *   after the third jump, at position 10 + 30 + 30 + 30 = 100
		 */
		int inputX = 10;
		int inputY = 85;
		int inputD = 30;
		int expectedOutput = 3;
		
		Solution solution = new Solution();
		int output = solution.solution(inputX, inputY, inputD);

		LOGGER.info("Input: {}, {} & {}, Expected output: {}, Output: {}.", inputX, inputY, inputD, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}