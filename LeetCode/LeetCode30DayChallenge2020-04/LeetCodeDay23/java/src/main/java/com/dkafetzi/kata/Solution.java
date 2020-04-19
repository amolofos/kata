package com.dkafetzi.kata;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3308/
 * 
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 * 
 * Example 1:
 * Input: [5,7]
 * Output: 4
 * 
 * Example 2:
 * Input: [0,1]
 * Output: 0
 * 
 */
public class Solution {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);


	/*
	 * ??
	 */
    public int rangeBitwiseAnd(int m, int n) {
		if (m == n)
			return m;
		
		while (m < n) {
			n = n & n - 1;
		}
		return n & m;
    }

    
    public int rangeBitwiseAndLargestLength(int m, int n) {
        ArrayList<Integer> bitList = new ArrayList<>();

        int power = 0;
        int cloneEnd = n;
        while (cloneEnd > 0) {
        	int valueOf2 = (int) Math.pow(2, power);
        	if (cloneEnd % valueOf2 == 0) {
        		bitList.add(0);
        	} else {
        		bitList.add(1);
        	}
        	cloneEnd /= 2;
        }
        
        int lengthOfRange = (m == 1) ? n - m + 2 : n - m + 1;
        int result = 0;
        for (int i = bitList.size() - 1; i >= 0; i--) {
        	int value = (int) Math.pow(2, i);
        	if (lengthOfRange <= value) {
        		result = result + value;
        	} else {
        		return result;
        	}
        }
        return result;
	}
    

	/*
	 * O(m-n)
	 */
    public int rangeBitwiseAndBruteForce(int m, int n) {
		int result = 0;
		
		if (m == 0 || n == 0) {
			return result;
		}
		
		result = m;
		for (int i = m + 1; i >= 0 && i <= n; i++) {
			LOGGER.debug("i: {}, result: {}.", i, result);
			result = result & i;
			LOGGER.debug("i: {}, result: {}.", i, result);

			if (result == 0) {
				break;
			}
			LOGGER.debug("i: {}, result: {}.", i, result);
		}
		
		return result;
    }
}