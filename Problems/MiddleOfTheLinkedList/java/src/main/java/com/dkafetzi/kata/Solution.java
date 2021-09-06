package com.dkafetzi.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

	private final static Logger LOGGER = LoggerFactory.getLogger(Solution.class);

    public ListNode middleNode(ListNode head) {    	
    	int runningLength = 0;
    	ListNode runningNode = head;
    	ListNode runningNodeHalf = head;
    	
    	while (runningNode.next != null) {
    		runningLength++;
  
    		if (runningLength % 2 != 0)
    			runningNodeHalf = runningNodeHalf.next;
    		
    		runningNode = runningNode.next;
    	}
    	
    	return runningNodeHalf;
    }
}
