package com.dkafetzi.kata;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class FirstUniqueTest {

	private final static Logger LOGGER = LoggerFactory.getLogger(FirstUniqueTest.class);
	
	@Test
	@DisplayName("Simple test 1")
	void testFirstUnique1(TestInfo testInfo) {
		LOGGER.debug("Simple test 1");

		/*
		 * Example 1:
		 * Input: 
		 *  ["FirstUnique","showFirstUnique","add","showFirstUnique","add","showFirstUnique","add","showFirstUnique"]
		 *  [[[2,3,5]],[],[5],[],[2],[],[3],[]]
		 * Output: 
		 *  [null,2,null,2,null,3,null,-1]
		 * Explanation: 
		 *  FirstUnique firstUnique = new FirstUnique([2,3,5]);
		 *  firstUnique.showFirstUnique(); // return 2
		 *  firstUnique.add(5);            // the queue is now [2,3,5,5]
		 *  firstUnique.showFirstUnique(); // return 2
		 *  firstUnique.add(2);            // the queue is now [2,3,5,5,2]
		 *  firstUnique.showFirstUnique(); // return 3
		 *  firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
		 *  firstUnique.showFirstUnique(); // return -1
		 */
		int[] initialInput = {2, 3, 5};
		FirstUnique firstUnique = new FirstUnique(initialInput);
		
		assertEquals(2, firstUnique.showFirstUnique());
		firstUnique.add(5);
		assertEquals(2, firstUnique.showFirstUnique());
		firstUnique.add(2);
		assertEquals(3, firstUnique.showFirstUnique());
		firstUnique.add(3);
		assertEquals(-1, firstUnique.showFirstUnique());
	}
	
	@Test
	@DisplayName("Simple test 2")
	void testFirstUnique2(TestInfo testInfo) {
		LOGGER.debug("Simple test 2");

		/*
		 * Example 2:
		 * Input: 
		 *  ["FirstUnique","showFirstUnique","add","add","add","add","add","showFirstUnique"]
		 *  [[[7,7,7,7,7,7]],[],[7],[3],[3],[7],[17],[]]
		 * Output: 
		 *  [null,-1,null,null,null,null,null,17]
		 * Explanation: 
		 *  FirstUnique firstUnique = new FirstUnique([7,7,7,7,7,7]);
		 *  firstUnique.showFirstUnique(); // return -1
		 *  firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7]
		 *  firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3]
		 *  firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3,3]
		 *  firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7,3,3,7]
		 *  firstUnique.add(17);           // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
		 *  firstUnique.showFirstUnique(); // return 17
		 */
		int[] initialInput = {7, 7, 7, 7, 7, 7};
		FirstUnique firstUnique = new FirstUnique(initialInput);
		
		assertEquals(-1, firstUnique.showFirstUnique());
		firstUnique.add(7);
		firstUnique.add(3);
		firstUnique.add(3);
		firstUnique.add(7);
		firstUnique.add(17);
		assertEquals(17, firstUnique.showFirstUnique());
	}
	
	@Test
	@DisplayName("Simple test 3")
	void testFirstUnique3(TestInfo testInfo) {
		LOGGER.debug("Simple test 3");

		/*
		 * Example 3:
		 * Input: 
		 *  ["FirstUnique","showFirstUnique","add","showFirstUnique"]
		 *  [[[809]],[],[809],[]]
		 * Output: 
		 *  [null,809,null,-1]
		 * Explanation: 
		 *  FirstUnique firstUnique = new FirstUnique([809]);
		 *  firstUnique.showFirstUnique(); // return 809
		 *  firstUnique.add(809);          // the queue is now [809,809]
		 *  firstUnique.showFirstUnique(); // return -1
		 */
		int[] initialInput = {809};
		FirstUnique firstUnique = new FirstUnique(initialInput);
		
		assertEquals(809, firstUnique.showFirstUnique());
		firstUnique.add(809);
		assertEquals(-1, firstUnique.showFirstUnique());
	}
}