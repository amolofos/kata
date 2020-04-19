package com.dkafetzi.kata;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class LRUCacheO1Test {

	private final static Logger LOGGER = LoggerFactory.getLogger(LRUCacheO1Test.class);
	
	@Test
	@DisplayName("Simple test 1")
	void testLRUCacheO11(TestInfo testInfo) {
		LOGGER.debug("Simple test 1");

		LRUCache solution = new LRUCacheO1(2);
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
	void testLRUCacheO12(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");
		
		LRUCache solution = new LRUCacheO1(2);
		solution.put(2, 1);
		solution.put(2, 2);
		assertEquals(2, solution.get(2));       // returns 2
		solution.put(1, 1);                     // evicts key 2, 1
		solution.put(4, 1);                     // evicts key 2, 2
		assertEquals(-1, solution.get(2));      // returns -1 (not found)
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testLRUCacheO13(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");
		
		LRUCache solution = new LRUCacheO1(2);
		assertEquals(-1, solution.get(2));
		solution.put(2, 6);
		assertEquals(-1, solution.get(1));
		solution.put(1, 5);
		solution.put(1, 2);
		assertEquals(2, solution.get(1));
		assertEquals(6, solution.get(2));
	}
}