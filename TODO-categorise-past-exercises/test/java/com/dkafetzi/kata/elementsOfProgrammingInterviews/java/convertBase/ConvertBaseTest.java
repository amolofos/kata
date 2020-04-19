package com.dkafetzi.kata.elementsOfProgrammingInterviews.java.convertBase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

class ConvertBaseTest {
	
	StopWatch watch = new StopWatch();
	
	void runTestCase(String testCase) {
		String path_base = "elementsOfProgrammingInterviews/convertBase/testFiles/";
		String input;
		String output;
		String expected_output;
		
		try {
		
			input = Resources.toString(Resources.getResource(path_base + testCase + "_input.txt"), Charsets.UTF_8);
			expected_output = Resources.toString(Resources.getResource(path_base + testCase + "_output.txt"), Charsets.UTF_8).trim();

			int base1 = Integer.parseInt(input.split(",")[0]);
			String stringBase1 = input.split(",")[1];
			int base2 = Integer.parseInt(input.split(",")[2]);
			
			watch.reset();
			watch.start();

	    	output = ConvertBase.convert(base1, stringBase1, base2);
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
	
	@Test
	@DisplayName("Test Case 01")
	void testCase01(TestInfo testInfo) {
		runTestCase("testCase01");
	}
}