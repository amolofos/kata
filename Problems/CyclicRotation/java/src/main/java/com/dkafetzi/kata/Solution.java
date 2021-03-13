package com.dkafetzi.kata;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 *
 * See README.md for more information
 *
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		int length = A.length;

		/*
		 *  First case:
		 *  Are we rotating for the whole length? Just return the array.
		 */
		if (length == K || (length < K && length % K == 0)) {
			return A;
		}

		/*
		 * Main algorithm.
		 * pre-i) We should not do unnecessary rotations.
		 *        We should get only the remainder of K,
		 *        based on the size of the array.
		 * i) Store the K data to a temp data.
		 * ii) Move the last parts to the beginning of the array.
		 * iii) Move the middle to the end of the array.
		 * iV) Move the temporary array to the middle.
		 */

		// pre-i
		if (K > length) {
			K = K % length;
		}

		// i
		int[] tmp = new int[K];
		for (int i = 0; i < K; i++) {
			tmp[i] = A[i];
		}

		// ii
		for (int i = length - K, j = 0; i < length && j < length; i++, j++) {
			A[j] = A[i];
		}
		
		// iii
		if (2 * K <= length) {			
			for (int i = length - 1, j = length - K - 1; i >= length - (length - 2 * K) && j >= K; i--, j--) {
				A[i] = A[j];
			}
		}

		// iv
		for (int i = K, j = 0; i < length && j < tmp.length; i++, j++) {
			A[i] = tmp[j];
		}

        return A;
    }
}