package com.dkafetzi.kata;

import static org.junit.Assert.assertArrayEquals;

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
		 * Input:  [3, 8, 9, 7, 6], 3  
		 * Output: [9, 7, 6, 3, 8]
		 * 
		 */
		int[] inputArr = {3, 8, 9, 7, 6};
		int[] inputArrTmp = Arrays.copyOf(inputArr, inputArr.length);
		int inputRot = 3;
		int[] expectedOutput = {9, 7, 6, 3, 8};
		
		Solution solution = new Solution();
		int[] output = solution.solution(inputArr, inputRot);

		LOGGER.info("Input: {} & {}, Expected output: {}, Output: {}.", Arrays.toString(inputArrTmp), inputRot, Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(output, expectedOutput);
	}

	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/* Example 2
		 * Input:  [0, 0, 0], 1  
		 * Output: [0, 0, 0]
		 * 
		 */
		int[] inputArr = {0, 0, 0};
		int[] inputArrTmp = Arrays.copyOf(inputArr, inputArr.length);;
		int inputRot = 1;
		int[] expectedOutput = {0, 0, 0};
		
		Solution solution = new Solution();
		int[] output = solution.solution(inputArr, inputRot);

		LOGGER.info("Input: {} & {}, Expected output: {}, Output: {}.", Arrays.toString(inputArrTmp), inputRot, Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(output, expectedOutput);
	}

	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/* Example 3
		 * Input:  [1, 2, 3, 4], 4  
		 * Output: [1, 2, 3, 4]
		 * 
		 */
		int[] inputArr = {1, 2, 3, 4};
		int[] inputArrTmp = Arrays.copyOf(inputArr, inputArr.length);;
		int inputRot = 4;
		int[] expectedOutput = {1, 2, 3, 4};
		
		Solution solution = new Solution();
		int[] output = solution.solution(inputArr, inputRot);

		LOGGER.info("Input: {} & {}, Expected output: {}, Output: {}.", Arrays.toString(inputArrTmp), inputRot, Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(output, expectedOutput);
	}

	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/* Example 4
		 * Input:  [9, 7, 3, 6, 9, 0], 2  
		 * Output: [9, 0, 9, 7, 3, 6]
		 * 
		 */
		int[] inputArr = {9, 7, 3, 6, 9, 0};
		int[] inputArrTmp = Arrays.copyOf(inputArr, inputArr.length);;
		int inputRot = 2;
		int[] expectedOutput = {9, 0, 9, 7, 3, 6};
		
		Solution solution = new Solution();
		int[] output = solution.solution(inputArr, inputRot);

		LOGGER.info("Input: {} & {}, Expected output: {}, Output: {}.", Arrays.toString(inputArrTmp), inputRot, Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(output, expectedOutput);
	}

	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/* Example 5
		 * Input:  [1, 1, 2, 3, 5], 42
		 * Output: [3, 5, 1, 1, 2]
		 * 
		 */
		int[] inputArr = {1, 1, 2, 3, 5};
		int[] inputArrTmp = Arrays.copyOf(inputArr, inputArr.length);;
		int inputRot = 42;
		int[] expectedOutput = {3, 5, 1, 1, 2};
		
		Solution solution = new Solution();
		int[] output = solution.solution(inputArr, inputRot);

		LOGGER.info("Input: {} & {}, Expected output: {}, Output: {}.", Arrays.toString(inputArrTmp), inputRot, Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(output, expectedOutput);
	}

	@Test
	@DisplayName("Simple test 6")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		/* Example 6
		 * Input:  [1, 2, 3, 4, 5, 6, 7], 2
		 * Output: [6, 7, 1, 2, 3, 4, 5]
		 * 
		 */
		int[] inputArr = {1, 2, 3, 4, 5, 6, 7};
		int[] inputArrTmp = Arrays.copyOf(inputArr, inputArr.length);;
		int inputRot = 2;
		int[] expectedOutput = {6, 7, 1, 2, 3, 4, 5};
		
		Solution solution = new Solution();
		int[] output = solution.solution(inputArr, inputRot);

		LOGGER.info("Input: {} & {}, Expected output: {}, Output: {}.", Arrays.toString(inputArrTmp), inputRot, Arrays.toString(expectedOutput), Arrays.toString(output));
		assertArrayEquals(output, expectedOutput);
	}
}