package com.dkafetzi.kata.hackerrank.compareTheTriplets;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.hackerrank.compareTheTriplets.CompareTheTriplets;

class CompareTheTripletsTest {

	@Test
	@DisplayName("Simple test")
	void testSimple(TestInfo testInfo) {
		List<Integer> actual_result = new ArrayList<Integer>();
		List<Integer> expected_result = new ArrayList<Integer>();
		List<Integer> input_alice = new ArrayList<Integer>();
		List<Integer> input_bob = new ArrayList<Integer>();

		input_alice.add(1);
		input_alice.add(14);
		input_alice.add(1);
		input_bob.add(5);
		input_bob.add(3);
		input_bob.add(1);

		// Alice score.
		expected_result.add(1);
		// Bob score.
		expected_result.add(1);

		actual_result = CompareTheTriplets.compareTriplets(input_alice, input_bob);

		assertEquals(expected_result, actual_result, "Wrong answer.");
	}
}
