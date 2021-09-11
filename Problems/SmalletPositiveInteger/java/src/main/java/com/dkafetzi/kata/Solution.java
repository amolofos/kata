package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public int solutionOn2(int[] A) {
        // write your code in Java SE 8
        int result = 1;

        // Sort the integers.
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }

        if (A[0] > 1)
            return result;
        if (A[A.length - 1] <= 0)
            return result;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 0)
                continue;
            if (A[i] == result)
                result++;
        }

        return result;
    }
	
	/*
	 * We keep an array with the positive integers seen.
	 * We loop through the initial array once to count
	 * the available integers.
	 * We, then, loop through the count array and find
	 * the smaller integer.
	 * Time: O(2*n) = O(n)
	 * Space: O(1000000) = O(1)
	 */
	public int solutionOnO1000000(int[] A) {
        int result = 1;
        int[] seenIntegers = new int [1000001];

        /*
         * We loop through the array and move the integers
         */
        for (int i = 0; i < A.length; i++) {
        	if (A[i] <= 0)
        		continue;
        	seenIntegers[A[i]] = 1;	
        }
        
        for (int i = 1; i < seenIntegers.length; i++) {
        	if (seenIntegers[i] == 0) {
        		result = i;
        		break;
        	}
        }

        return result;
    }
	
	/*
	 * This is based on the answers provided in https://leetcode.com/problems/first-missing-positive/discuss/
	 *  * https://leetcode.com/problems/first-missing-positive/discuss/858526/Cyclic-Sort-Explained
	 *  * https://leetcode.com/problems/first-missing-positive/discuss/1227747/Java-Solution-with-Comments%3A-O(n)
	 *  
	 *  There are two tricks that we utilise here.
	 *   * We already have an array to store the results (i.e. input array).
	 *     So we move its elements to the corresponding index. E.g.
	 *     A[3] = 10 will be moved to A[10]. In the end, we pick up the index + 1
	 *     that does not have the same number stored into its cell.
	 *   * Secondly, since we are looking for the smallest positive integer, we
	 *     can ignore the negative, zero and larger than A.length numbers.
	 *      * Negative numbers and zero are not part of the solution, so we skip them.
	 *      * Numbers larger than A.length can be skipped as well. You see, the smallest
	 *        number that we are after is 1. In the worst case, all the cells will have
	 *        distinct numbers from 1 to A.length and the answer will be A.length + 1.
	 *        Therefore, we can skip them.
	 *
	 */
	public int solutionOnO1(int[] A) {
        // write your code in Java SE 8
        int result = -1;
        
        /*
         * We loop through the array and move the integers
         */
        int index = 0;
        while (index < A.length) {        	
        	int currentValue = A[index];
        	// -1 since 1 is located at zero.
        	int indexValue = currentValue > 0 && currentValue <= A.length ? A[currentValue - 1] : -0;

        	if (currentValue > 0 && currentValue <= A.length && currentValue != indexValue) {
            	A[index] = indexValue;
            	A[currentValue - 1] = currentValue;
            	continue;
        	}

        	index++;
        }
        
        for (int i = 0; i < A.length; i++) {
            if(A[i] != i + 1) {
                result = i + 1;
                break;
            }
        }

        if (result == -1)
        	result = A.length + 1;

        return result;
    }
}
