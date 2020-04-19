package com.dkafetzi.kata.testdome.java.twoSum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.dkafetzi.kata.testdome.java.twoSum.TwoSum;

class TwoSumDomeTestTest {

	@Test
	@DisplayName("Two Sum Testdome test")
	void testDomeTest(TestInfo testInfo) {
	
		int[] list = new int[] { 3, 1, 5, 7, 5, 9 };
		int sum = 10;
		
		int[] indices = TwoSum.findTwoSum(list, sum);
		
		assertNotNull(indices, "list should not be null");
		
		if (indices != null) { 
			assertEquals(10, list[indices[0]] + list[indices[1]], "list contains a sum to 10 pair.");
		}
	}
}
