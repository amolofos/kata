/*
 * See a-very-big-sum-English.pdf under the
 * src/main/resources/com/dkafetzi/hackerrank/aVeryBigSum folder.
 *
 */
package com.dkafetzi.kata.hackerrank.aVeryBigSum;

public class AVeryBigSum {

	// Complete the compareTriplets function below.
	static long aVeryBigSum(long[] ar) {
		long result = 0;

		for (int i = 0; i < ar.length; i++) {
			result += ar[i];
		}

		return result;
	}

}