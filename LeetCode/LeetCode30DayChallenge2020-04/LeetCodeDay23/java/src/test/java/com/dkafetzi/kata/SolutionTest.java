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
	void testRangeBitwiseAnd1(TestInfo testInfo) {
		LOGGER.debug("Simple test 1");

		Solution solution = new Solution();
		/*
		 * Example 1:
		 * Input: [5,7]
		 * Output: 4
		 */
		int n = 5;
		int m = 7;
		int expectedOutput = 4;
		int output = solution.rangeBitwiseAndBruteForce(n, m);
	
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.rangeBitwiseAnd(n, m);
		
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}


	@Test
	@DisplayName("Simple test 2")
	void testRangeBitwiseAnd2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		Solution solution = new Solution();
		/*
		 * Example 2:
		 * Input: [0,1]
		 * Output: 0
		 */
		int n = 0;
		int m = 1;
		int expectedOutput = 0;
		int output = solution.rangeBitwiseAndBruteForce(n, m);
	
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.rangeBitwiseAnd(n, m);
			
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	
	@Test
	@DisplayName("Simple test 3")
	void testRangeBitwiseAnd3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		Solution solution = new Solution();
		/*
		 * Test case
		 * Input: [2147483646,2147483647]
		 * Output: 2147483646
		 */
		int n = 2147483646;
		int m = 2147483647;
		int expectedOutput = 2147483646;
		int output = solution.rangeBitwiseAndBruteForce(n, m);
	
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.rangeBitwiseAnd(n, m);
			
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	
	@Test
	@DisplayName("Simple test 4")
	void testRangeBitwiseAnd4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		Solution solution = new Solution();
		/*
		 * Test case
		 * Input: [20000, 2147483647]
		 * Output: 0
		 */
		int n = 20000;
		int m = 2147483647;
		int expectedOutput = 0;
		int output;
		
		output = solution.rangeBitwiseAndBruteForce(n, m);
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.rangeBitwiseAnd(n, m);
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.rangeBitwiseAndLargestLength(n, m);
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	
	@Test
	@DisplayName("Simple test 5")
	void testRangeBitwiseAnd5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		Solution solution = new Solution();
		/*
		 * Test case
		 * Input: [1, 1]
		 * Output: 1
		 */
		int n = 1;
		int m = 1;
		int expectedOutput = 1;
		int output;

		output = solution.rangeBitwiseAndBruteForce(n, m);
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.rangeBitwiseAnd(n, m);
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
			
		output = solution.rangeBitwiseAndLargestLength(n, m);
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	

	@Test
	@DisplayName("Simple test 6")
	void testRangeBitwiseAnd6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		Solution solution = new Solution();
		/*
		 * Test case
		 * Input: [1, 2]
		 * Output: 0
		 */
		int n = 1;
		int m = 2;
		int expectedOutput = 0;
		int output;
	
		output = solution.rangeBitwiseAndBruteForce(n, m);
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.rangeBitwiseAnd(n, m);
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
			
		output = solution.rangeBitwiseAndLargestLength(n, m);
		LOGGER.debug("Input n: {}, m: {}, expectedOutput: {}, output: {}", n, m, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}