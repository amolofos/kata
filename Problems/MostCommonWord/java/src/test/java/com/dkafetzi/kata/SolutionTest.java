package com.dkafetzi.kata;

import static org.junit.Assert.assertEquals;

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
		 * Input: 
		 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
		 * banned = ["hit"]
		 * Output: "ball"
		 * Explanation: 
		 *   "hit" occurs 3 times, but it is a banned word.
		 *   "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
		 *   Note that words in the paragraph are not case sensitive,
		 *   that punctuation is ignored (even if adjacent to words, such as "ball,"), 
		 *   and that "hit" isn't the answer even though it occurs more because it is banned.
		 */
		String input = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		String expectedOutput = "ball";
		
		Solution solution = new Solution();
		String output = solution.mostCommonWordOnePass(input, banned);

		LOGGER.info("Input: {}, banned: {}, Expected output: {}, Output: {}.", input.toString(), banned, expectedOutput, output);
		assertEquals(expectedOutput, output);

		output = solution.mostCommonWordPipeline(input, banned);

		LOGGER.info("Input: {}, banned: {}, Expected output: {}, Output: {}.", input.toString(), banned, expectedOutput, output);
		assertEquals(expectedOutput, output);
	}
}