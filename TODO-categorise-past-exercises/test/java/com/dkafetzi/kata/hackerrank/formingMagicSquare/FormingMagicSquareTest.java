package com.dkafetzi.kata.hackerrank.formingMagicSquare;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.hackerrank.formingMagicSquare.FormingMagicSquare;

class FormingMagicSquareTest {

	@Disabled("Explicitly Disabled")
	@Test
	@DisplayName("Simple test")
	void testSimple(TestInfo testInfo) {
		int actual_result = 0;
		int expected_result = 0;
		int[][] input;

		input = new int [][] {
			{4, 8, 2},
			{4, 5, 7},
			{6, 1, 6}
		};
		expected_result = 4;
		actual_result = FormingMagicSquare.formingMagicSquare(input);
		assertEquals(expected_result, actual_result, "Wrong answer.");

		input = new int [][] {
			{4, 9, 2},
			{3, 5, 7},
			{8, 1, 5}
		};
		expected_result = 1;
		actual_result = FormingMagicSquare.formingMagicSquare(input);
		assertEquals(expected_result, actual_result, "Wrong answer.");


		input = new int [][] {
			{5, 3, 4},
			{1, 5, 8},
			{6, 4, 2}
		};
		expected_result = 7;
		actual_result = FormingMagicSquare.formingMagicSquare(input);
		assertEquals(expected_result, actual_result, "Wrong answer.");
	}

}
