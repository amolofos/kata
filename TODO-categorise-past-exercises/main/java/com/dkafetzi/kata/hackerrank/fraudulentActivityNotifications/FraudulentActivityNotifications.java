package com.dkafetzi.kata.hackerrank.fraudulentActivityNotifications;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dkafetzi.kata.KataSettings;

@Service
public class FraudulentActivityNotifications {

	private final static Logger LOGGER = LoggerFactory.getLogger(FraudulentActivityNotifications.class);
	
	@Autowired
	private KataSettings settings;
	
    @Value("${app.logging.enabled:false}")
    static boolean enableLogging = false;
    
	private static ArrayList<Integer> runningMedian;
	
    /*
     * https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem
     */
    public static int activityNotifications(String input) {
    	runningMedian = new ArrayList<Integer>();

    	int[] data;
    	int d;
    	int length;
    	
    	String[] lines = input.split("\\r?\\n");
    	
    	// The first line is the size of the array.
    	length = Integer.parseInt(lines[0].split(" ")[0]);
    	d = Integer.parseInt(lines[0].split(" ")[1]);
    	if(enableLogging)
    		LOGGER.info("Starting creating the array of lenght " + length + ".");
    	data = new int[length];
    	if(enableLogging)
    		LOGGER.info("Finished creating the array.");

        // The second lines has the values.
    	String[] values = lines[1].split(" ");
        for (int i = 0; i < length; i++) {
        	//if(enableLogging)
        	//	LOGGER.info("Read: " + i + ", " + values[i] + ".");
            	
            data[i] = Integer.parseInt(values[i]);
        }
    	if(enableLogging)
    		LOGGER.info("Calc: Time to calculate.");
         	
        return calculateActivityNotifications(data, d);
    }
    
    private static int calculateActivityNotifications(int[] expenditure, int d) {
    	int notifications = 0;

    	// We start from the d day to calculate the notifications.
    	for (int i = d; i < expenditure.length; i++) {
    		double median = calculateMedian(expenditure, i - d, i) * 2;
        	if(enableLogging)
        		LOGGER.info("Calc: " + median + " against " + expenditure[i] + ".");
        	
    		if (expenditure[i] >= median) {
            	if(enableLogging)
            		LOGGER.info("Notif: " + i + ".");
    			notifications++;
    		}
    	}
    	
    	return notifications;
    }
    
    private static double calculateMedian(int[] expenditure, int start, int end) {
    	/* 
    	 * Note: The median of a list of numbers can be found by arranging all the numbers
    	 * from smallest to greatest. If there is an odd number of numbers, the middle one is picked.
    	 * If there is an even number of numbers, median is then defined to be the average of the two
    	 * middle values. (Wikipedia)
    	 */
    	double median = 0.00;
    	
    	if(enableLogging)
    		LOGGER.info("Calc: start " + start + ", end " + end + ".");
    	
    	if (runningMedian.isEmpty()) {
        	if(enableLogging)
        		LOGGER.info("Calc: median is empty.");
        	
    		// First run. Let's populate it and sort it at the same time.
        	for (int i = start; i < end; i++) {
        		int intToAdd = expenditure[i];
       		
				if (runningMedian.isEmpty() || intToAdd <= runningMedian.get(0)) {
					if(enableLogging)
						LOGGER.info("Calc: adding " + intToAdd + " in 0.");
   					runningMedian.add(0, intToAdd);
   					continue;
   				}

   				if (intToAdd >= runningMedian.get(runningMedian.size() - 1)) {
   		        	if(enableLogging)
   		        		LOGGER.info("Calc: adding " + intToAdd + " in " + runningMedian.size() + ".");
   					runningMedian.add(intToAdd);
   					continue;
   				}
   				
        		// We should add it in a sorted way from the beginning.
       			for (int j = 0; j < runningMedian.size(); j++) {
       	        	if(enableLogging)
       	        		LOGGER.info("Calc: comparing " + intToAdd + " against " + runningMedian.get(j) + " of runningMedian size " +  runningMedian.size() + ".");
                 
       				if (intToAdd <= runningMedian.get(j)) {
       		        	if(enableLogging)
       		        		LOGGER.info("Calc: adding " + intToAdd + " in " + j + ".");
                            
       					runningMedian.add(j, intToAdd);
       					break;
        			}
        		}
        	}
    	} else {
    		// Subsequent run. We just need to remove the first and add the last one.
    		
    		// Remove the first value of the previous run.
    		Integer intToRemove = expenditure[start - 1];
        	if(enableLogging)
        		LOGGER.info("Calc: removing " + intToRemove + ".");
        	
    		runningMedian.remove(intToRemove);
    		
    		// Add the last one from the current run.
    		int intToAdd = expenditure[end - 1];
			if (intToAdd <= runningMedian.get(0)) {
				if(enableLogging)
					LOGGER.info("Calc: adding " + intToAdd + " in 0.");
	        	
				runningMedian.add(0, intToAdd);
				
			} else if (intToAdd >= runningMedian.get(runningMedian.size() - 1)) {
				if(enableLogging)
					LOGGER.info("Calc: adding " + intToAdd + " in " + runningMedian.size() + ".");
		        	
				runningMedian.add(runningMedian.size(), intToAdd);
				
			} else {
			
    			for (int j = 0; j < runningMedian.size(); j++) {   				
    				if (intToAdd <= runningMedian.get(j)) {
    					if(enableLogging)
    						LOGGER.info("Calc: adding " + intToAdd + " at " + j + ".");
		            
    					runningMedian.add(j, intToAdd);
    					break;
    				}
    			}
    		}
    	}
    	

    	if(enableLogging) {
    		for (int j = 0; j < runningMedian.size(); j++) {
    			LOGGER.info("Calc: runningMedian " + j + ", " + runningMedian.get(j) + " of size " + runningMedian.size() + ".");
    		}
    		LOGGER.info("Calc: runningMedian " + runningMedian.toString() + ".");
    	}

    	
    	// Get median
   	 	int size = runningMedian.size();
    	if ((size + 1) % 2 == 0) {
    		// Odd
    		int position = ((size + 1) / 2) - 1;
        	if(enableLogging)
        		LOGGER.info("Calc: size " + size + " with odd median " + runningMedian.get(position) + " at " + position + ".");

    		median = runningMedian.get(position);	
    	} else {
    		// Even
    		int floor =  (Math.floorDiv(size + 1, 2));
    		int ceiling = (int) (Math.ceil((size + 1.00) / 2.00));
        	if(enableLogging)
        		LOGGER.info("Calc: size " + size + " with even median " + runningMedian.get(floor) + " at " + floor + " and " + runningMedian.get(ceiling) + " at " + ceiling + ".");

    		median = (runningMedian.get(floor) + runningMedian.get(ceiling)) / 2.00;
    	}
    	
    	if(enableLogging)
    		LOGGER.info("Median: " + median + ".");
    	
    	return median;
    }
}