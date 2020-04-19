package com.dkafetzi.kata.hackerrank.countingValleys;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dkafetzi.kata.KataSettings;

@Service
public class CountingValleys {

	private final static Logger LOGGER = LoggerFactory.getLogger(CountingValleys.class);
	
	@Autowired
	private KataSettings settings;
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = true;
    
    /*
     * https://www.hackerrank.com/challenges/counting-valleys
     */
	static int countingValleys(int n, String s) {
		int valleys = 0;
		int sea_level = 0;
		int step_level = 0;
		boolean in_valley = false;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'U') {
				step_level++;
			} else if (s.charAt(i) == 'D') {
				step_level--;
			}
			
			if (!in_valley && step_level < sea_level) {
				valleys++;
				in_valley = true;
			}
			if (in_valley && step_level >= sea_level) {
				in_valley = false;
			}
		}
		
		return valleys;
    }
    
	static int countingValleys(String input) {
		String steps;
    	int size;
    	
    	String[] lines = input.split("\\r?\\n");
    	
    	// The first line is the size of the string.
    	size = Integer.parseInt(lines[0]);
    	steps = lines[1];
    	if(enableLogging)
    		LOGGER.info("Starting creating the array of lenght " + size + ".");

    	if(enableLogging)
    		LOGGER.info("Calc: Time to calculate.");
    	
		return CountingValleys.countingValleys(size, steps);
    }
}