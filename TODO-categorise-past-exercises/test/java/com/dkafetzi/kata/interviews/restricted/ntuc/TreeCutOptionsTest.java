package com.dkafetzi.kata.interviews.restricted.ntuc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.interviews.restricted.ntuc.TreeCutOptions;

import org.junit.jupiter.api.Disabled;

class TreeCutOptionsTest {

	@Test
	@DisplayName("NTUC test two ways")
	void testTwoWays(TestInfo testInfo) {
		
		TreeCutOptions tree = new TreeCutOptions();
		
		/*
		 * Function should return 2.
		 * We can 
		 *  * cut the tree of height 5,
		 *  * or we can cut the last tree of height 4.
		 */
		int[] A = {3, 4, 5, 4};
		assertEquals(2, tree.solution(A), "There are 2 ways here.");
	}
	
	@Test
	@DisplayName("NTUC test zero ways")
	void testZeroWays(TestInfo testInfo) {

		TreeCutOptions tree = new TreeCutOptions();

		int[] A = {4, 5, 2, 3, 4};
		assertEquals(0, tree.solution(A), "There are 0 ways here.");
	}
	
	@Test
	@DisplayName("NTUC test 100.000 ordered ways")
	void testOneHundredThousandOrderedWays(TestInfo testInfo) {
		
		TreeCutOptions tree = new TreeCutOptions();

		/**
		 * There are 100.000 ways here. We can cut down any of these trees.
		 */
		int[] A = IntStream.range(1, 100000 + 1).toArray();
		assertEquals(100000, tree.solution(A), "There are 100000 ways here.");
	}
	
	/*
	 * TODO
	 *  This should be written to actually test performance.
	 */
	@Test
	@Disabled("This has not been implemented yet.")
	@DisplayName("NTUC test 100.000 unordered ways")
	void testOneHundredThousandUnOrderedWays(TestInfo testInfo) {
		
		TreeCutOptions tree = new TreeCutOptions();

		// Need to generate random integers.
		int[] A = IntStream.range(1, 100000 + 1).toArray();
		assertEquals(0, tree.solution(A), "There are 0 ways here.");
	}
}