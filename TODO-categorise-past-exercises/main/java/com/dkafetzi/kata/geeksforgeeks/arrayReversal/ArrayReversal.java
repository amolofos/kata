/*
 * 
 * https://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/
 * 
 */
package com.dkafetzi.kata.geeksforgeeks.arrayReversal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dkafetzi.kata.KataSettings;

@Service
public class ArrayReversal {

	private final static Logger LOGGER = LoggerFactory.getLogger(ArrayReversal.class);
	
	
	@Autowired
	private KataSettings settings;
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = false;
    
    
    static String reverseArray (String input) {
    	String result = "";
    	
    	int rightParseIndex = input.length() - 1;
    	for (int i = 0; i < input.length(); i++) {
    		if (Character.isAlphabetic(input.charAt(i))) {
    			
    		}
    	}
    	
    	return result;
    }
}
	
	
	