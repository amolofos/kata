package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 *
 * See README.md for more information
 *
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public int solution(int N) {
        // write your code in Java SE 8

		/*
		 * We will parse the number bit by bit.
		 * Once we find 2 1's then we are sure that we have reached a group.
		 * At that point we calculate the size, start from scratch (since we are
		 * at 1) and continue.
		 */
        int binaryGap = 0;

        int countOnes = 0;
        int countZeros = 0;
        while (N != 0) {
        	// N & 1 just brings the value of the most left bit.
            int tmp = N & 1;
            if (tmp == 0 && countOnes > 0) {
                countZeros++;
            } else if (tmp == 1) {
                countOnes++;
                if (countOnes == 2) {
                    if (binaryGap < countZeros) {
                        binaryGap = countZeros;
                    }
                    countOnes = 1;
                }
                countZeros = 0;
            }

            // Bit shift to the left.
            // We add 0's at the right.
            N = N >> 1;
        }

        return binaryGap;
    }
}