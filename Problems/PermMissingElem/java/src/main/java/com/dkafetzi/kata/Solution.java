package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 *
 * See README.md for more information
 *
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	/*
	 *
	 */
	public int solution(int[] A) {
		int solution = 0;

		// Edge case: empty list.
		if (A.length == 0) {
			return 1;
		}

		/*
		 * Let's
		 *   * sum up all the numbers of the input Array
		 *   * find the maximum integer
		 */
		int sumInput = 0;
		int maxInput = 1;
		for (int i = 0; i < A.length; i++) {
			sumInput += A[i];
			if (maxInput < A[i]) {
				maxInput = A[i];
			}
		}

		// Let's sum up all the numbers from 0 to max.
		int sumTotal = 0;
		for (int i = 1; i <= maxInput; i++) {
			sumTotal += i;
		}

		solution = sumTotal - sumInput;

		// Do we have all the numbers and we are missing the N+1?
		if (solution == 0) {
			solution = maxInput + 1;
		}

		return solution;
    }
}