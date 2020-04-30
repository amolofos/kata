package com.dkafetzi.kata.geeksforgeeks.arrayReversal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

class ArrayReversalTest {
	
	StopWatch watch = new StopWatch();
	
	void runTestCase(String testCase) {
		String path_base = "geeksforgeeks/arrayReversal/testFiles/";
		String input;
		String output;
		String expected_output;
		
		try {
		
			input = Resources.toString(Resources.getResource(path_base + testCase + "_input.txt"), Charsets.UTF_8);
			expected_output = Resources.toString(Resources.getResource(path_base + testCase + "_output.txt"), Charsets.UTF_8).trim();
	    	
			watch.reset();
			watch.start();

	    	output = ArrayReversal.reverseArray(input);
	    	assertEquals(expected_output, output, "Strings do not match for.");
			
			watch.stop();
			System.out.println("Time Elapsed: " + watch.getTime(TimeUnit.SECONDS) + " seconds or " + watch.getTime(TimeUnit.MILLISECONDS) + " milliseconds.");
		} catch (IOException e) {
			System.err.println("Test: " + testCase + " errored with message" + e.toString() + ".");
			output = "Match";
			expected_output = "Do not match";
			
			assertEquals(expected_output, output, "Strings do not patch.");
		}
	}
	
	@Test
	@DisplayName("Test Case 00")
	void testCase00(TestInfo testInfo) {
		runTestCase("testCase00");
	}
}