package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 *
 * See README.md for more information
 *
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	/*
	 * Codility gives 84% (Correctness 71%, Performance 100%).
	 */
	public int solution(int[] A) {

		// Edge case: size is 2.
		if (A.length == 2) {
			return Math.abs(A[0] - A[1]);
		}

		/*
		 * The algorithm here is a bit tricky.
		 * We follow it so we can have the best performance
		 * from speed and memory perspective.
		 */

		// Here we create a running sum from i=2 to i=Length-1
		for (int i = 1; i < A.length - 1; i++) {
			A[i] = A[i] + A[i-1];
		}

		/*
		 * Here we parse the array from end to start.
		 * This way we can have the running sums in the array
		 * without the need for secondary storage.
		 *
		 *
		 */
		int minSum = Integer.MAX_VALUE;

		// Since we have a running sum from left to right,
		// we need a running sum from right to left.
		int runningSumFromRight = A[A.length - 1];

		for (int i = A.length - 2; i > 0; i--) {
			// Let's compare the sums.
			int leftSum = A[i];
			int rightSum = runningSumFromRight;
			int abs = Math.abs(rightSum - leftSum);
			if (abs < minSum) {
				minSum = abs;
			}

			// Value of A[i] is the difference of the current node
			// and the previous one.
			int Ai = A[i] - A[i-1];

			runningSumFromRight += Ai;
		}

		return minSum;
    }
}