package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* https://leetcode.com/problems/fruit-into-baskets/
*
* See README.md for more information
*
*/
class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public int[] duplicateZerosOn2O1(int[] arr) {
		int jump = 1;
		for(int i = 0; i < arr.length; i += jump) {
			jump = 1;
			if(arr[i] != 0)
				continue;

			for(int j = arr.length - 1; j > i; j--) {
				arr[j] = arr[j-1];
			}

			if (i+1 < arr.length) arr[i+1] = 0;
			jump = 2;
		}
		return arr;
	}

    /*
     * Based on the following and a more complicated, longer version of mine.
     * https://leetcode.com/problems/duplicate-zeros/discuss/1374152/Perfect-Simple-Java-Solution-O(N)-time(2-Pass)-O(1)-space
     */
    public int[] duplicateZerosOnO1(int[] arr) {
        
        if (arr == null || arr.length <= 1)
            return arr;

        // Let's parse once to see how many zeros we have.
        int countZeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                countZeros++;
        }

         // Now that we know how many zeros there are,
         // we know how many of the shifted right 
         // elements we are going to discard. I.e.
         // equal to number of zeros.
            
        // Some special cases.
        if (countZeros == arr.length || countZeros == 0)
            return arr;

        //int runningPosition = 
        int runningZeros = countZeros;
        for (int i = arr.length - 1; i >= 0; i--) {
        	LOGGER.debug("i: {}, arr[{}]: {}, runningZeros: {}.", i, i, arr[i], runningZeros);

        	if (arr[i] == 0) {
        		// In case we have a zero element, do nothing. 
        		countZeros--;
        	}
        	else if (countZeros > 0) {
        		if (i + countZeros < arr.length)
        			arr[i + countZeros] = arr[i];
        		arr[i] = 0;
        	}
        }

        return arr;
        
        /* Longer version of mine
         * 
        if (arr.length <= 1)
            return;

        // Let's parse once to see how many zeros
        // we have so we know how many elements
        // we will discard in the end.
        int countZeros = 0;
        int lastValidElement = 0;
        int lastValidZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + countZeros == arr.length - 1) {
            	lastValidElement = i;
            	break;
            }

            if (arr[i] == 0) {
                countZeros++;
                lastValidZero = i;

                if (i + countZeros == arr.length - 1) {
                	lastValidElement = i;
                	break;
                }
            }
        }

        countZeros = arr.length - lastValidElement - 1;
 
        if (countZeros == arr.length || countZeros == 0)
            return;
        
        // Let's start from the right and move the elements
        // that we know they will remain.
        int runningElement = lastValidElement;
        while (countZeros > 0) {
        	
        	arr[runningElement + countZeros] = arr[runningElement];
        	if (arr[runningElement] == 0 && runningElement <= lastValidZero) {
        		//
        		arr[runningElement + countZeros - 1] = arr[runningElement];
        		countZeros--;
        	}

        	runningElement--;
        }

        return;
        */
    }
}
