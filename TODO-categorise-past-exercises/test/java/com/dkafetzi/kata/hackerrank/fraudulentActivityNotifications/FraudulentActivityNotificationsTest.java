package com.dkafetzi.kata.hackerrank.fraudulentActivityNotifications;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

class FraudulentActivityNotificationsTest {
	
	//FraudulentActivityNotifications fraud = new FraudulentActivityNotifications();
	StopWatch watch = new StopWatch();
	
	@Disabled("Explicitly Disabled")
	@Test
	@DisplayName("Simple tests")
	void testSimple(TestInfo testInfo) {
		String path_base = "hackerrank/fraudulentActivityNotifications/testFiles/";
		ArrayList<String> testCases = new ArrayList<String>();
		testCases.add("testCase00");
		testCases.add("testCase06");
		testCases.add("testCase07");
		
		// Too big input files.
		testCases.add("testCase01");
		testCases.add("testCase02");
		testCases.add("testCase03");
		
		
		String input;
		String output;
		String expected_output;

		for (int i = 0; i < testCases.size(); i++) {
			try {
				System.out.println("Test: " + testCases.get(i));
				
				input = Resources.toString(Resources.getResource(path_base + testCases.get(i) + "_input.txt"), Charsets.UTF_8);
				expected_output = Resources.toString(Resources.getResource(path_base + testCases.get(i) + "_output.txt"), Charsets.UTF_8).trim();
				
				watch.reset();
				watch.start();
				output = String.valueOf(FraudulentActivityNotifications.activityNotifications(input));
				watch.stop();
				System.out.println("Time Elapsed: " + watch.getTime(TimeUnit.SECONDS) + " seconds or " + watch.getTime(TimeUnit.MILLISECONDS) + " milliseconds.");
			} catch (IOException e) {
				System.err.println("Test: " + testCases.get(i) + " errored with message" + e.toString() + ".");
				output = "Match";
				expected_output = "Do not match";
			}

			assertEquals(expected_output, output, "Strings do not patch.");
		}
	}
}