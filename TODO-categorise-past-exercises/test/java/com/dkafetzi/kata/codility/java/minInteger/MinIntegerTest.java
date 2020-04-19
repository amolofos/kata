package com.dkafetzi.kata.codility.java.minInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.codility.java.minInteger.MinInteger;

/*
 * TODO
 * This fails for chaotic input.
 */
class MinIntegerTest {

	@Test
	@DisplayName("minInteger simple test")
	void testSimple(TestInfo testInfo) {
		
		MinInteger mi = new MinInteger();
		
		int[] A = {1, 3, 6, 4, 1, 2};
		assertEquals(5, mi.solution(A), "Array should return 5.");
		
		int[] B = {1, 2, 3};
		assertEquals(4, mi.solution(B), "Array should return 4.");
		
		int[] C = {-1, -3};
		assertEquals(1, mi.solution(C), "Array should return 1.");
	}
}