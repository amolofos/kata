/*
 * See magic-square-forming-English.pdf under the
 * src/main/resources/com/dkafetzi/hackerrank/formingMagicSquare folder.
 *
 */
package com.dkafetzi.kata.hackerrank.formingMagicSquare;

public class FormingMagicSquare {

	// Complete the compareTriplets function below.
	static int formingMagicSquare(int[][] s) {
		int result = 0;
		int length = s.length;
		//  M = n(n^2+1)/2
		int magic_constant = length * (length * length + 1) / 2;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {

			}
		}

		return result;
	}

}