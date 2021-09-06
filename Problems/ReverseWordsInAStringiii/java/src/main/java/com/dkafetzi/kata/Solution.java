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

	public String reverseWords1(String s) {
		String result = "";
		
		int lastSpace = -1;
		for (int i = 0; i < s.length(); i++) {
			int lastIndex = i;
			if (s.charAt(i) == ' ')
				lastIndex--;
			LOGGER.info("i: {}, sTmp[i]: {}, lastIndex: {}.", i, s.charAt(i), lastIndex);
				
			if (s.charAt(i) == ' ' || i == s.length() - 1) {
				for (int j = lastIndex; j > lastSpace; j--) {
					LOGGER.info("i: {}, j: {}: sTmp[j]: {}.", i, j, s.charAt(j));
					result += s.charAt(j);
				}
				lastSpace = i;
			}
			
			if (s.charAt(i) == ' ')
				result += ' ';
		}
				
		return result;
    }

	public String reverseWords2(String s) {
		String result = "";
		String resultTmp = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			char tmp = s.charAt(i);
            
			if (tmp != ' ')
				resultTmp += tmp;
		
			if (tmp == ' ' || i == 0) {
				if (result != "")
					 resultTmp += ' ';
				
				result = resultTmp + result;
				resultTmp = "";
			}
		}

		return result;
    }
}
