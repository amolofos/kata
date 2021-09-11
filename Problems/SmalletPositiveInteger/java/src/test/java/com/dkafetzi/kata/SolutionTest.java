package com.dkafetzi.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

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
		 * Input: [1, 3, 6, 4, 1, 2]
		 * Output: 5
		 */
		int[] input = {1, 3, 6, 4, 1, 2};
		int expectedOutput = 5;
		int output;
		Solution solution = new Solution();

		output = solution.solutionOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1000000(input);
		LOGGER.info("O(n)O(1000000): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1(input);
		LOGGER.info("O(n)O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: [1, 2, 3]
		 * Output: 4
		 */
		int[] input = {1, 2, 3};
		int expectedOutput = 4;
		int output;
		Solution solution = new Solution();

		output = solution.solutionOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1000000(input);
		LOGGER.info("O(n)O(1000000): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1(input);
		LOGGER.info("O(n)O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: [-1, -3]
		 * Output: 1
		 */
		int[] input = {-1, -3};
		int expectedOutput = 1;
		int output;
		Solution solution = new Solution();

		output = solution.solutionOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1000000(input);
		LOGGER.info("O(n)O(1000000): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1(input);
		LOGGER.info("O(n)O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");

		/*
		 * Example 4:
		 * Input: [1, 2, 3]
		 * Output: 4
		 */
		int[] input = {1, 2, 3};
		int expectedOutput = 4;
		int output;
		Solution solution = new Solution();

		output = solution.solutionOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1000000(input);
		LOGGER.info("O(n)O(1000000): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1(input);
		LOGGER.info("O(n)O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");

		/*
		 * Example 5:
		 * Input: [3, 4, -1, 1]
		 * Output: 2
		 */
		int[] input = {3, 4, -1, 1};
		int expectedOutput = 2;
		int output;
		Solution solution = new Solution();

		output = solution.solutionOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1000000(input);
		LOGGER.info("O(n)O(1000000): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1(input);
		LOGGER.info("O(n)O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}

	@Test
	@DisplayName("Simple test 6")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");

		/*
		 * Example 6:
		 * Input: [7, 8, 9, 11, 12]
		 * Output: 1
		 */
		int[] input = {7, 8, 9, 11, 12};
		int expectedOutput = 1;
		int output;
		Solution solution = new Solution();

		output = solution.solutionOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1000000(input);
		LOGGER.info("O(n)O(1000000): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1(input);
		LOGGER.info("O(n)O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 7")
	void testSolution7(TestInfo testInfo) {
		LOGGER.debug("Simple test 7");

		/*
		 * Test case:
		 * Input: too big.
		 * Output: 500001
		 */
		int[] input = {};
		int expectedOutput = 500001;
		int output;
		Solution solution = new Solution();
		
		try (Stream<String> lines = Files.lines(Path.of("src/test/resources/SmallestPositiveIntegerBigDataSet.data"))) {
			Stream<String> words = lines
					.flatMap(line -> Stream.of(line.split(",")))
					.filter(Objects::nonNull)
					.filter(Predicate.not(String::isEmpty));

			input = words.mapToInt(Integer::parseInt).toArray();
		} catch (Exception e) {
			LOGGER.error(e.toString());
		}
		LOGGER.info("Input size: {}.", input.length);

		/* 
		 * Too time consuming.
		 *
		 * output = solution.solutionOn2(input);
		 * LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input.length, expectedOutput, output);
		 * assertEquals(expectedOutput, output);
		 */
		
		output = solution.solutionOnO1000000(input);
		LOGGER.info("O(n)O(1000000): Input: {}, Expected output: {}, Output: {}.", input.length, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1(input);
		LOGGER.info("O(n)O(1): Input: {}, Expected output: {}, Output: {}.", input.length, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	@Test
	@DisplayName("Simple test 8")
	void testSolution8(TestInfo testInfo) {
		LOGGER.debug("Simple test 8");

		/*
		 * Test case:
		 * Input: [2147483647].
		 * Output: 1
		 */
		int[] input = {2147483647};
		int expectedOutput = 1;
		int output;
		Solution solution = new Solution();

		output = solution.solutionOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		/*
		 * We cannot use this method since the possible integers reach
		 * the maximum of an integer value.
		 * output = solution.solutionOnO1000000(input);
		 * LOGGER.info("O(n)O(1000000): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		 * assertEquals(expectedOutput, output);
		 */
		
		output = solution.solutionOnO1(input);
		LOGGER.info("O(n)O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
	
	
	@Test
	@DisplayName("Simple test 9")
	void testSolution9(TestInfo testInfo) {
		LOGGER.debug("Simple test 9");

		/*
		 * Example 9:
		 * Input: [1]
		 * Output: 2
		 */
		int[] input = {1};
		int expectedOutput = 2;
		int output;
		Solution solution = new Solution();

		output = solution.solutionOn2(input);
		LOGGER.info("O(n^2): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1000000(input);
		LOGGER.info("O(n)O(1000000): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
		
		output = solution.solutionOnO1(input);
		LOGGER.info("O(n)O(1): Input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}
