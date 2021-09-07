package com.dkafetzi.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public boolean checkInclusionOn2(String s1, String s2) {
        boolean result = false;
        
        if (s1.length() > s2.length())
        	return result;
        
        HashMap<Character, Integer> mapS1 = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
        	int count = mapS1.getOrDefault(s1.charAt(i), 0);
        	mapS1.put(s1.charAt(i), ++count);
        }
        LOGGER.info("mapS1: {}", mapS1.toString());

        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            HashMap<Character, Integer> tmp = new HashMap<Character, Integer>();
            for (int j = i; j < i + s1.length(); j++) {
            	LOGGER.info("i: {}, j: {}, s2.charAt(j): {}.", i, j, s2.charAt(j));
            	int count = tmp.getOrDefault(s2.charAt(j), 0);
            	tmp.put(s2.charAt(j), ++count);
            }
            LOGGER.info("mapS1: {}, tmp: {}.", mapS1.toString(), tmp.toString());

        	if (mapS1.equals(tmp)) {
        		result = true;
        		break;
        	}
        }
        
        return result;
    }
}
