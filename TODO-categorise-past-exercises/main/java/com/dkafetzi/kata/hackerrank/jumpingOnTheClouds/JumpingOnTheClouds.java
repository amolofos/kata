package com.dkafetzi.kata.hackerrank.jumpingOnTheClouds;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dkafetzi.kata.KataSettings;

@Service
public class JumpingOnTheClouds {

	private final static Logger LOGGER = LoggerFactory.getLogger(JumpingOnTheClouds.class);
	
	@Autowired
	private KataSettings settings;
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = true;
    
    /*
     * https://www.hackerrank.com/challenges/jumping-on-the-clouds
     */
	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		int cumulus = 0;
		int location = 0;
		boolean reached = false;

		while (!reached) {
	    	if(enableLogging)
	    		LOGGER.info("Checking location " + location + ".");
			
			if (location + 2 < c.length && c[location + 2] == cumulus) {
				if(enableLogging)
		    		LOGGER.info("Can jump two steps from location " + location + ".");
				
				jumps++;
				location += 2;
			} else if (location + 1 < c.length && c[location + 1] == cumulus) {
				if(enableLogging)
		    		LOGGER.info("Can jump one step from location " + location + ".");
				
				jumps++;
				location += 1;
			}
			
			// We can jump at the end!
			if (location + 2 == c.length) {
				if(enableLogging)
		    		LOGGER.info("We can jump at the end with two jumps.");

				jumps++;
				reached = true;
			} else if (location + 1 == c.length) {
				if(enableLogging)
		    		LOGGER.info("We can jump at the end with one jump.");
				
				reached = true;				
			}
		}
		
		return jumps;
    }
    
	static int jumpingOnClouds(String input) {
		int[] clouds;
    	int size;
    	
    	String[] lines = input.split("\\r?\\n");
    	
    	// The first line is the size of the string.
    	size = Integer.parseInt(lines[0]);
    	
    	if(enableLogging)
    		LOGGER.info("Starting creating the array of lenght " + size + ".");
    	clouds = new int [size];

    	// The second lines has the values.
    	String[] values = lines[1].split(" ");
        for (int i = 0; i < size; i++) {
        	clouds[i] = Integer.parseInt(values[i]);
        }

    	if(enableLogging)
    		LOGGER.info("Calc: Time to calculate.");
    	
		return JumpingOnTheClouds.jumpingOnClouds(clouds);
    }
}