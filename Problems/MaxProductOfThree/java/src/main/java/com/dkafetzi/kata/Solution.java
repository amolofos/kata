package com.dkafetzi.kata;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
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
		int length = A.length;

		// Edge case:
		if (length == 3) {
			return A[0] * A[1] * A[2];
		}
		
		/*
		 * The maximum triplet will be the one that is produced by
		 *   * the three biggest integers in the array
		 *   * or the two lowest negatives and the biggest integer
		 * This becomes just a problem finding the 3 biggest integers
		 * and the 2 lowest ones. 
		 */

		// First three contain the biggest and the last two contain the smallest.
		int[] max = new int[5];
		for (int i = 0; i < 3; i++) {
			max[i] = Integer.MIN_VALUE;
		}
		for (int i = 3; i < 5; i++) {
			max[i] = Integer.MAX_VALUE;
		}
		
		for (int i = 0; i < length; i++) {
			int tmp1 = A[i];
			int tmp2 = tmp1;

			// Biggest.
			if (tmp1 >= max[0]) {
				tmp1 = max[0];
				max[0] = tmp2;
			}
			
			if (tmp1 >= max[1]) {
				tmp2 = tmp1;
				tmp1 = max[1];
				max[1] = tmp2; 
			}
			
			if (tmp1 >= max[2]) {
				max[2] = tmp1; 
			}
			
			// Smallest.
			tmp1 = A[i];
			tmp2 = tmp1;
			if (tmp1 <= max[3]) {
				tmp1 = max[3];
				max[3] = tmp2;
			}
			
			if (tmp1 <= max[4]) {
				max[4] = tmp1; 
			}
		}

		int countNeg = 0;
		for (int i = 3; i < 5; i++) {
			if (max[i] < 0) {
				countNeg++;
			};
		}

		solution = max[0] * max[1] * max[2];
		if (countNeg == 2) {
			solution = Math.max(solution, max[0] * max[3] * max[4]);
		}

		return solution;
    }
}