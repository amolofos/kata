package com.dkafetzi.kata.interviews.restricted.smartNews;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.interviews.restricted.smartNews.MaximumDistance;

class MaximumDistanceTest {

	@Test
	@DisplayName("SmartNews simple test")
	void testSimple(TestInfo testInfo) {
		MaximumDistance solution = new MaximumDistance();
		
		//int[] A = {4, 7, 3, 3, 5};
		//assertEquals(4, solution.solution(A), "Maximum distance for A is 4.");
		
		int[] B = {0, 3, 3, 7, 5, 3, 11, 1};
		assertEquals(7, solution.solution(B), "Maximum distance for B is 7.");
		
		int[] C = {1, 4, 7, 3, 3, 5};
		assertEquals(4, solution.solution(C), "Maximum distance for C is 4.");

	}
}