package com.dkafetzi.kata.hackerrank.array2D;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dkafetzi.kata.KataSettings;
import com.dkafetzi.kata.hackerrank.countingValleys.CountingValleys;

@Service
public class Array2D {

	private final static Logger LOGGER = LoggerFactory.getLogger(Array2D.class);
	
	@Autowired
	private KataSettings settings;
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = false;
    
    /*
     * https://www.hackerrank.com/challenges/2d-array/problem
     */
    static int hourglassSum(int[][] arr) {
    	int highestSum = -63;
    	int sum = 0;
		
    	for (int i = 0; i < 4; i++) {
    		for (int j = 0; j < 4; j++) {
    			if(enableLogging) {
    	    		LOGGER.info("Calc: i " + i + ", j " + j + ".");
    	    		LOGGER.info("Calc: " + arr[i][j] + ", " + arr[i][j + 1] + ", " + arr[i][j + 2] + ", " + arr[i + 1][j + 1] + ", " + arr[i + 2][j] + ", " + arr[i + 2][j + 1] + ", " + arr[i + 2][j + 2]);
    			}
    			
    			sum = arr[i][j]     + arr[i][j + 1]     + arr[i][j + 2]     +
    					              arr[i + 1][j + 1] +
    				  arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
    			
    			if(enableLogging)
    	    		LOGGER.info("Calc: i " + i + ", j " + j + " with sum " + sum + " against " + highestSum + ".");
    			
    			if (sum > highestSum) {
    				highestSum = sum;
    			}
    		}
    	}
    	
    	return highestSum;
    }
    
    static int hourglassSum(String input) {
		int[][] data = new int[6][6];
    	
    	String[] lines = input.split("\\r?\\n");
    	
    	for (int i = 0; i < 6; i++) {
    		String[] nums = lines[i].split(" ");
    		for (int j = 0; j < nums.length; j++) {
    			data[i][j] = Integer.parseInt(nums[j]);
    		}
    	}

    	if(enableLogging)
    		LOGGER.info("Calc: Time to calculate.");
    	
		return Array2D.hourglassSum(data);
    }

}