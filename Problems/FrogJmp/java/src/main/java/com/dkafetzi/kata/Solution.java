package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 *
 * See README.md for more information
 *
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	/*
	 *
	 */
	public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		return (int) Math.ceil((double) (Y - X) / D);
    }
}