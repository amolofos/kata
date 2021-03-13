package com.dkafetzi.kata;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 *
 * See README.md for more information
 *
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	/*
	 * Codility says that this solution is graded 100%.
	 * https://app.codility.com/demo/results/trainingN8Y52V-GET/
	 */
	public int solution(int[] A) {
        // write your code in Java SE 8
		int solution = 0;
		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			if (counts.containsKey(A[i])) {
				counts.remove(A[i]);
			} else {
				counts.put(A[i], i);
			}
		}

		for (Integer i : counts.keySet()) {
			solution = i;
			LOGGER.debug("Element is {} which was located at {} index.", i, solution);
			break;
		}

        return solution;
    }
}