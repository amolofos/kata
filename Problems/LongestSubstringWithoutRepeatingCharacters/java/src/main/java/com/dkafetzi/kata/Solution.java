package com.dkafetzi.kata;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public int lengthOfLongestSubstringOn2(String s) {
        int result = 0;
        
        LOGGER.info("s.length: {}, s: {}.", s.length(), s);
        if (s.length() <= 0)
        	return result;

        result = 1;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
        	for (int j = i; j < s.length(); j++) {
        		LOGGER.info("i: {}, j: {}, result: {}, map.size: {}.", i, j, result, map.size());
        		if (map.containsKey(s.charAt(j))) {
        			if (map.size() > result)
        				result = map.size();
        			
        			map.clear();
            		LOGGER.info("i: {}, j: {}, result: {}, map.size: {}.", i, j, result, map.size());
        			break;
        		}

        		map.put(s.charAt(j), s.charAt(j));
        		LOGGER.info("i: {}, j: {}, result: {}, map.size: {}.", i, j, result, map.size());
        	}
        }
        
        return result;
    }
    
    public int lengthOfLongestSubstringOn(String s) {
        int result = 0;

        if (s.length() <= 0)
        	return result;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0, start = 0; i < s.length(); i++) {
    		LOGGER.info("Start: i: {}, start: {}, result: {}, map.size: {}.", i, start, result, map.size());
    		LOGGER.info("Start: map: {}", map.toString());

        	if (map.containsKey(s.charAt(i))) {
        		int j = map.get(s.charAt(i));
        		
        		if (result < i - start)
        			result = i - start;

        		for (int k = j; k >= start; k--)
        			map.remove(s.charAt(k));

        		start = j + 1;
        	}
        	map.put(s.charAt(i), i);
        	
    		LOGGER.info("End: i: {}, start: {}, result: {}, map.size: {}.", i, start, result, map.size());
    		LOGGER.info("End: map: {}", map.toString());
        }
        if (result < map.size())
        	result = map.size();

        return result;
    }
}
