package com.dkafetzi.kata;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class SolutionTest {

	private final static Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);
	
	@Test
	@DisplayName("Simple test 1")
	void testSolution1(TestInfo testInfo) {
		LOGGER.debug("Simple test 1");

		/* Example 1
		 * Given nums = [2, 7, 11, 15], target = 9,
		 * Because nums[0] + nums[1] = 2 + 7 = 9,
		 * return [0, 1].
		 * 
		 */
		int[] input = {2, 7, 11, 15};
		int target = 9;
		int[] expectedOutput = {0, 1};
		
		Solution solution = new Solution();
		int[] output = solution.twoSum(input, target);
		
		LOGGER.info("Input: {}, Target: {}, Expected output: {}, Output: {}.", input.toString(), target, expectedOutput, output);
			
		assertArrayEquals(expectedOutput, output);	
	}
}