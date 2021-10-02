/*
 * Could not figure it out on my own. Had to read througyh
 * https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/solution/
 * 
 */
package com.dkafetzi.kata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

	public int maxLengthBruteForceHashSet(List<String> A) {
		int result = 0;
		ArrayList<String> possibleResults = new ArrayList<String>();
		possibleResults.add("");
		
		for (String s : A) {
	
	        int endIdx = possibleResults.size();
	        for (int i = 0; i < endIdx; i++) {

	            String newPossibleResult = possibleResults.get(i) + s;
	            Set<Character> newPossibleResultSet = new HashSet<>();
	            for (char c : newPossibleResult.toCharArray())
	            	newPossibleResultSet.add(c);
	
	            // Do we have duplicates?
	            if (newPossibleResult.length() != newPossibleResultSet.size())
	                continue;
	
	            // Add valid options to results and
	            // keep track of the longest so far
	            possibleResults.add(newPossibleResult);
	            result = Math.max(result, newPossibleResult.length());
	        }
	    }
	
		return result;
	}
	
	public int maxLengthBruteForceBitwise(List<String> A) {
		int result = 0;

	    Set<Integer> possibleResults = new HashSet<Integer>();
	    possibleResults.add(0);

	    for (String s : A) 
	    	result = Math.max(result, addWord(s, possibleResults));
	    return result;
	}
	
	private int addWord(String s, Set<Integer> possibleResults) {
	    // Initialize an integer to use as a character set.
	    int charBitSet = 0;
	    
	    int max = 0;
	    for (char c : s.toCharArray()) {
	        // Define character mask for current char.
	        int mask = 1 << c - 'a';
	
	        // Do we have duplicates?
	        if ((charBitSet & mask) > 0)
	            return max;
	
	        // Mark char as seen in charBitSet.
	        charBitSet += mask;
	    }
	
	    // If the initial bitset is already a known result,
	    // then any possible new results will have already been found.
	    if (possibleResults.contains(charBitSet))
	        return max;
	
	    // Iterate through previous results only.
	    Set<Integer> newResults = new HashSet<>();
	    for (Integer res : possibleResults) {
	    	// Do we have duplicates?
	        if ((res & charBitSet) > 0)
	            continue;
	
	        // Build the new entry with bit manipulation.
	        int newResLen = (res >> 26) + s.length();
	        int newCharBitSet = (charBitSet + res) & ((1 << 26) - 1);
	
	        // Merge the two into one, add it to results,
	        // and keep track of the longest so far.
	        newResults.add((newResLen << 26) + newCharBitSet);
	        max = Math.max(max, newResLen);
	    }
	    possibleResults.addAll(newResults);

	    return max;
	}
}