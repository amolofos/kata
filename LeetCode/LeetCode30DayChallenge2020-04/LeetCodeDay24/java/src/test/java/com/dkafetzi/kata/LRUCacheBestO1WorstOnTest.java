package com.dkafetzi.kata;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class LRUCacheBestO1WorstOnTest {

	private final static Logger LOGGER = LoggerFactory.getLogger(LRUCacheBestO1WorstOnTest.class);
	
	@Test
	@DisplayName("Simple test 1")
	void testLRUCacheBestO1WorstOn1(TestInfo testInfo) {
		LOGGER.debug("Simple test 1");

		LRUCache solution = new LRUCacheBestO1WorstOn(2);
		solution.put(1, 1);
		solution.put(2, 2);
		assertEquals(1, solution.get(1));       // returns 1
		solution.put(3, 3);                     // evicts key 2
		assertEquals(-1, solution.get(2));      // returns -1 (not found)
		solution.put(4, 4);                     // evicts key 1
		assertEquals(-1, solution.get(1));      // returns -1 (not found)
		assertEquals(3, solution.get(3));       // returns 3
		assertEquals(4, solution.get(4));       // returns 4
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testLRUCacheBestO1WorstOn2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");
		
		LRUCache solution = new LRUCacheBestO1WorstOn(2);
		solution.put(2, 1);
		solution.put(2, 2);
		assertEquals(2, solution.get(2));       // returns 2
		solution.put(1, 1);                     // evicts key 2, 1
		solution.put(4, 1);                     // evicts key 2, 2
		assertEquals(-1, solution.get(2));      // returns -1 (not found)
	}
}