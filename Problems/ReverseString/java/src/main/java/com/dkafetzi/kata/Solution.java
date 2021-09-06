package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/problems/positions-of-large-groups/
 *
 * See README.md for more information
 *
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public void reverseStringOn(char[] s) {
		char[] result = s.clone();
		
		for (int i = 0, j = s.length - 1; i < s.length && j >= 0; i++, j--) {
			s[i] = result[j];
		}
    }
	
	public void reverseStringO1(char[] s) {
		for (int i = 0; i < s.length / 2; i++) {
			char tmp = s[i];
			s[i] = s[s.length - i - 1];
			s[s.length - i - 1] = tmp;
		}
    }
}
