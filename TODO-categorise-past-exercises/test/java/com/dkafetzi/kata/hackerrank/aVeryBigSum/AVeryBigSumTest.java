package com.dkafetzi.kata.hackerrank.aVeryBigSum;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.hackerrank.aVeryBigSum.AVeryBigSum;

class AVeryBigSumTest {

	@Test
	@DisplayName("Simple test")
	void testSimple(TestInfo testInfo) {
		long actual_result = 0;
		long expected_result = 0;

		long[] input = new long[] {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		expected_result = Long.parseLong("5000000015");

		actual_result = AVeryBigSum.aVeryBigSum(input);

		assertEquals(expected_result, actual_result, "Wrong answer.");
	}

	@Test
	@DisplayName("Vert big number test")
	void testVeryBigNumber(TestInfo testInfo) {
		long actual_result = 0;
		long expected_result = 0;

		long[] input = new long[] {
			1001458909,
			1004570889,
			1007019111,
			1003302837,
			1002514638,
			1006431461,
			1002575010,
			1007514041,
			1007548981,
			1004402249
		};
		expected_result = Long.parseLong("10047338126");

		actual_result = AVeryBigSum.aVeryBigSum(input);

		assertEquals(expected_result, actual_result, "Wrong answer.");
	}

}
