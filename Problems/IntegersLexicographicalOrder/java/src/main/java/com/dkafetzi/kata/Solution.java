package com.dkafetzi.kata;

import java.util.Arrays;
import java.util.Comparator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 *
 * See README.md for more information
 *   
 */
class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public int[] integersLexicographicalOrder(int n) {
    	int[] result = new int[n];

    	// Create the array with the integers.
    	for (int i = 0; i < n; i++) {
    		result[i] = i + 1;
    	}

    	// We need to sort the numbers legicographically.
    	// Radix sort: https://www.geeksforgeeks.org/radix-sort/.

    	return result;
    }

    public int[] integersLexicographicalOrderComparator(int n) {
    	Integer[] tmp = new Integer[n];
    	int[] result = new int[n];

    	// Create the array with the integers.
    	for (int i = 0; i < n; i++) {
    		tmp[i] = i + 1;
    	}

    	// We need to sort the numbers legicographically.
    	Arrays.sort(tmp, lexCompare);

    	for (int i = 0; i < n; i++) {
    		result[i] = tmp[i];
    	}

    	return result;
    }

	Comparator<Integer> lexCompare = new Comparator<Integer>() {
		public int compare(Integer x, Integer y) {
			return x.toString().compareTo(y.toString());
		}
	};
}