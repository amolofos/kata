package com.dkafetzi.kata.hackerrank.repeatedString;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dkafetzi.kata.KataSettings;

@Service
public class RepeatedString {

	private final static Logger LOGGER = LoggerFactory.getLogger(RepeatedString.class);
	
	@Autowired
	private KataSettings settings;
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = true;
    
    /*
     * https://www.hackerrank.com/challenges/jumping-on-the-clouds
     */
	static long repeatedString(String s, long n) {
		char charToSearch = 'a';
		Long repeatedStringSize = n;
		Long occurences = (long) 0;
		int stringSize = s.length();
		
		// Special cases!!
		if (stringSize == 1) {
			if(enableLogging)
	    		LOGGER.info("Calc: Length == 1.");
			
			if (s.toCharArray()[0] == charToSearch) {
				occurences = repeatedStringSize;
			}
		} else {
			if(enableLogging)
	    		LOGGER.info("Calc: are we here with " + repeatedStringSize + "?");
			
			// How many times can we repeat the entire string based on repeatedStringSize?
			Long repeatedStringFull = repeatedStringSize / stringSize;
			if(enableLogging)
	    		LOGGER.info("Calc: repeatedStringFull " + repeatedStringFull + ", repeatedStringSize " + repeatedStringSize + ", stringSize " + stringSize + ".");
			
			for (int i = 0; i < stringSize; i++) {
				if (s.charAt(i) == charToSearch) {
					occurences++;
				}
			}
			occurences = repeatedStringFull * occurences; 
			
			if(enableLogging)
	    		LOGGER.info("Calc: Full length " + occurences + ".");
			
			// What part of the initial string can fit into the remaining length?
			String subString = s.substring(0, (int) Math.abs(repeatedStringSize - stringSize * repeatedStringFull));
			for (int i = 0; i < subString.length(); i++) {
				if (subString.charAt(i) == charToSearch) {
					occurences++;
				}
			}
		}
		
		return occurences;
    }
    
	static long repeatedString(String input) {
		long chars;
    	String repeatedString;
    	
    	String[] lines = input.split("\\r?\\n");

    	if(enableLogging)
    		LOGGER.info("Start: reading input.");
    	
    	// The first line is the size of the string.
    	repeatedString = lines[0];
    	chars = Long.parseLong(lines[1]);    	
    	
    	if(enableLogging)
    		LOGGER.info("Calc: Time to calculate.");
    	
		return RepeatedString.repeatedString(repeatedString, chars);
    }
}