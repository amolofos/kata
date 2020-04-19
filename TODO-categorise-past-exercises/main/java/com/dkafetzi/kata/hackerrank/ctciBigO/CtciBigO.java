package com.dkafetzi.kata.hackerrank.ctciBigO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dkafetzi.kata.KataSettings;

@Service
public class CtciBigO {

	private final static Logger LOGGER = LoggerFactory.getLogger(CtciBigO.class);
	
	@Autowired
	private KataSettings settings;
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = false;
    
    /*
     * https://www.hackerrank.com/challenges/ctci-big-o
     * https://en.wikipedia.org/wiki/Prime_numberLq
     * g
     */
	static String primality(int n) {
		boolean dividedByOthers = false;
		
		if (enableLogging)
			LOGGER.info("Calc: dealing with " + n + " number.");
		
		if (n == 1) {
			return "Not prime";
		}
		
		int i = 2;
		while (i <= Math.sqrt(n)) {
			if (enableLogging)
				LOGGER.info("Calc: dealing with " + n + " against " + i + ".");
			
			if (n % i == 0) {
				if (enableLogging)
					LOGGER.info("Calc: dividedByOthers " + dividedByOthers + " for " + n + " against " + i + ".");
					
				dividedByOthers = true;
				break;
			}

			if (i <= 10) {
				i++;
			} else {
				/*
				 * We try to be a bit clever here...
				 * ... i don't know if this actually helps.
				 * We are trying to skip numbers above 10 that
				 * end on 0, 2, 4, 5, 6 and 8 since we know they
				 * are not primes.
				 * 
				 */
				String str = String.valueOf(i);
				
				switch (str.charAt(str.length() - 1)) {
					case '1':
						i += 2;
						break;
					case '3':
						i += 4;
						break;
					case '7':
					case '9':
						i += 2;
						break;
					default:
						if (enableLogging)
							LOGGER.info("Calc: Doing nothing for " + i + ".");
						break;
				}
			}
		}
		
		return dividedByOthers ? "Not prime" : "Prime";
    }

}