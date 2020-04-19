package com.dkafetzi.kata.testdome.java.twoSum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.testdome.java.twoSum.TwoSum;

class TwoSumTest {

	@Test
	@DisplayName("Two Sum simple test")
	void testSimpleList(TestInfo testInfo) {
	
		int[] list = new int[] { 3, 1, 5, 7, 5, 9 };
		int sum = 10;
		
		int[] indices = TwoSum.findTwoSum(list, sum);
		assertNotNull(indices, "list should not be null");
		
		boolean result = false;
		Arrays.sort(indices);
		if (
			(Arrays.binarySearch(indices, 0) >= 0 && Arrays.binarySearch(indices, 3) >= 0) ||
			(Arrays.binarySearch(indices, 1) >= 0 && Arrays.binarySearch(indices, 5) >= 0)
		) {
			result = true;
		}

		assertEquals(true, result, "Indices pair is not the correct one.");
	}

	@Test
	@DisplayName("Two Sum distinct numbers with solutions")
	void testDistinctNumbersWithSolutions(TestInfo testInfo) {
	
		int[] list = new int[] { 3, 1, 5, 7, 6, 9 };
		int sum = 10;
		
		int[] indices = TwoSum.findTwoSum(list, sum);
		
		assertNotNull(indices, "list should not be null");
		
		boolean result = false;
		Arrays.sort(indices);
		if (
			(Arrays.binarySearch(indices, 0) >= 0 && Arrays.binarySearch(indices, 3) >= 0) ||
			(Arrays.binarySearch(indices, 1) >= 0 && Arrays.binarySearch(indices, 5) >= 0)
		) {
			result = true;
		}

		assertEquals(true, result, "Indices pair is not the correct one.");
	}
	
	@Test
	@DisplayName("Two Sum distinct numbers no solution")
	void testDistinctNumbersNoSolution(TestInfo testInfo) {
	
		int[] list = new int[] { 3, 1, 5, 8, 4, 0 };
		int sum = 10;
		
		int[] indices = TwoSum.findTwoSum(list, sum);
		
		assertNull(indices, "list should be null");
	}
	
	@Test
	@DisplayName("Two Sum duplicate numbers with solutions at the begining")
	void testDuplicateNumbersWithSolutionsAtBegin(TestInfo testInfo) {
	
		int[] list = new int[] { 5, 5, 3, 1, 7, 9 };
		int sum = 10;
		
		int[] indices = TwoSum.findTwoSum(list, sum);
		assertNotNull(indices, "list should not be null");
		
		boolean result = false;
		Arrays.sort(indices);
		if (
			(Arrays.binarySearch(indices, 2) >= 0 && Arrays.binarySearch(indices, 4) >= 0) ||
			(Arrays.binarySearch(indices, 3) >= 0 && Arrays.binarySearch(indices, 5) >= 0)
		) {
			result = true;
		}

		assertEquals(true, result, "Indices pair is not the correct one.");		
	}

	@Test
	@DisplayName("Two Sum duplicate numbers with solutions at the end")
	void testDuplicateNumbersWithSolutionsAtEnd(TestInfo testInfo) {
	
		int[] list = new int[] { 3, 1, 7, 9, 5, 5 };
		int sum = 10;
		
		int[] indices = TwoSum.findTwoSum(list, sum);
		assertNotNull(indices, "list should not be null");
		
		boolean result = false;
		Arrays.sort(indices);
		if (
			(Arrays.binarySearch(indices, 0) >= 0 && Arrays.binarySearch(indices, 2) >= 0) ||
			(Arrays.binarySearch(indices, 1) >= 0 && Arrays.binarySearch(indices, 3) >= 0)
		) {
			result = true;
		}

		assertEquals(true, result, "Indices pair is not the correct one.");		
	}
	
	@Test
	@DisplayName("Two Sum duplicate numbers no solution")
	void testDuplicateNumbersNoSolution(TestInfo testInfo) {
	
		int[] list = new int[] { 3, 1, 5, 8, 1, 3 };
		int sum = 10;
		
		int[] indices = TwoSum.findTwoSum(list, sum);
		
		assertNull(indices, "list should be null");
	}
}
