package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

		/*
		 * Example 1:
		 * Input: image = [[1,1,1],[1,1,0],[1,0,1]]
		 * sr = 1,
		 * sc = 1,
		 * newColor = 2
		 * Output: [[2,2,2],[2,2,0],[2,0,1]]
		 */
		int[][] inputOrig = {
				{1, 1, 1},
				{1, 1, 0},
				{1, 0, 1}
		};
		int sr = 1;
		int sc = 1;
		int newColor = 2;
		int[][] expectedOutput = {
				{2, 2, 2},
				{2, 2, 0},
				{2, 0, 1}
		};;
		
		int[][] input = inputOrig.clone();
		int[][] output;
		Solution solution = new Solution();

		output = solution.floodFill(input, sr, sc, newColor);
		LOGGER.info("Input: {}, sr: {}, sc: {}, newColor: {}, Expected output: {}, Output: {}.", inputOrig, sr, sc, newColor, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: image = [[0,0,0],[0,0,0]]
		 * sr = 0,
		 * sc = 0,
		 * newColor = 2
		 * Output: [[2,2,2],[2,2,2]]
		 */
		int[][] inputOrig = {
				{0, 0, 0},
				{0, 0, 0}
		};
		int sr = 0;
		int sc = 0;
		int newColor = 2;
		int[][] expectedOutput = {
				{2, 2, 2},
				{2, 2, 2}
		};;
		
		int[][] input = inputOrig.clone();
		int[][] output;
		Solution solution = new Solution();

		output = solution.floodFill(input, sr, sc, newColor);
		LOGGER.info("Input: {}, sr: {}, sc: {}, newColor: {}, Expected output: {}, Output: {}.", inputOrig, sr, sc, newColor, expectedOutput, output);
		assertArrayEquals(expectedOutput, output);
	}
}
