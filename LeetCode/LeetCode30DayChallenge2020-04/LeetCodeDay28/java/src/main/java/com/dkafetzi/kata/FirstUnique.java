package com.dkafetzi.kata;

import java.util.HashMap;
import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3313/
 * 
 * You have a queue of integers, you need to retrieve the first unique integer in the queue.
 * 
 * Implement the FirstUnique class:
 *  FirstUnique(int[] nums) Initializes the object with the numbers in the queue.
 *  int showFirstUnique() returns the value of the first unique integer of the queue, and returns -1 if there is no such integer.
 *  void add(int value) insert value to the queue.
 * 
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
 *  
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
 *  
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
 * 
 * Constraints:
 *  1 <= nums.length <= 10^5
 *  1 <= nums[i] <= 10^8
 *  1 <= value <= 10^8
 *  At most 50000 calls will be made to showFirstUnique and add.
 *  
 */

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
class FirstUnique {

	private final static Logger LOGGER = LoggerFactory.getLogger(FirstUnique.class);
	
	private HashMap<Integer, Integer> occurences;
	private LinkedList<Integer> order;
	
	public FirstUnique(int[] nums) {
		occurences = new HashMap<Integer, Integer>();
		order = new LinkedList<Integer>();
		
		for (int n : nums) {
			this.add(n);
		}
	}

	public int showFirstUnique() {
		int result = -1;
		
		if (order.isEmpty() == false) {
			result = order.getFirst();
			LOGGER.debug("Show: first: {}.", result);
		}
		
		LOGGER.debug("Show: result: {}.", result);
		return result;
	}

	public void add(int value) {
		LOGGER.debug("Add: {}.", value);
		
		int n = occurences.getOrDefault(value, 0) + 1;
		if (n == 1) {
			LOGGER.debug("Adding: value: {}, n: 1.", value);
			occurences.put(value, n);
			order.add(value);
		} else {
			LOGGER.debug("Replacing: value: {}, n: {}.", value, n);
            occurences.remove(value);
			occurences.put(value, n);
			
			// We need to remove only the second time we see it.
			if (n == 2) {
				order.removeFirstOccurrence(value);
			}
		}
	}
}