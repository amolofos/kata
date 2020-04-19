package com.dkafetzi.kata.hackerrank.dagQueries;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

class DagQueriesTest {
	
	StopWatch watch = new StopWatch();
	
	void runTestCase(String testCase) {
		String path_base = "hackerrank/dagQueries/testFiles/";
		String input;
		String output;
		String expected_output;
		
		System.out.println("Test: " + testCase);
		try {
		
			input = Resources.toString(Resources.getResource(path_base + testCase + "_input.txt"), Charsets.UTF_8);
			expected_output = Resources.toString(Resources.getResource(path_base + testCase + "_output.txt"), Charsets.UTF_8).trim();
	    	
			watch.reset();
			watch.start();

	    	output = DagQueries.calcNewDag(input);
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
	
	@Test
	@DisplayName("Test Case 03")
	void testCase03(TestInfo testInfo) {
		runTestCase("testCase03");
	}
	
	@Test
	@DisplayName("Test Case 11")
	void testCase11(TestInfo testInfo) {
		runTestCase("testCase11");
	}
	
	@Test
	@DisplayName("Test Case 17")
	void testCase17(TestInfo testInfo) {
		runTestCase("testCase17");
	}
	
	@Test
	@DisplayName("Test Case 26")
	void testCase26(TestInfo testInfo) {
		runTestCase("testCase26");
	}
	
	@Test
	@DisplayName("Test Case 41")
	void testCase41(TestInfo testInfo) {
		runTestCase("testCase41");
	}
	
}