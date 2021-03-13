package com.dkafetzi.kata;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_double_slice_sum/
 *
 * See README.md for more information
 *
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	/*
	 * O(n)
	 * How to achive this?
	 * See https://curt-park.github.io/2018-09-14/algorithm-max-double-slice-sum/.
	 */

	/*
	 * O(n ^ 2)
	 * This is incorrect. There are edge cases that it fails.
	 * Codility https://app.codility.com/demo/results/trainingA5G6DH-854/
	 * 38% overall, 50% correctness but 28% performance.
	 *
	 */
	public int solutionOn2(int[] A) {
		int maximumSumDoubleSlice = Integer.MIN_VALUE;
		int length = A.length;

		// Edge cases.
		if (length <=3 ) {
			return 0;
		}

		// Let's calculate the running sums from left and right.
		int[] runningSumLeft = new int[length];
		runningSumLeft[0] = 0;
		runningSumLeft[length - 1] = 0;
		for (int i = 1; i < length - 1; i++) {
			runningSumLeft[i] = runningSumLeft[i-1] + A[i];
		}
		LOGGER.info("runningSumLeft: {}", Arrays.toString(runningSumLeft));

		int[] runningSumRight = new int[length];
		runningSumRight[0] = 0;
		runningSumRight[length - 1] = 0;
		for (int i = length - 2; i > 0; i--) {
			runningSumRight[i] = runningSumRight[i+1] + A[i];
		}
		LOGGER.info("runningSumLeft: {}", Arrays.toString(runningSumRight));

		/*
		 * Now we will take a pivot for Y and calculate the maximum
		 * continuous sum left and right of it.
		 * Notes
		 *  * x, y, and z positions are not counted in.
		 */
		for (int y = 1; y < length - 1; y++) {
			LOGGER.info("y: {}, maximumSumDoubleSlice: {}", y, maximumSumDoubleSlice);

			// Find the max left of y.
			int sumMaxLeft = 0;
			if (y != 1) {
				sumMaxLeft = Integer.MIN_VALUE;
				for (int i = y-1; i > 0; i--) {
					LOGGER.info("y:{}, i: {}, maximumSumDoubleSlice: {}, sumMaxLeft: {}, runningSumRight[i]: {}, runningSumRight[y]: {}.",
							y, i,
							maximumSumDoubleSlice, sumMaxLeft,
							runningSumRight[i], runningSumRight[y]
							);
					if (sumMaxLeft < runningSumRight[i] - runningSumRight[y]) {
						sumMaxLeft = runningSumRight[i] - runningSumRight[y];
					}
				}
			}

			// Find the max right of y.
			int sumMaxRight = 0;
			if (y != length - 2) {
				sumMaxRight = Integer.MIN_VALUE;
				for (int i = y+1; i < length-1; i++) {
					LOGGER.info("y:{}, i: {}, maximumSumDoubleSlice: {}, sumMaxRight: {}, runningSumLeft[i]: {}, runningSumLeft[y]: {}.",
							y, i,
							maximumSumDoubleSlice, sumMaxRight,
							runningSumLeft[i], runningSumLeft[y]
							);
					if (sumMaxRight < runningSumLeft[i] - runningSumLeft[y]) {
						sumMaxRight = runningSumLeft[i] - runningSumLeft[y];
					}
				}
			}

			LOGGER.info("y: {}, maximumSumDoubleSlice: {}, sumMaxLeft: {}, sumMaxRight: {}",
					y, maximumSumDoubleSlice,
					sumMaxLeft, sumMaxRight
					);
			if (maximumSumDoubleSlice < (sumMaxLeft + sumMaxRight) ) {
				maximumSumDoubleSlice = sumMaxLeft + sumMaxRight;
			}
		}

		return maximumSumDoubleSlice;
	}


	/*
	 * O(n^3)
	 * Codility https://app.codility.com/demo/results/trainingSX2K9W-M7V/
	 * 53% overall, 100% correctness but 14% performance.
	 */
	public int solutionOn3(int[] A) {
		int maximumSumDoubleSlice = 0;
		int length = A.length;

		// Edge cases.
		if (length <=3 ) {
			return maximumSumDoubleSlice;
		}

		LOGGER.debug(Arrays.toString(A));
		for (int x = 0; x < length - 2; x++) {
			for (int z = x + 2; z < length; z++) {
				for (int y = x + 1; y < z; y++) {

					LOGGER.debug("x: {}, y: {}: z: {}.", x, y, z);

					int tmpSum = 0;
					LOGGER.debug("tmpSum: {}.", tmpSum);
					if (y - x > 0) {
						for (int i = x + 1; i < y; i++) {
							LOGGER.debug("i:{}, A[i]:{}, tmpSum: {}.", i, A[i], tmpSum);
							tmpSum += A[i];
						}
					}

					if (z - y > 0) {
						for (int i = y + 1; i < z; i++) {
							LOGGER.debug("i:{}, A[i]:{}, tmpSum: {}.", i, A[i], tmpSum);
							tmpSum += A[i];
						}
					}

					if (tmpSum > maximumSumDoubleSlice) {
						maximumSumDoubleSlice = tmpSum;
					}
					LOGGER.debug("maximumSumDoubleSlice: {}.", maximumSumDoubleSlice);
				}
			}
		}

		return maximumSumDoubleSlice;
    }
}