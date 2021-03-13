package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 * 
 * See README.md for more information
 *   
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	/*
	 * 
	 */
	public int solution(int X, int[] A) {
		int solution = -1;

		// Let's have an array checking the leaves we have in place.
		int[] leaves = new int[X + 1];
		for (int i = 0; i < X + 1; i++) {
			leaves[i]= 0;
		}
		
		// Helper count.
		int countLeaves = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] > X) {
				continue;
			}
			
			if (leaves[A[i]] == 0) {
				leaves[A[i]] = 1;
				countLeaves++;
			}
			
			if (countLeaves == X) {
				solution = i;
				break;
			}
		}
		
		return solution;
    }
}