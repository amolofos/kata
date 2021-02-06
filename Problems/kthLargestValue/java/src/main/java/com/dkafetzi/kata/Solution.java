package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

/*
 *
 * See README.md for more information
 *   
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public int[] kthLargestValueNoBuiltInSort(int[] input, int k) {
    	int[] result = new int[k];

    	return result;
    }

    public int[] kthLargestValueBuiltInSort(int[] input, int k) {
    	int[] result = new int[k];
    	Set<Integer> treeSet = new TreeSet<Integer>(new ReversedComparator ());
    	
    	for (int i = 0; i < input.length; i++) {
    		treeSet.add(input[i]);
    	}

    	int runningSize = 0;
    	for (Integer i : treeSet) {
    		result[runningSize] = i;
    		runningSize++;
    		if (runningSize >= k)
    			break;
    	}

    	return result;
    }
}

class ReversedComparator implements Comparator<Integer> {
	
	@Override
    public int compare(Integer int1, Integer int2) {
        return int1.compareTo(int2) * -1;
    }
}