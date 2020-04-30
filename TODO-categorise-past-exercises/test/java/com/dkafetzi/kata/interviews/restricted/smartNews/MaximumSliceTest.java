package com.dkafetzi.kata.interviews.restricted.smartNews;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.interviews.restricted.smartNews.MaximumSlice;

class MaximumSliceTest {

	@Test
	@DisplayName("SmartNews simple test")
	void testSimple(TestInfo testInfo) {
		MaximumSlice solution = new MaximumSlice();
		
		int[] A = {5, 4, 4, 5, 0, 12};
		assertEquals(4, solution.solution(A), "Maximum slice for A is 4.");
		
		int[] B = {0, 1, 2, 3, 4, 5};
		assertEquals(2, solution.solution(B), "Maximum slice for B is 2.");
		
		int[] C = {5, 0, 1, 1, 1, 1, 0};
		assertEquals(6, solution.solution(C), "Maximum slice for C is 6.");
		
		int[] D = new int[0];
		assertEquals(0, solution.solution(D), "Maximum slice for D is 0.");
	}
}