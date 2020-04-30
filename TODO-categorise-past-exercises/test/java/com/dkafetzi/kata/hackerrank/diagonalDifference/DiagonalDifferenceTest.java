package com.dkafetzi.kata.hackerrank.diagonalDifference;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.hackerrank.diagonalDifference.DiagonalDifference;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

class DiagonalDifferenceTest {

	@Test
	@DisplayName("Simple tests")
	void testSimple(TestInfo testInfo) {
		String path_base = "hackerrank/diagonalDifference/testFiles/";
		ArrayList<String> testCases = new ArrayList<String>();
		testCases.add("testCase1");
		
		String input;
		String output;
		String expected_output;

		for (int i = 0; i < testCases.size(); i++) {
			try {
				System.out.println("Test: " + testCases.get(i));
				
				input = Resources.toString(Resources.getResource(path_base + testCases.get(i) + "_input.txt"), Charsets.UTF_8);
				expected_output = Resources.toString(Resources.getResource(path_base + testCases.get(i) + "_output.txt"), Charsets.UTF_8).trim();
					
				output = String.valueOf(DiagonalDifference.diagonalDifference(input));
			} catch (IOException e) {
				output = "Match";
				expected_output = "Do not match";
			}

			assertEquals(expected_output, output, "Strings do not patch.");
		}
	}
}