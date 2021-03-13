package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
 * 
 * See README.md for more information
 *   
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	/*
	 * 
	 */
	public int[] solution(int N, int[] A) {
		int[] solution = new int[N];
		for (int i = 0; i < N; i++) {
			solution[i] = 0;
		}
		
		int runningMax = 0;
		int lastMax = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				
				if (solution[A[i]-1] < lastMax) {
					solution[A[i]-1] = lastMax;
				}
				solution[A[i]-1]++;

				if (solution[A[i]-1] > runningMax) {
					runningMax = solution[A[i]-1];
				}
			}
			
			if (A[i] == N+1) {
				lastMax = runningMax;
			}
		}
		
		for (int i = 0; i < N; i++) {
			if (solution[i] < lastMax) {
				solution[i] = lastMax;
			}
		}

		return solution;
    }
}