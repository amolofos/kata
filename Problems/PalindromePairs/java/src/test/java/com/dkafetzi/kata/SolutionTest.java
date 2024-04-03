package com.dkafetzi.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class SolutionTest {

	private final static Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);

	@Test
	@DisplayName("Simple test 1")
	void testSolution1(TestInfo testInfo) {
		LOGGER.debug("Simple test 1");
	
		/*
		 * Example 1:
		 * Input: ["abcd","dcba","lls","s","sssll"]
		 * Output: [[0,1],[1,0],[3,2],[2,4]]
		 */
		String[] input = {"abcd", "dcba", "lls", "s", "sssll"};
		List<List<Integer>> expectedOutput = new LinkedList<List<Integer>>();
		List<Integer> tmp = new LinkedList<Integer>();
		tmp.add(0);
		tmp.add(1);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(1);
		tmp.add(0);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(3);
		tmp.add(2);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(2);
		tmp.add(4);
		expectedOutput.add(tmp);
		
		Solution solution = new Solution();
		List<List<Integer>> output;

		output = solution.palindromePairsOn2mO1(input.clone());
		LOGGER.info("O(n^2 * m), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	    
		output = solution.palindromePairsOnm2On(input.clone());
		LOGGER.info("O(n * m^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testSolution2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");
	
		/*
		 * Example 2:
		 * Input: ["bat","tab","cat"]
		 * Output: [[0,1],[1,0]]
		 */
		String[] input = {"bat", "tab", "cat"};
		List<List<Integer>> expectedOutput = new LinkedList<List<Integer>>();
		List<Integer> tmp = new LinkedList<Integer>();
		tmp.add(0);
		tmp.add(1);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(1);
		tmp.add(0);
		expectedOutput.add(tmp);
		
		Solution solution = new Solution();
		List<List<Integer>> output;

		output = solution.palindromePairsOn2mO1(input.clone());
		LOGGER.info("O(n^2 * m), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	    
		output = solution.palindromePairsOnm2On(input.clone());
		LOGGER.info("O(n * m^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testSolution3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");
	
		/*
		 * Example 3:
		 * Input: ["a",""]
		 * Output: [[0,1],[1,0]]
		 */
		String[] input = {"a", ""};
		List<List<Integer>> expectedOutput = new LinkedList<List<Integer>>();
		List<Integer> tmp = new LinkedList<Integer>();
		tmp.add(0);
		tmp.add(1);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(1);
		tmp.add(0);
		expectedOutput.add(tmp);
		
		Solution solution = new Solution();
		List<List<Integer>> output;

		output = solution.palindromePairsOn2mO1(input.clone());
		LOGGER.info("O(n^2 * m), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	    
		output = solution.palindromePairsOnm2On(input.clone());
		LOGGER.info("O(n * m^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	}
	
	@Test
	@DisplayName("Simple test 4")
	void testSolution4(TestInfo testInfo) {
		LOGGER.debug("Simple test 4");
	
		/*
		 * Test case:
		 * Input: ["a"]
		 * Output: []
		 */
		String[] input = {"a"};
		List<List<Integer>> expectedOutput = new LinkedList<List<Integer>>();
		
		Solution solution = new Solution();
		List<List<Integer>> output;

		output = solution.palindromePairsOn2mO1(input.clone());
		LOGGER.info("O(n^2 * m), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	    
		output = solution.palindromePairsOnm2On(input.clone());
		LOGGER.info("O(n * m^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	}
	
	@Test
	@DisplayName("Simple test 5")
	void testSolution5(TestInfo testInfo) {
		LOGGER.debug("Simple test 5");
	
		/*
		 * Test case:
		 * Input: []
		 * Output: []
		 */
		String[] input = {};
		List<List<Integer>> expectedOutput = new LinkedList<List<Integer>>();
		
		Solution solution = new Solution();
		List<List<Integer>> output;

		output = solution.palindromePairsOn2mO1(input.clone());
		LOGGER.info("O(n^2 * m), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	    
		output = solution.palindromePairsOnm2On(input.clone());
		LOGGER.info("O(n * m^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	}
	
	@Test
	@DisplayName("Simple test 6")
	void testSolution6(TestInfo testInfo) {
		LOGGER.debug("Simple test 6");
	
		/*
		 * Test case:
		 * Input: null
		 * Output: []
		 */
		List<List<Integer>> expectedOutput = new LinkedList<List<Integer>>();
		
		Solution solution = new Solution();
		List<List<Integer>> output;
	    
		output = solution.palindromePairsOn2mO1(null);
		LOGGER.info("O(n^2 * m), O(1): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	    
		output = solution.palindromePairsOnm2On(null);
		LOGGER.info("O(n * m^2), O(n): input: {}, Expected output: {}, Output: {}.", null, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	}
	
	@Test
	@DisplayName("Simple test 7")
	void testSolution7(TestInfo testInfo) {
		LOGGER.debug("Simple test 7");
	
		/*
		 * Test case:
		 * Input: ["a","abc","aba",""]
		 * Output: [[0,3],[3,0],[2,3],[3,2]]
		 */
		String[] input = {"a", "abc", "aba", ""};
		List<List<Integer>> expectedOutput = new LinkedList<List<Integer>>();
		List<Integer> tmp = new LinkedList<Integer>();
		tmp.add(0);
		tmp.add(3);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(3);
		tmp.add(0);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(2);
		tmp.add(3);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(3);
		tmp.add(2);
		expectedOutput.add(tmp);
		
		Solution solution = new Solution();
		List<List<Integer>> output;

		output = solution.palindromePairsOn2mO1(input.clone());
		LOGGER.info("O(n^2 * m), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	    
		output = solution.palindromePairsOnm2On(input.clone());
		LOGGER.info("O(n * m^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	}
	
	@Test
	@DisplayName("Simple test 8")
	void testSolution8(TestInfo testInfo) {
		LOGGER.debug("Simple test 8");
	
		/*
		 * Test case:
		 * Input: ["a","b","c","ab","ac","aa"]
		 * Output: [[3,0],[1,3],[4,0],[2,4],[5,0],[0,5]]
		 */
		String[] input = {"a", "b", "c", "ab", "ac", "aa"};
		List<List<Integer>> expectedOutput = new LinkedList<List<Integer>>();
		List<Integer> tmp = new LinkedList<Integer>();
		tmp.add(3);
		tmp.add(0);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(1);
		tmp.add(3);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(4);
		tmp.add(0);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(2);
		tmp.add(4);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(5);
		tmp.add(0);
		expectedOutput.add(tmp);
		tmp = new LinkedList<Integer>();
		tmp.add(0);
		tmp.add(5);
		expectedOutput.add(tmp);

		Solution solution = new Solution();
		List<List<Integer>> output;

		output = solution.palindromePairsOn2mO1(input.clone());
		LOGGER.info("O(n^2 * m), O(1): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	    
		output = solution.palindromePairsOnm2On(input.clone());
		LOGGER.info("O(n * m^2), O(n): input: {}, Expected output: {}, Output: {}.", input, expectedOutput, output);
	    assertTrue(expectedOutput.size() == output.size() && expectedOutput.containsAll(output) && output.containsAll(expectedOutput));
	}
}