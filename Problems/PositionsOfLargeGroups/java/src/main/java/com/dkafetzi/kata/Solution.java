package com.dkafetzi.kata;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/problems/positions-of-large-groups/
 * 
 * See README.md for more information
 *   
 */

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);
	
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (S.length() <= 0)
            return result;
            
        int startIndex = 0;
        int endIndex = 0;
        char charCurrent = S.charAt(0);
        
        for (int i = 0; i < S.length(); i++) {
        	LOGGER.info("Start: i: {}, startIndex: {}, endIndex: {}, charCurrent: {}.", i, startIndex, endIndex, charCurrent);
            if (S.charAt(i) == charCurrent) {
                endIndex = i;
                LOGGER.info("End  : i: {}, startIndex: {}, endIndex: {}, charCurrent: {}.", i, startIndex, endIndex, charCurrent);
                
                if (i != S.length() - 1)
                	continue;
            }

            int lengthCurr = endIndex - startIndex + 1;
            if (lengthCurr >= 3) {
            	List<Integer> tmp = new ArrayList<>();
            	tmp.add(startIndex);
            	tmp.add(endIndex);
                result.add(tmp);
            }
            
            startIndex = i;
            endIndex = i;
            charCurrent = S.charAt(i);
            LOGGER.info("End  : i: {}, startIndex: {}, endIndex: {}, charCurrent: {}.", i, startIndex, endIndex, charCurrent);
        }
        
        return result;
    }
}