package com.dkafetzi.kata.hackerrank.sockMerchant;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dkafetzi.kata.KataSettings;

@Service
public class SockMerchant {

	private final static Logger LOGGER = LoggerFactory.getLogger(SockMerchant.class);
	
	@Autowired
	private KataSettings settings;
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = true;
    
    /*
     * https://www.hackerrank.com/challenges/sock-merchant
     */
	static int sockMerchant(int n, int[] ar) {
		int pairs = 0;
		int max_colors = 101;

		// Let's count how many socks we have from each color.
		int[] colors = new int[max_colors];
		for (int i = 0; i < max_colors; i++) {
			colors[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			colors[ar[i]]++;
		}
		
		// Let's count the pairs that we have.
		for (int i = 0; i < max_colors; i++) {
			pairs += colors[i] / 2;
		}

		return pairs;
    }
    
	static int sockMerchant(String input) {
		int[] data;
    	int size;
    	
    	String[] lines = input.split("\\r?\\n");
    	
    	// The first line is the size of the array.
    	size = Integer.parseInt(lines[0]);
    	data = new int[size];
    	if(enableLogging)
    		LOGGER.info("Starting creating the array of lenght " + size + ".");

        // The second lines has the values.
    	String[] values = lines[1].split(" ");
        for (int i = 0; i < size; i++) {
            data[i] = Integer.parseInt(values[i]);
        }
        
    	if(enableLogging)
    		LOGGER.info("Calc: Time to calculate.");
    	
		return SockMerchant.sockMerchant(size, data);
    }
}