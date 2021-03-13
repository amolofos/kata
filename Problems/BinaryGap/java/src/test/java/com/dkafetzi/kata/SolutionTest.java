package com.dkafetzi.kata;

import static org.junit.Assert.assertEquals;

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
		 * Input: 9
		 * Output: 2
		 * Explanation: number 9 has binary representation 1001 and contains a binary gap of length 2.
		 * 
		 */
		int input = 9;
		int expectedOutput = 2;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 2
		 * Input: 529
		 * Output: 4
		 * Explanation: The number 529 has binary representation 1000010001
		 * and contains two binary gaps: one of length 4 and one of length 3. 
		 * 
		 */
		int input = 529;
		int expectedOutput = 4;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/* Example 3
		 * Input: 20
		 * Output: 1
		 * Explanation: The number 20 has binary representation 10100
		 * and contains one binary gap of length 1. 
		 * 
		 */
		int input = 20;
		int expectedOutput = 1;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/* Example 4
		 * Input: 15
		 * Output: 0
		 * Explanation: The number 15 has binary representation
		 * 1111 and has no binary gaps. 
		 * 
		 */
		int input = 15;
		int expectedOutput = 0;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/* Example 5
		 * Input: 32
		 * Output: 0
		 * Explanation: The number 32 has binary representation 100000
		 * and has no binary gaps.
		 * 
		 */
		int input = 32;
		int expectedOutput = 0;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 6")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		/* Example 6
		 * Input: 1041
		 * Output: 5
		 * Explanation: given N = 1041 the function should return 5,
		 * because N has binary representation 10000010001 and so
		 * its longest binary gap is of length 5. 
		 * 
		 */
		int input = 1041;
		int expectedOutput = 5;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 7")
	void testSolution7(TestInfo testInfo) {
		LOGGER.debug("Simple test 7");

		/* Example 7
		 * Input: 1073741825
		 * Output: 29
		 * Explanation: 1000000000000000000000000000001
		 * 
		 */
		int input = 1073741825;
		int expectedOutput = 29;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 8")
	void testSolution8(TestInfo testInfo) {
		LOGGER.debug("Simple test 8");

		/* Example 8
		 * Input: 1610612737
		 * Output: 28
		 * Explanation: 1100000000000000000000000000001
		 * 
		 */
		int input = 1610612737;
		int expectedOutput = 28;
		
		Solution solution = new Solution();
		int output = solution.solution(input);

		LOGGER.info("Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}