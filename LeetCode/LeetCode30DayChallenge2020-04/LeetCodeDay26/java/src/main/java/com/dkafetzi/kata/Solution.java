package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3311/
 * 
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * A subsequence of a string is a new string generated from the original string with some
 * characters(can be none) deleted without changing the relative order of the remaining
 * characters. (eg, "ace" is a subsequence of "abcde" while "aec" is not). A common
 * subsequence of two strings is a subsequence that is common to both strings.
 * 
 * If there is no common subsequence, return 0.
 * 
 * Example 1:
 * Input: text1 = "abcde", text2 = "ace" 
 * Output: 3  
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 * 
 * Example 2:
 * Input: text1 = "abc", text2 = "abc"
 * Output: 3
 * Explanation: The longest common subsequence is "abc" and its length is 3.
 * 
 * Example 3:
 * Input: text1 = "abc", text2 = "def"
 * Output: 0
 * Explanation: There is no such common subsequence, so the result is 0.
 * 
 * Constraints:
 *  1 <= text1.length <= 1000
 *  1 <= text2.length <= 1000
 * The input strings consist of lowercase English characters only.
 * 
 */
class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	/*
	 * Time: O(n ^ 3)
	 * Space: O(1)
	 */
    public int longestCommonSubsequenceBruteForce(String text1, String text2) {
    	int result = 0;
    	int iLength = text1.length();
    	int jLength = text2.length();
    	int runningMax = 0;

    	
    	
    	return result;
    }
}