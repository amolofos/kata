package com.dkafetzi.kata.elementsOfProgrammingInterviews.java.convertBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/*
 * Problem 1.1, pg. 2 : Write a function that performs base conversion. Specifically, the input
 * is an integer base b1, a string s, representing an integer x in base b1, and another integer base
 * b2; the output is the string representing the integer x in base b2. Assume 2 ≤ b1, b2 ≤ 16.
 * Use “A” to represent 10, “B” for 11, ..., and “F” for 15.
 */
public class ConvertBase {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(ConvertBase.class);
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = false;
    
	/*
	 * Our plan is to get stringBase1, convert it to a decimal integer and then
	 * convert the decimal into an integer of base2.
	 * 
	 */
	public static String convert(int base1, String stringBase1, int base2) {
		String result = "";
		int intDecimal = 0;
		boolean is_negative = stringBase1.substring(0, 0) == "-";
		
		if (enableLogging)
			LOGGER.info("Convert: start.");

		stringBase1.replaceAll("-", "");

		for (int i = 0; i < stringBase1.length(); i++) {
			if (enableLogging)
				LOGGER.info("Convert: Dealing with i={}, and intDecimal={}.", i, intDecimal);
			
			String decString = stringBase1.substring(stringBase1.length()-i-1, stringBase1.length()-i);
			int dec = 0;
			try {
				dec = Integer.parseInt(decString);
			} catch (NumberFormatException nfe) {
				// A is 65 in ASCII table. So we remove 55 to get 10, 11 etc.
				dec = (int) decString.charAt(0);
				dec -= 55; 
			}
			intDecimal += dec * Math.pow(base1, i);
		}

		do {
			int mod = intDecimal % base2;
			intDecimal = intDecimal / base2;
			
			String modString;
			if (mod >= 10) {
				// A is 65 in ASCII table. So we add 55 to get the respective character.
				mod += 55; 
				modString = String.valueOf((char) mod);
			} else {
				modString = String.valueOf(mod);
			}
			
			result = modString + result;
		} while (intDecimal >= 1);
		
		if (is_negative)
			result = "-" + Integer.toString(intDecimal);
		
		if (enableLogging)
			LOGGER.info("Convert: finish.");
		
		return result;
	}
}