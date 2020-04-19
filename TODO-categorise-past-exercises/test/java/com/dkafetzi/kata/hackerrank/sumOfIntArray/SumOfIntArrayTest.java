package com.dkafetzi.kata.hackerrank.sumOfIntArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.hackerrank.sumOfIntArray.SumOfIntArray;



class SumOfIntArrayTest {

	@Test
	@DisplayName("Sum of int array test")
	void testSimple(TestInfo testInfo) {

		int[] input = new int[] {5, 3};
		int sum = SumOfIntArray.simpleArraySum(input);

		assertEquals(8, sum, "5 + 3 = 8");
	}
}
